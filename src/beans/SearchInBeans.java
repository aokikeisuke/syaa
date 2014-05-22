package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.catalina.connector.Request;



@SuppressWarnings("serial")
public class SearchInBeans implements Serializable{
	
	private String lastname;
	private String firstname;
	private String lsubname;
	private String fsubname;
	private String image;
	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLsubname() {
		return lsubname;
	}

	public void setLsubname(String lsubname) {
		this.lsubname = lsubname;
	}

	public String getFsubname() {
		return fsubname;
	}

	public void setFsubname(String fsubname) {
		this.fsubname = fsubname;
	}
	

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	public static ArrayList<String>names(String name){
		ArrayList<String> list = new ArrayList<String>();
		Connection db = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try{
			Context context= new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/test");
			db = ds.getConnection();
			ps = db.prepareStatement("SELECT * FROM employee ORDER BY LSUBNAME,FSUBNAME");
			rs = ps.executeQuery();
			
			while(rs.next()){
				SearchInBeans namess = new SearchInBeans();
				namess.setLastname(rs.getString("lastname"));
				namess.setFirstname(rs.getString("firstname"));
				namess.setLsubname(rs.getString("lsubname"));
				namess.setFsubname(rs.getString("fsubname"));
				namess.setImage(rs.getString("image"));
				
				String fullName =  namess.lastname + namess.firstname + namess.lsubname + namess.fsubname; 
				
				
				if(fullName.matches(".*" + name +".*") ){
					list.add(namess.lastname + namess.firstname + namess.image);
				}
				
						
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs != null){ rs.close();}
				if(ps != null){ ps.close();}
				if(db != null){ db.close();}
			}catch(Exception e){}
			
		}
		return list;
		
		
		
	}

	
	
}
