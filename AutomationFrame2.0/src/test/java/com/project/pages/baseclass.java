package com.project.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.project.utility.Browserfactorey;
import com.project.utility.Propertiyclass;
import com.project.utility.helperclass;

public class baseclass {
public WebDriver driver;
public Propertiyclass pc;

@BeforeSuite

public void setteled() throws IOException {
	
	pc=new Propertiyclass();
}
	@BeforeClass
	public void setup()  {
		
	driver=Browserfactorey.Browserse(driver, pc.getbrowser(),pc.Appurl());
	}
	
	@AfterMethod
	
	public void teardwon(ITestResult itr) throws IOException {
		
		if(itr.getStatus()==ITestResult.FAILURE) {
			helperclass.capturesrceenshot(driver);
		}else if(itr.getStatus()==ITestResult.SUCCESS) {
			helperclass.capturesrceenshot(driver);
		}
	}
}
