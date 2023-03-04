package com.project.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.project.pages.Signuppage;
import com.project.pages.baseclass;
import com.project.pages.loginpages;
import com.project.utility.Dataprovider;

public class LoginTest extends baseclass {
  loginpages lp;
 Signuppage sup;
	 
  @Test(dataProvider="datap" ,dataProviderClass=Dataprovider.class)
	
	public void test(String username,String password,String add,String email,String phoneno) throws InterruptedException {
		lp=new loginpages(driver);
		lp.us_name(username);
		lp.us_pwd(password);
		lp.loginbtn();
		
		String actual=driver.findElement(By.xpath("(//div//h1[text()='TestProject Example page'])[2]")).getText();
		Assert.assertEquals(actual,"TestProject Example page");
			
		  System.out.println("=============");
			
		
		sup=new Signuppage(driver);
		sup.scountry();
		sup.Address(add);
		sup.Emailid(email);
		sup.phoone(phoneno);
		sup.Savebtn();
		Thread.sleep(4000);
		driver.navigate().refresh();
		
	}
}
