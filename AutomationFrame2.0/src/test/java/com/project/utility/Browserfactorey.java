package com.project.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactorey {
	
	//public  WebDriver driver;
	
	public static WebDriver  Browserse(WebDriver driver,String Browser,String Appurl) {
		if(Browser.contains("Chrome")) {
			String cpath="C:\\Users\\Admin_SRV\\eclipse-workspace\\AutomationFrame2.0\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",cpath);
			driver=new ChromeDriver();
		}else if(Browser.contains("Firefox")) {
			String gpath="C:\\Users\\Admin_SRV\\eclipse-workspace\\AutomationFrame2.0\\drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",gpath);
			driver=new FirefoxDriver();
		}else {
			System.out.println("driver is not found");
		}
		
		driver.get(Appurl);
		return driver ;
	}
	
	public static void teardown(WebDriver driver) {
		driver.quit();
	}
	

}
