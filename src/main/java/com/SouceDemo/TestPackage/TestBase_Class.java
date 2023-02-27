package com.SouceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.SauceDemo.POMPackage.LogIn_Page_POM_Class;
import com.SouceDemo.UtilityPackage.UtilityClass;

public class TestBase_Class 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		System.setProperty("Webdriver.crome.driver",
				"C:\\Users\\admin\\Downloads\\Cromedriver\\chromedriver_win32\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
		 System.out.println("Window get maximized");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 System.out.println("implicitWait added");
		 
		 driver.get("https://www.saucedemo.com/");
		 System.out.println("Url opened");
		 
	//	 UtilityClass.utilityclass(driver,"SouceDemo_LogInPage");
		 System.out.println("LoginPage screen shot taken ");
		 
		 LogIn_Page_POM_Class ab= new LogIn_Page_POM_Class(driver);
		 ab.UserName();
		 System.out.println("username inserted");
		 
		 ab.UserPassword();
		 System.out.println("password inserted");
		 
		 ab.UserLogInbtn();
		 System.out.println("clicked on logIn Button");
		 
		 System.out.println("Check for home page");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		 System.out.println("driver get closed");
	}
	
	
}
