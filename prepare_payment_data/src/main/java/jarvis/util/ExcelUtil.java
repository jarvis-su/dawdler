package jarvis.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static List<String> readXlsx(String fileName, int sheetNum) {
		List<String> data = new ArrayList<>();

		boolean isE2007 = false;
		if (fileName.endsWith("xlsx")) {
			isE2007 = true;
		}
		Workbook wb = null;
		InputStream input = null;
		try {
			input = new FileInputStream(fileName);
			if (isE2007)
				wb = new XSSFWorkbook(input);
			else
				wb = new HSSFWorkbook(input);
			Sheet sheet = wb.getSheetAt(0);
			Iterator<Row> rows = sheet.rowIterator();
			while (rows.hasNext()) {
				Row row = rows.next();
				int rowNum = row.getRowNum();
				if (rowNum > 0) {
					StringBuffer line = new StringBuffer();
					Iterator<Cell> cells = row.cellIterator();
					while (cells.hasNext()) {
						HSSFCell cell = (HSSFCell) cells.next();
						System.out.println("Cell #" + cell.getColumnIndex());
						
						cell.getCellType();
						
						int it = XSSFCell.CELL_TYPE_STRING;
						

						switch (cell.getCellType()) { // 根据cell中的类型来输出数据
						case HSSFCell.CELL_TYPE_NUMERIC:
							System.out.println(cell.getNumericCellValue());
							break;
						case HSSFCell.CELL_TYPE_STRING:
							System.out.println(cell.getStringCellValue());
							break;
						case HSSFCell.CELL_TYPE_BOOLEAN:
							System.out.println(cell.getBooleanCellValue());
							break;
						case HSSFCell.CELL_TYPE_FORMULA:
							System.out.println(cell.getCellFormula());
							break;
						default:
							System.out.println("unsuported sell type");
							break;
						}
					}
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			CommonUtils.closeResources(wb, input);
		}
		return data;
	}
}
