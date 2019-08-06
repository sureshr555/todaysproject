package com.selenium.baseclass;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	
	public static WebDriver driver;
	

	public static WebDriver getBrowser(String name) throws IOException,Exception
	{
		try{
		if(name.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resource\\com\\selenium\\drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		}
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		return driver;
		}catch(Exception e)
		{
		e.printStackTrace();
		throw new RuntimeException();
		}}
	
	
	public static void getURL(String name)
	{
		try{
		driver.get(name);
		}catch (Exception e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	
	  public static boolean elementIsDisplayed(WebElement element) {
          try {
			boolean displayed = element.isDisplayed();
			  return displayed;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
			
		}
	  	}
	  public static boolean elementIsEnabled(WebElement element) {
       try {
		boolean enabled = element.isEnabled();
		   return enabled;
       } catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
		}	
	  }
	
	public static void clickElment(WebElement element)
	{
		try{
		element.click();
		}catch (Exception e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}
		}
	
	  public static void waitForElementVisibility(WebElement element) {
		  try {
			WebDriverWait wb=new WebDriverWait(driver, 40);
			  wb.until(ExpectedConditions.visibilityOf(element)); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
			
		}
		  	}
	
	public static void selectDropDown(WebElement element,String option,String value)
	{
		try{
		waitForElementVisibility(element);
		Select select=new Select(element);
		
		if(option.equalsIgnoreCase("value"))
		{
	select.selectByValue(value);
		}else if (option.equalsIgnoreCase("visibleText")){
			select.selectByVisibleText(value);
			
	}else if (option.equalsIgnoreCase("index")){
		
		int parseInt = Integer.parseInt(value);
		select.selectByIndex(parseInt);
	}}catch(Exception e){
	e.printStackTrace();
	throw new RuntimeException();
}
	}
	
	public void getclear(WebElement element)
	{
		try{
			element.clear();
		}catch (Exception e)
		{
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	public static String getValueOfAttribute(WebElement element)
	
	{
		try{
		
		waitForElementVisibility(element);
		String attribute = element.getAttribute("value");		
		return attribute;
	}catch(Exception e)
		{
		e.printStackTrace();
		throw new RuntimeException();
		
	}}
	  public static void inputValuesToWebelement(WebElement element,String value) {
		  try {
			waitForElementVisibility(element);
			  if (elementIsDisplayed(element)&&elementIsEnabled(element)) {
				  element.sendKeys(value);
				  
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
        
	}}

