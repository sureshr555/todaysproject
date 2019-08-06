package com.selenium.helper;

import org.openqa.selenium.WebDriver;

import com.selenium.pom.HomePage;
import com.selenium.pom.SearchHotel;
import com.selenium.pom.SelectHotel;




public class PageObjectManager {

public SearchHotel  sh;
public HomePage hp;
public WebDriver driver;
public SelectHotel sh1;




public PageObjectManager(WebDriver mdriver) {
    
	this.driver=mdriver;
}

public SelectHotel getSh1()
{
	if(sh1==null)
	{
		sh1=new SelectHotel(driver);
	}
	return sh1;
}

public HomePage getHp()
{
	if(hp==null)
	{
		hp=new HomePage(driver);
	}
	return hp;
}


public SearchHotel getsh()
{
	if(sh==null)
	{
		sh =new SearchHotel(driver);
	}
return sh;
}
}