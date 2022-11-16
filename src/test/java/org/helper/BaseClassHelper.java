package org.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClassHelper {
	public static String toWriteTheExcel(String fName,String shName) throws IOException {
		
		File fi = new File("C:\\Users\\user\\eclipse-workspace\\MavenProject\\external\\"+fName+".xlsx");
		
		Workbook book = new XSSFWorkbook();
		
		Sheet sheet = book.createSheet(shName);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number Rows.");
		int rows = scan.nextInt();
		
		System.out.println("Enter the Number Columns.");
		int cells = scan.nextInt();
		scan.nextLine();
		
		String value ="";
		for (int i = 0; i < rows; i++) {
			Row row = sheet.createRow(i);
			for (int j = 0; j < cells; j++) {
				Cell cell = row.createCell(j);
				System.out.println("Give the Value for Row Number "+i+"and Column Number"+j+".");
			    value = scan.nextLine();
				cell.setCellValue(value);
			}
		}
		
		FileOutputStream fin = new FileOutputStream(fi);
		book.write(fin);
		scan.close();
		return value;
	}
}
