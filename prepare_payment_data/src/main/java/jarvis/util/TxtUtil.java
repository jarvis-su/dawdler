package jarvis.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TxtUtil {

	public static List<String> getData(String fileName) {
		List<String> data = new ArrayList<>();
		BufferedReader br = null;
		FileInputStream fs = null;

		File file = new File(fileName);
		if (file.exists()) {
			try {
				fs = new FileInputStream(file);
				br = new BufferedReader(new InputStreamReader(fs, "UTF-8"));
				String lineTxt = null;
				String title = br.readLine();
				System.out.println(title);
				while ((lineTxt = br.readLine()) != null) {
					data.add(lineTxt);
					// String[] cells = lineTxt.split(",");
				}
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				CommonUtils.closeResources(br);
				CommonUtils.closeResources(fs);
			}
		}
		return data;
	}
}
