package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public static WebDriver driver;

	public HomePage(WebDriver fdriver)
	{
		this.driver=fdriver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement login;
	
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement uname;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass;
	
	
	public WebElement getLogin()
	{
		return login;
	}
	
	public WebElement getUname()
	{
	return uname;
}

	
	public WebElement getPass()
	{
		return pass;
	}
	public WebDriver getDriver()
	{
		return driver;
	}

}
