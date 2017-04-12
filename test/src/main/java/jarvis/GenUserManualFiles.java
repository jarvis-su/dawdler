package jarvis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;

public class GenUserManualFiles {
	static String SCHEDULE_FILE_NAME = "D:\\ECC_DEV\\ECCOK_Int_jsu\\app\\config\\com\\tps\\config\\com_tps_sysmgmt_scheduler_properties";
	static String OUT_FOLDER = "E:\\temp\\t\\";

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(SCHEDULE_FILE_NAME);
			prop.load(fis);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		BufferedReader br = null;
		FileReader reader = null;
		try {
			reader = new FileReader(SCHEDULE_FILE_NAME);
			br = new BufferedReader(reader);
			String str = null;
			while ((str = br.readLine()) != null) {
				if (str.startsWith("#") || StringUtils.isBlank(str)) {
					continue;
				}
				String key = str.substring(0, str.indexOf("="));
				if (str.indexOf("taskName") > 0) {
					String taskName = str.substring(str.indexOf("=") + 1, str.length());
					String[] taskClassPath = taskName.split("\\.");
					String taskClass = taskClassPath[taskClassPath.length - 1];
					if (taskClass.equals("RunReportTask")) {
						String params = prop.getProperty(key.replace("taskName", "params"));
						String[] reports = params.split(";");
						for (String report : reports) {
							genUserManulFile(OUT_FOLDER + "run" + report + ".html", report);
						}
					}
					genUserManulFile(OUT_FOLDER + "run" + taskClass + ".html", taskClass);
					System.out.println(key + " = " + taskName + " ---- " + taskClass);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public static void genUserManulFile(String fileName, String taskName) {
		FileWriter writer = null;
		BufferedWriter bw = null;
		try {
			writer = new FileWriter(fileName);
			bw = new BufferedWriter(writer);
			StringBuffer sb = new StringBuffer();
			sb.append("<!DOCTYPE html>");
			sb.append("<html>");
			sb.append("<head>");
			sb.append("<meta charset=\"CP1252\">");
			sb.append("<title>" + taskName + "</title>");
			sb.append("<link rel=\"stylesheet\" href=\"../css/transparent.css\" />");
			sb.append("</head>");
			sb.append("<body>");
			sb.append("<table>");
			sb.append("<tr>");
			sb.append("<td><b>Introduction:&nbsp;</b></td>");
			sb.append("</tr>");
			sb.append("<tr>");
			sb.append("<td><b>Dependencies:&nbsp;</b>N/A</td>");
			sb.append("</tr>");
			sb.append("<tr>");
			sb.append("<td><b>Parameters:&nbsp;</b></td>");
			sb.append("</tr>");
			sb.append("</table>");
			sb.append("</body>");
			sb.append("</html>");

			bw.write(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
