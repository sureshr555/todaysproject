package com.selenium.stepdefinition;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;

import com.selenium.baseclass.BaseClass;
import com.selenium.helper.PageObjectManager;
import com.selenium.helper.fileReaderManager;
import com.selenium.testrunner.TestRunner;

import cucumber.api.java.en.Then;

public class StepDefinition extends BaseClass{

	public static WebDriver driver=TestRunner.driver;
	  public static PageObjectManager pom=new PageObjectManager(driver);


@Then("^User launch adactin$")
public void user_launch_adactin() throws Throwable {
	String url = fileReaderManager.getInstance().getCr().getUrl();
	
	BaseClass.getURL(url);
}



@Then("^user enters username and password$")
public void user_enters_username_and_password() throws Throwable {
		
		inputValuesToWebelement(pom.getHp().getUname(),"suresh555");
		
	inputValuesToWebelement(pom.getHp().getPass(),"suresh555");
	}

@Then("^user click on login button$")
public void user_click_on_login_button() throws Throwable {
    
	clickElment(pom.getHp().getLogin());
}



@Then("^now the user  select '<location>' in search hotel page$")
public void now_the_user_select_location_in_search_hotel_page() throws Throwable {
  selectDropDown(pom.getsh().getLocation(), "value", "Sydney");
	
}

@Then("^user select Hotels select data$")
public void user_select_Hotels_select_data() throws Throwable {
	
	  selectDropDown(pom.getsh().getHotels(), "value", "Hotel Creek");

}

@Then("^user select roomtype$")
public void user_select_roomtype() throws Throwable {
	  selectDropDown(pom.getsh().getRoom_type(), "value", "Standard");
}

@Then("^user select noof room$")
public void user_select_noof_room() throws Throwable {
	 selectDropDown(pom.getsh().getRoom_nos(), "value", "1");
}


@Then("^user enter in '(.*)'$")
public void user_enter_in(String arg1) throws Throwable {
  
	
getclear(pom.getsh().getCheckindate());
	inputValuesToWebelement(pom.getsh().getCheckindate(), arg1);
	
}

@Then("^user enter out '(.*)'$")
public void user_enter_out(String arg1) throws Throwable {
	getclear(pom.getsh().getCheckoutdate());
	inputValuesToWebelement(pom.getsh().getCheckoutdate(), arg1);
}
@Then("^user select adult room$")
public void user_select_adult_room() throws Throwable {
	
	selectDropDown(pom.getsh().getAdult_room(),"value","1");
}

@Then("^user select children$")
public void user_select_children() throws Throwable {

	selectDropDown(pom.getsh().getChild_room(),"value","1");
}

@Then("^user click on search button$")
public void user_click_on_search_button() throws Throwable {
clickElment(pom.getsh().getSubmit());
}


@Then("^user should click on radio button$")
public void user_should_click_on_radio_button() throws Throwable {

	clickElment(pom.getSh1().getradioclick());
}

@Then("^user must verify location 'Sydney' must match in  previous location selected$")
public void user_must_verify_location_Sydney_must_match_in_previous_location_selected() throws Throwable {
 
 String valueOfAttribute = getValueOfAttribute(pom.getSh1().getLocationtxt());
Assert.assertEquals("Sydney",valueOfAttribute);
System.out.println("location matched:"+valueOfAttribute);
}

@Then("^user should check no of rooms matched with droop down value$")
public void user_should_check_no_of_rooms_matched_with_droop_down_value() throws Throwable {
  
}



@Then("^user clicks on continue button$")
public void user_clicks_on_continue_button() throws Throwable {
 
	clickElment(pom.getSh1().getcontinue());
	
}



@Then("^user select No-of-rooms:(\\d+)$")
public void user_select_No_of_rooms(int arg1) throws Throwable {
}

@Then("^user select noof room (\\d+)$")
public void user_select_noof_room(int arg1) throws Throwable {

}

@Then("^user select adult room (\\d+)$")
public void user_select_adult_room(int arg1) throws Throwable {

}




	}

