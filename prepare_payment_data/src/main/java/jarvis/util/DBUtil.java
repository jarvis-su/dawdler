package jarvis.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	private final static String DEFAULT_DB_DRIVE = "oracle.jdbc.driver.OracleDriver";
	private final static String DEFAULT_DB_USER = "ECCIN_30D_T9068_0724_03";
	private final static String DEFAULT_DB_PWD = "ECCIN_30D_T9068_0724_03";
	private final static String DEFAULT_DB_IP = "10.237.89.143";
	private final static String DEFAULT_DB_PORT = "1521";
	private final static String DEFAULT_DB_SID = "TJ11GDB4";
	private final static String DEFAULT_DB_URL = "jdbc:oracle:" + "thin:@" + DEFAULT_DB_IP + ":" + DEFAULT_DB_PORT + ":"
			+ DEFAULT_DB_SID;

	public static Connection getDefaltConn() {
		Connection con = null;
		try {
			Class.forName(DEFAULT_DB_DRIVE);
			con = DriverManager.getConnection(DEFAULT_DB_URL, DEFAULT_DB_USER, DEFAULT_DB_PWD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

	public static void testOracle() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getDefaltConn();
			String sql = "select * from dual";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next())
				System.out.println(rs.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			CommonUtils.closeResources(rs, ps, con);
		}
	}

}