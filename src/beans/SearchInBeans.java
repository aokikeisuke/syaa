package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import to.msn.wings.beans.SearchInBeans;

@SuppressWarnings("serial")
public class SearchInBeans implements Serializable{
	
	private String lastname;
	private String firstname;
	private String lsubname;
	private String fsubname;
	
	public static ArrayList<SearchInBeans>getInfos(){
		ArrayList<SearchInBeans> list = new ArrayList<SearchInBeans>();
		Connection db = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			Context context= new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/selfjsp");
			db = ds.getConnection();
			
			ps = db.prepareStatement("SELECT * FROM address ORDER BY id");
			rs = ps.executeQuery();
			
			while(rs.next()){
				SearchInBeans name = new SearchInBeans();
				name.setlastname(rs.setlastname("lastname"));
				name.setfirstname(rs.getfirstname("firstname"));
				name.setlsubname(rs.getlsubname("lsubname"));
				name.setfsubname(rs.getfsubname("fsubname"));
				list.name(name);
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
