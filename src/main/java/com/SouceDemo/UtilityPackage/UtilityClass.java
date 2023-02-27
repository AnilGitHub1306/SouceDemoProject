package com.SouceDemo.UtilityPackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
WebDriver driver;
	
	public static void utilityclass(WebDriver driver,String imageName) throws IOException
	{
	//with SampleDateFormat
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy & hh-mm-ss");
	String date = sdf.format(d);
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File sourceFile= ts.getScreenshotAs(OutputType.FILE);
	File destFile = new File("C:\\Users\\admin\\Downloads\\Cromedriver\\Screenshot\\"+imageName+date+".jpg");
	FileHandler.copy(sourceFile, destFile);
	}   
}
