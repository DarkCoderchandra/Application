package com.asp.webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadthedataExel {

	public static void main(String[] args) throws IOException {
		File excelfile=new File("C:\\Users\\chandra sekhar\\Desktop\\Web Automation Testing\\DemoASP\\src\\test\\resources\\New excel.xlsx");

		
		System.out.println(excelfile.exists());
		
		FileInputStream fis=new FileInputStream(excelfile);
		
		XSSFWorkbook  wb=new XSSFWorkbook(fis);
		
		XSSFSheet  sheet=wb.getSheet("Sheet1");
		int noofrow=sheet.getPhysicalNumberOfRows();
		int noofcolums=sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println(	sheet.getPhysicalNumberOfRows());
	for(int i=1;i<noofrow;i++) {
		
		for (int j = 0; j <noofcolums; j++) {
		String value=	sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(value);
		}
	}
		wb.close();
		fis.close();
		
	}

}
