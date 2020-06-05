package com.freecrm.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcelData {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	XSSFCell cell;
	private static Logger log = LogManager.getLogger(ReadExcelData.class);
	public static Object[][] getTestData() throws Exception {
		
		try {
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\freecrm\\util\\TestData.xlsx");
			workbook = new XSSFWorkbook(fi);
			sheet = workbook.getSheetAt(0);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		int j;
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for ( j = 0; j < sheet.getRow(j).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i).getCell(j).toString();
				//Thread.sleep(5000);
				log.info(" Taking Test Data from file "+data[i][j]);

			}
			
		}
		
		return data;

	}
}
