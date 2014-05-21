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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

public class EditBeans implements Serializable {
	private String firstname;
	private String lastname;
	private String fsubname;
	private String lsubname;
	private String birthday;
	private String place;
	private String hobby;
	private String word;
	private String image;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFsubname() {
		return fsubname;
	}

	public void setFsubname(String fsubname) {
		this.fsubname = fsubname;
	}

	public String getLsubname() {
		return lsubname;
	}

	public void setLsubname(String lsubname) {
		this.lsubname = lsubname;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public static void DateBaseModify(HttpServletRequest request) {
		Connection db = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/");
			db = ds.getConnection();
			ps = db.prepareStatement("UPDATE EMPLOYEE SET ?, ?, ?, ?, ?, ?, ?, ?, ? WHERE ID = ?");
			ps.setString(1, request.getParameter("lastname"));
			ps.setString(2, request.getParameter("firstname"));
			ps.setString(3, request.getParameter("lsubname"));
			ps.setString(4, request.getParameter("fsubname"));
			ps.setString(5, request.getParameter("birthday"));
			ps.setString(6, request.getParameter("place"));
			ps.setString(7, request.getParameter("hobby"));
			ps.setString(8, request.getParameter("word"));
			ps.setString(9, request.getParameter("image"));
			
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e) {
			}
		}
	}
}