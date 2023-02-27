package com.SouceDemo.TestPackage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_TestClass_VeriftTheLogInFunctionality extends TestBase_Class
{
@Test
public void VeriftTheLogInFunctionality ()
{
	System.out.println("Apply the validation");
	
	String givenUrl  = "https://www.saucedemo.com/";
	String actualUrl = driver.getCurrentUrl();
	
	Assert.assertEquals(actualUrl, givenUrl);
}
}
