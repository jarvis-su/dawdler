package jarvis.payment;

import java.util.List;

import jarvis.payment.data.AddToDatabase;
import jarvis.util.TxtUtil;

public class MainProcess {

	public static void main(String[] args) {

		List<String> transactions = TxtUtil.getData("F:\\Document\\2017R1\\Data\\payment_data_att.csv");
		List<String> adjustments = TxtUtil.getData("F:\\Document\\2017R1\\Data\\payment_data_adj.csv");
		List<String> holidaysAndClosureDay = TxtUtil.getData("F:\\Document\\2017R1\\Data\\payment_data_hc.csv");

		AddToDatabase.addTrx(transactions);
		AddToDatabase.addAdj(adjustments);
		AddToDatabase.addHolidayAndClosure(holidaysAndClosureDay);
	}

}
