package com.project.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class helperclass {

	public static void capturesrceenshot(WebDriver driver) throws IOException {
		String path="C:\\Users\\Admin_SRV\\eclipse-workspace\\AutomationFrame2.0\\Screenshots\\Project__"+dateutils()+"_login.png";
	
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		         
		FileUtils.copyFile(src, new File(path));
	}
	
	public static String  dateutils() {
		
		Date dd=new Date();
		DateFormat format= new SimpleDateFormat("MM_dd_yyy_HH_mm_ss");
		return format.format(dd);
	}
	
}
