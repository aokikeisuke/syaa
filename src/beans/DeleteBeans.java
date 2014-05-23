
package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

@SuppressWarnings("serial")
public class DeleteBeans implements Serializable {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public static void DateBaseDelete(DeleteBeans deletebeans) {
		Connection db = null;
		PreparedStatement ps = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/test");
			db = ds.getConnection();
			ps = db.prepareStatement("DELETE FROM EMPLOYEE WHERE ID = ?");
			ps.setInt(1, deletebeans.getId());
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