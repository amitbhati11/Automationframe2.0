package com.project.utility;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldatautility {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	public exceldatautility(String xlpath,String Sheetname) throws IOException {
		workbook=new XSSFWorkbook(xlpath);
		sheet=workbook.getSheet(Sheetname);
		
	}
	
	public int rownum() throws IOException {
		int rowcount=sheet.getPhysicalNumberOfRows();
		return rowcount;
	}
	public int colnum() throws IOException {
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		return colcount;
	}
	public String getcelldata(int rown,int coln) throws IOException {
		DataFormatter format=new DataFormatter();
		
	String value=format.formatCellValue(sheet.getRow(rown).getCell(coln));
	return value;
	}
}
