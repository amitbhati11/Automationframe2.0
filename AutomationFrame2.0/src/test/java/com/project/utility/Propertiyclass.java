package com.project.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertiyclass {
	
	Properties pp;
	
	public Propertiyclass() throws IOException {
		String configpath="C:\\Users\\Admin_SRV\\eclipse-workspace\\AutomationFrame2.0\\Config\\config.properties";
		File file=new File(configpath);
		FileInputStream fis=new FileInputStream(file);
		
		pp=new Properties();
		pp.load(fis);
		}

	public String  getbrowser() {
		return pp.getProperty("Browser");
		 
		 
	}
	public String Appurl() {
		return pp.getProperty("prodURL");
	}
}
