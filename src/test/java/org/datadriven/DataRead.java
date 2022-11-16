package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {
	public static void main(String[] args) throws IOException {

		// to locate existing file.
		File fi = new File("C:\\Users\\user\\eclipse-workspace\\MavenProject\\external\\Data.xlsx");

		// to read in the excel.
		FileInputStream fin = new FileInputStream(fi);

		// WorkBook instantiation.
		// Up casting.
		Workbook book = new XSSFWorkbook(fin);

		// to fetch a sheet.
		Sheet sh = book.getSheet("Details");

		// to fetch a no of rows.
		int noOfRows = sh.getPhysicalNumberOfRows();
		System.out.println(noOfRows);
		// to fetch a row.
		Row r = sh.getRow(1);

		// to fetch a column.
		int noOfCells = r.getPhysicalNumberOfCells();
		System.out.println(noOfCells);

		// to fetch a cell.
		Cell c = r.getCell(2);
		System.out.println(c);

		// to fetch a sheet.
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {

			Row ro = sh.getRow(i);

			for (int j = 0; j < ro.getPhysicalNumberOfCells(); j++) {

				Cell cell = ro.getCell(j);
				int type = cell.getCellType();
				
				if (type == 1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date da = cell.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
					String value = sim.format(da);
					System.out.println(value);
				}
				else {
					double d = cell.getNumericCellValue();
					long l = (long)d;
					String value = String.valueOf(l);
					System.out.println(value);
				}
			}
		}
	}
}
