package com.SauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page_POM_Class 
{
	//Declare webdriver
		private WebDriver driver;
		private static Actions act;
		
		//create constructor
		public LogIn_Page_POM_Class (WebDriver driver)
		{
		this.driver = driver;
		act=new Actions (driver);
		PageFactory.initElements(driver, this);
		}
	
	//find the web element
	
	@FindBy(xpath="//input[@id='user-name']") private WebElement uName;
	@FindBy(xpath="//input[@id='password']") private WebElement uPassword;
	@FindBy(xpath="//input[@id='login-button']") private WebElement ulogIn;
	
	
	// perform action on the element
	
	public static void UserName()
	{act.sendKeys("standard_user").perform();}
	
	public static void UserPassword()
	{act.sendKeys("secret_sauce").perform();}
	
	public static void UserLogInbtn()
	{act.click().perform();}
			
}
