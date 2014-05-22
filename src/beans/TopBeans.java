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
	private int id;
    
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
		   DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/test");
		   db = ds.getConnection();
		   ps = db.prepareStatement("SELECT ID, FIRSTNAME, LASTNAME, IMAGE FROM EMPLOYEE ORDER BY LSUBNAME, FSUBNAME");
		   rs = ps.executeQuery();
		     while(rs.next()){
		    	 TopBeans topbeans = new TopBeans();
		    	 topbeans.setName(rs.getString("LASTNAME") + rs.getString("FIRSTNAME"));
		    	 topbeans.setImage(rs.getString("IMAGE"));
		    	 topbeans.setId(rs.getInt("ID"));
		    	 
		    	 list.add(topbeans);
		     }
	   }catch(Exception e){
		   e.printStackTrace();
	   }finally{
		   try{
			   if(rs != null){rs.close();}		
			   if(ps != null){ps.close();}
			   if(db != null){db.close();}
		   }catch(Exception e){
			   e.printStackTrace();
		   }
	   }
	   return list;
}
}