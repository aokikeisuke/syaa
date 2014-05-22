package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

@SuppressWarnings("serial")
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
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public static void DateBaseModify(EditBeans editbeans) {
		Connection db = null;
		PreparedStatement ps = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/");
			db = ds.getConnection();
			ps = db.prepareStatement("UPDATE EMPLOYEE SET ?, ?, ?, ?, ?, ?, ?, ?, ? WHERE ID = ?");
			ps.setString(1, editbeans.getLastname());
			ps.setString(2, editbeans.getFirstname());
			ps.setString(3, editbeans.getFsubname());
			ps.setString(4, editbeans.getLsubname());
			ps.setString(5, editbeans.getBirthday());
			ps.setString(6, editbeans.getPlace());
			ps.setString(7, editbeans.getHobby());
			ps.setString(8, editbeans.getImage());
			ps.setString(9, editbeans.getWord());
			ps.setString(10, editbeans.getId());

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