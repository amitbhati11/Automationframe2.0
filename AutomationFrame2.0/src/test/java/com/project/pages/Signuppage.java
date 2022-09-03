package com.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Signuppage {

	public WebDriver driver;
	
	By count=By.xpath("//select[@id='country']");
	
	By addr=By.xpath("//input[@placeholder='Enter your address']");
	By emil=By.xpath("//input[@placeholder='Enter your email']");
	By phon=By.xpath("//input[@placeholder='Enter your phone number']");
	By savbtn=By.id("save");
	
	public Signuppage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void scountry() {
		Select sc=new Select(driver.findElement(count));
		sc.selectByVisibleText("India");
	}
	public void Address(String add) {
		driver.findElement(addr).sendKeys(add);
	}
	public void Emailid(String email) {
		driver.findElement(emil).sendKeys(email);
	}
	public void phoone(String phoneno) {
		driver.findElement(phon).sendKeys(phoneno);
	}
	public void Savebtn() {
		driver.findElement(savbtn).click();
	}
}
