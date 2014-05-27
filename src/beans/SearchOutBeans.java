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
public class SearchOutBeans implements Serializable{
	
	private String lastname;
	private String firstname;
	private String lsubname;
	private String fsubname;
	private String image;
	private String id;
	private String allname;
	private String birthday;
	private String place;
	private String hobby;
	private String word;
	
	
	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getAllname() {
		return allname;
	}

	public void setAllname(String allname) {
		this.allname = allname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
	
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	
	public static ArrayList<SearchOutBeans>names(String name){
		ArrayList<SearchOutBeans> list = new ArrayList<SearchOutBeans>();
		Connection db = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
			
			try{
				Context context= new InitialContext();
				DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/test");
				db = ds.getConnection();
				ps = db.prepareStatement("SELECT * FROM employee ORDER BY LSUBNAME,FSUBNAME");
				
				rs = ps.executeQuery();
//				     while(rs.next()){
//				    	 TopBeans topbeans = new TopBeans();
//				    	 topbeans.setName(rs.getString("LASTNAME") + rs.getString("FIRSTNAME"));
//				    	 topbeans.setImage(rs.getString("IMAGE"));
//				    	 topbeans.setId(rs.getInt("ID"));
//				    	 
//				    	 list.add(topbeans);
			while(rs.next()){
				SearchOutBeans namess = new SearchOutBeans();
				namess.setId(rs.getString("ID"));
				namess.setLastname(rs.getString("LASTNAME"));
				namess.setFirstname(rs.getString("FIRSTNAME"));
				namess.setAllname(rs.getString("LASTNAME")+rs.getString("FIRSTNAME"));
				namess.setLsubname(rs.getString("LSUBNAME"));
				namess.setFsubname(rs.getString("FSUBNAME"));
				namess.setImage(rs.getString("IMAGE"));
				
				String subFullName =  namess.lastname + namess.firstname + namess.lsubname + namess.fsubname;
				
				String fullName = subFullName;
				fullName = fullName.replaceAll("　","");
				fullName = fullName.replaceAll("\u0020","");
				
				if(fullName.matches(".*" + name +".*") ){
					list.add(namess);
					
					
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
	
	
	
	
	public static ArrayList<SearchOutBeans> info(String id){
		ArrayList<SearchOutBeans> list = new ArrayList<SearchOutBeans>();
		Connection db = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
			
			try{
				Context context= new InitialContext();
				DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/test");
				db = ds.getConnection();
				ps = db.prepareStatement("SELECT * FROM employee WHERE ID = ? ORDER BY LSUBNAME,FSUBNAME");
				SearchOutBeans namess = new SearchOutBeans();
				
				namess.setId(id);
				
				ps.setString(1, namess.id);
				rs = ps.executeQuery();
				     
			while(rs.next()){
				
				namess.setId(rs.getString("ID"));
				namess.setLastname(rs.getString("LASTNAME"));
				namess.setFirstname(rs.getString("FIRSTNAME"));
				namess.setLsubname(rs.getString("LSUBNAME"));
				namess.setFsubname(rs.getString("FSUBNAME"));
				namess.setImage(rs.getString("IMAGE"));
				namess.setBirthday(rs.getString("BIRTHDAY"));
				namess.setPlace(rs.getString("PLACE"));
				namess.setHobby(rs.getString("HOBBY"));
				namess.setWord(rs.getString("WORD"));
			
				list.add(namess);
					
					
				
				
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
