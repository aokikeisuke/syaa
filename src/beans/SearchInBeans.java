package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



@SuppressWarnings("serial")
public class SearchInBeans implements Serializable{
	
	private String lastname;
	private String firstname;
	private String lsubname;
	private String fsubname;
	
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
	
	public static ArrayList<SearchInBeans>getInfos(){
		ArrayList<SearchInBeans> list = new ArrayList<SearchInBeans>();
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
				SearchInBeans nameｓ = new SearchInBeans();
				nameｓ.setLastname(rs.getString("lastname"));
				nameｓ.setFirstname(rs.getString("firstname"));
				nameｓ.setLsubname(rs.getString("lsubname"));
				nameｓ.setFsubname(rs.getString("fsubname"));
				list.name(nameｓ);
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
