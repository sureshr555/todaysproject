package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {

	public static WebDriver driver;
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radio;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebutton;

	
	@FindBy(xpath="//input[@id='location_0']")
	private WebElement locationtxt;

	
	
	
	
	public WebElement getLocationtxt() {
		return locationtxt;
	}

	public WebElement getradioclick() {
		return radio;
	}

public WebElement getcontinue()
{
	return continuebutton;
}
	
	public SelectHotel(WebDriver fdriver)
	{
	this.driver=fdriver;
	PageFactory.initElements(driver,this);
	
		
	}
	
}
