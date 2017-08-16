package jarvis.payment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jarvis.util.CommonUtils;
import jarvis.util.DBUtil;
import jarvis.util.ExcelUtil;

public class MainProcess {

	public static void main(String[] args) {

		testOracle();
		
		ExcelUtil.readXlsx("F:\\Document\\2017R1\\Data\\payment_data.xlsx");

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
