package jarvis.payment.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AddToDatabase {

	public final static String DEFAULT_DATE_FORMAT = "MM/dd/yyyy";
	public final static String DEFAULT_DATE_TIME_FORMAT = "MM/dd/yyyy HH24:MI:SS";
	public final static String SYSVAR_DATE_TIME_FORMAT_SQL = "yyyy-MM-dd HH24:MI:SS";

	public static int addTrx(List<String> trxs) {
		int count = 0;

		for (String trx : trxs) {
			String[] data = trx.split(",");

			String providerId = data[0];
			String voucherId = data[1];
			String fundCode = data[2];
			String trxDate = data[3];
			String inTime = data[4];
			String outTime = data[5];
			String lateInTime = data[6];
			String lateOutTime = data[7];

			try {
				Date checkInDateTime = new SimpleDateFormat("mm/dd/yyyy").parse(trxDate + " " + inTime + ":00");
				Date checkOutDateTime = new SimpleDateFormat("mm/dd/yyyy").parse(trxDate + " " + inTime + ":00");
				
				long duration = checkOutDateTime.getTime() - checkInDateTime.getTime();

				Date lateCheckInDateTime = new SimpleDateFormat("mm/dd/yyyy").parse(trxDate + " " + lateInTime + ":00");
				Date LateCheckOutDateTime = new SimpleDateFormat("mm/dd/yyyy")
						.parse(trxDate + " " + lateOutTime + ":00");

				String insertSql = "";

			} catch (ParseException e) {
				e.printStackTrace();
			}

			count++;
		}

		return count;
	}

	public static int addAdj(List<String> trxs) {
		int count = 0;
		for (String trx : trxs) {
			System.out.println(trx);

			count++;
		}
		return count;
	}

	public static int addHolidayAndClosure(List<String> trxs) {
		int count = 0;
		for (String trx : trxs) {
			System.out.println(trx);

			count++;
		}
		return count;
	}

}
