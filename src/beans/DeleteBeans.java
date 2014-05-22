
package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

@SuppressWarnings("serial")
public class DeleteBeans implements Serializable {
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

	public static void DateBaseDelete(DeleteBeans deletebeans) {
		Connection db = null;
		PreparedStatement ps = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/");
			db = ds.getConnection();
			ps = db.prepareStatement("UPDATE EMPLOYEE SET ?, ?, ?, ?, ?, ?, ?, ?, ? WHERE ID = ?");
			ps.setString(1, deletebeans.getLastname());
			ps.setString(2, deletebeans.getFirstname());
			ps.setString(3, deletebeans.getFsubname());
			ps.setString(4, deletebeans.getLsubname());
			ps.setString(5, deletebeans.getBirthday());
			ps.setString(6, deletebeans.getPlace());
			ps.setString(7, deletebeans.getHobby());
			ps.setString(8, deletebeans.getImage());
			ps.setString(9, deletebeans.getWord());
			ps.setString(10, deletebeans.getId());

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