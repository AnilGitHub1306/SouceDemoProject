package com.SauceDemo.POMPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_POM_Class 
{
	//Declare webdriver
	private WebDriver driver;
	private Actions act;
	
	//create constructor
	
	public void Home_Page_POM_Class (WebDriver driver)
	{
		this.driver = driver;
		act=new Actions (driver);
		PageFactory.initElements(driver, this);
	}
	
	//find the web element
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement addToCartBackpack;
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']") private List<WebElement> allAddToCartbtn;
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement shoppingCatBtn;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement setting;
	@FindBy(xpath="//a[@id='logout_sidebar_link']") private WebElement logOut;
	
	// perform action on the element
	
	public void clickBackpack()
	{act.click(addToCartBackpack).perform();}
	
	public void clickAllAddToCartButtons()
	{for(WebElement i: allAddToCartbtn)
	{ act.click(i).perform();}}
	
	public String shoppingCatBtnt()
	{String noOfItemAddedTocart = shoppingCatBtn.getText();
	return noOfItemAddedTocart;}
	
	public void clickSettingBtn()
	{act.click(setting).perform();}
	
	public void clickLogOutBtn()
	{act.click(logOut).perform();}
	
}
