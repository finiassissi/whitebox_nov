package com.auto.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	static XSSFWorkbook workbook;
	 static XSSFSheet sheet;
	 XSSFCell cell;	
	 
	public static Object[][] getTestData() throws Exception
	{

		try {
			FileInputStream fi=new FileInputStream("C:\\Users\\anton\\Desktop\\TestData.xlsx");
			workbook = new XSSFWorkbook(fi);
			sheet= workbook.getSheetAt(0);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//sheet.getLastRowNum()
		//sheet.getRow(i).getLastCellNum()
		
		
		   Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		//Object[][] data=new Object[3][2];
		   
			for(int i=0;i<sheet.getLastRowNum();i++)
			{
			for(int j=0;j<sheet.getRow(j).getLastCellNum();j++)
			{
			data[i][j]=sheet.getRow(i).getCell(j).toString();
			
		//	Thread.sleep(3000);
		//	System.out.println(" the i " +i +"the jis " +j);
		//	System.out.println( data[i-1][j]);
			}
			}
			
			//System.out.println(data);
		
		return data;
		
	}
	}

