package ExcelLessons;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utilities.Constants;

public class writeExcelTest {
	
	public static void main(String[] args) throws IOException {
		
		// open connection to the file
		FileInputStream fs = new FileInputStream(Constants.excelFilePath);
		
		// gets workbook
        Workbook wb = new XSSFWorkbook(fs);
        
        // gets sheet index of 
        Sheet sheet =wb.getSheetAt(2);
		
        // gets me the last row number and prints
        int lastRow = sheet.getLastRowNum();
        System.out.println(lastRow);
        
        for(int i = 1; i<=lastRow; i++) {
        	Row row = sheet.getRow(i);
        	
//        	Cell cell = row.createCell(1);
//        	
//        	cell.setCellValue("Cohort-11");
        	
        	Cell cell2 = row.createCell(2); // cell3
        	
        	cell2.setCellValue("Cohort-12");
        	
        	Cell cell3 = row.createCell(3); // cell4
        	
        	cell3.setCellValue("Cohort-13");
        	
        	Cell cell4 = row.createCell(4); // cell5
        	
        	cell4.setCellValue("Cohort-14");
        	
        	
              	
        	
        }
        
        FileOutputStream fos = new FileOutputStream(Constants.excelFilePath);
        wb.write(fos);
        fos.close();
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
