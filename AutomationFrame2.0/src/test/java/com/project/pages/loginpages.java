package com.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpages {

	public WebDriver driver;
	
	By fname=By.xpath("//input[@placeholder='Enter your full name']");
	
	By pwd=By.xpath("//input[@placeholder='Enter your password']");
	
	By lgnbtn=By.xpath("//button[@onclick='performLogin()']");
	public loginpages(WebDriver driver) {
		this.driver=driver;
	}
	
	public void us_name(String username) {
		driver.findElement(fname).sendKeys(username);
	}
	public void us_pwd(String password) {
		driver.findElement(pwd).sendKeys(password);
	}
	public void loginbtn() {
		driver.findElement(lgnbtn).click();
	}
	
}
