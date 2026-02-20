package dataDrivenTesting;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class readexelfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XSSFWorkbook ExcelWBook = null;
		XSSFSheet sheet;
//		XSSFRow row;
//		XSSFCell cell;

		FileInputStream InputStream = null;
		
		File excelfile = new File("C:\\Users\\Saloni Tiwari\\OneDrive\\Desktop.xlsx");    // 1st step 

		try {
			InputStream = new FileInputStream(excelfile);                                // 2nd step 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ExcelWBook = new XSSFWorkbook(InputStream);                                 // 3rd step 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = ExcelWBook.getSheetAt(0);                              // read the sheet data

		int totalrow = sheet.getLastRowNum();                         // read the row data

		int totalcolumn = sheet.getRow(0).getLastCellNum();          // read the column data

		for (int currentrow = 0; currentrow < totalrow; totalrow++) {
			for (int currentcell = 0; currentcell < totalcolumn; currentcell++)

			{
				System.out.print(sheet.getRow(currentrow).getCell(currentcell).toString());
				System.out.print("\t");
				

			}
			System.out.println();
		}
		try {
			ExcelWBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}