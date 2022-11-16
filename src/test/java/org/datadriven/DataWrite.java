package org.datadriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {
	public static void main(String[] args) throws IOException {
		
           File fi = new File("C:\\Users\\user\\eclipse-workspace\\MavenProject\\external\\newData.xlsx");
           
           Workbook book = new XSSFWorkbook();
           
           Sheet sheet = book.createSheet("Amazon");
           
           Row row0 = sheet.createRow(0);
           
           Cell cell1 = row0.createCell(0);
           Cell cell2 = row0.createCell(1);
           
           cell1.setCellValue("User Name");
           cell2.setCellValue("Password");
           
           Row row1 = sheet.createRow(1);
           
           Cell cell11 = row1.createCell(0);
           Cell cell21 = row1.createCell(1);
           
           cell11.setCellValue("801294538");
           cell21.setCellValue("R1a2m3456$");
           
           FileOutputStream fin = new FileOutputStream(fi);
           book.write(fin);
           
        	System.out.println("File Create and Enteries Successfully Compeleted...........");	   
           
	}
}
