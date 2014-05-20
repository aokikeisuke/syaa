//RegOutBeansで書いてた、データベースからデータを取ってきてリストに入れる処理です by 芹田
//というわけでRegOutって書いてあるところをEditに変えれば終わると思います。



package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.io.Serializable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class EditBeans implements Serializable {
	private String name;
	private String subname;
	private Date birthday;
	private String place;
	private String hobby;
	private String image;
	
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
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
	
	public static ArrayList<RegOutBeans>getInfos(){
	ArrayList<RegOutBeans> list = new ArrayList<RegOutBeans>();
	   Connection db = null;
	   PreparedStatement ps = null;
	   ResultSet rs = null;
	   try{
		   Context context = new InitialContext();
		   DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/");
		   db = ds.getConnection();
		   ps = db.prepareStatement("SELECT * FROM EMPLOYEE ORDER BY FSUBNAME,LSUBNAME");
		   rs = ps.executeQuery();
		     while(rs.next()){
		    	 RegOutBeans regoutbeans = new RegOutBeans();
		    	 regoutbeans.setName(rs.getString("FIRSTNAME") + rs.getString("LASTNAME"));
		    	 regoutbeans.setSubname(rs.getString("FSUBNAME") + rs.getString("LSUBNAME"));
		    	 regoutbeans.setBirthday(rs.getDate("BIRTHDAY"));
		    	 regoutbeans.setPlace(rs.getString("PLACE"));
		    	 regoutbeans.setHobby(rs.getString("HOBBY"));
		    	 regoutbeans.setImage(rs.getString("IMAGE"));
		    	 
		    	 list.add(regoutbeans);
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