package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

public static WebDriver driver;
	
	public SearchHotel(WebDriver fdriver)
	{
		this.driver=fdriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotels;
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement room_type;
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement room_nos;
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement checkoutdate;
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement checkindate;
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adult_room;
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement child_room;
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement Submit;
	@FindBy(xpath="//span[@id='checkout_span']")
	private WebElement spanError;
	
	public WebElement getcheckout_spanError()
	{

	return spanError;

	}


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoom_type() {
		return room_type;
	}


	public WebElement getRoom_nos() {
		return room_nos;
	}


	public WebElement getCheckoutdate() {
		return checkoutdate;
	}


	public WebElement getCheckindate() {
		return checkindate;
	}


	public WebElement getAdult_room() {
		return adult_room;
	}


	public WebElement getChild_room() {
		return child_room;
	}


	public WebElement getSubmit() {
		return Submit;
	}
	
	
	
	
	
	
}
