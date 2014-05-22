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

public class RegOutBeans implements Serializable {
	private String firstname;
	private String lastname;
	private String fsubname;
	private String lsubname;
	private String birthday;
	private String place;
	private String hobby;
	private String word;

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

	private String image;

	public static void DataBaseInsert(RegOutBeans regoutbeans) {
		Connection db = null;
		PreparedStatement ps = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/test");
			db = ds.getConnection();
			ps = db.prepareStatement("INSERT INTO EMPLOYEE(LASTNAME, FIRSTNAME, LSUBNAME, FSUBNAME, BIRTHDAY, PLACE, HOBBY, WORD, IMAGE) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			// p. 181参照
			ps.setString(1, regoutbeans.getLastname());
			ps.setString(2, regoutbeans.getFirstname());
			ps.setString(3, regoutbeans.getLsubname());
			ps.setString(4, regoutbeans.getFsubname());
			ps.setString(5, regoutbeans.getBirthday());
			ps.setString(6, regoutbeans.getPlace());
			ps.setString(7, regoutbeans.getHobby());
			ps.setString(8, regoutbeans.getWord());
			ps.setString(9, regoutbeans.getImage());
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