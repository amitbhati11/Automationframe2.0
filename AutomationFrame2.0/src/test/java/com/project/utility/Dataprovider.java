package com.project.utility;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataprovider {
exceldatautility edu;
	
@DataProvider(name="datap")
	
	public Object [][] getfndata() throws IOException{
	String xlpath="C:\\Users\\Admin_SRV\\eclipse-workspace\\AutomationFrame2.0\\Data\\loginDataprovider.xlsx";
	String Sheetname="Sheet1";
   Object data [][]=getcellStringdata(xlpath, Sheetname);
      return data;
}

	public Object [][] getcellStringdata(String xlpath,String Sheetname) throws IOException{
		edu=new exceldatautility(xlpath, Sheetname);
		
	int Rownum=	edu.rownum();
	int Colnum=edu.colnum();
	
	     Object data[][]=new Object[Rownum-1][Colnum];
	     
	     for(int i=1;i<Rownum;i++) {
	    	 for(int j=0;j<Colnum;j++) {
	    		 data[i-1][j]=edu.getcelldata(i, j);
	    	 }
	     } 
	     return data;
		
	}
	
}
