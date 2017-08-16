package jarvis.payment.data;

import java.util.List;

public class AddToDatabase {

	public static int addTrx(List<String> trxs) {
		int count = 0;

		for (String trx : trxs) {
			System.out.println(trx);

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
