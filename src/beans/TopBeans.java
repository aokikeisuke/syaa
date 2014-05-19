package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.io.Serializable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public class TopBeans implements Serializable {
	private String name;
	private String image;
    
	
	
	
	
	   public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public static ArrayList<TopBeans>getInfos(){
	ArrayList<TopBeans> list = new ArrayList<TopBeans>();
	   Connection db = null;
	   PreparedStatement ps = null;
	   ResultSet rs = null;
	   try{
		   Context context = new InitialContext();
		   DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/");
		   db = ds.getConnection();
		   ps = db.prepareStatement("SELECT FIRSTNAME,LASTNAME,IMAGE FROM EMPLOYEE ORDER BY FSUBNAME,LSUBNAME");
		   rs = ps.executeQuery();
		     while(rs.next()){
		    	 TopBeans topbeans = new TopBeans();
		    	 topbeans.setName(rs.getString("FIRSTNAME") + rs.getString("LASTNAME"));
		    	 topbeans.setImage(rs.getString("IMAGE"));
		    	 
		    	 list.add(topbeans);
		     }
	   }catch(Exception e){
		   e.printStackTrace();
	   }finally{
		   try{
			   if(rs != null){rs.close();}		
			   if(ps != null){ps.close();}
			   if(db != null){db.close();}
		   }catch(Exception e){}
	   }
	   return list;
}
}