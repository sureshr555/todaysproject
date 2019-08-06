package com.selenium.testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.selenium.baseclass.BaseClass;
import com.selenium.helper.fileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(	
			
		
				features="features",
				glue="com.selenium.stepdefinition",
			
				strict=false,
				dryRun=false,
			 plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
			 	monochrome = true
		) 
	public class TestRunner {

public static WebDriver driver;

@BeforeClass
public static void runt() throws Throwable
{

	String getbRowser = fileReaderManager.getInstance().getCr().getbRowser();
	
	System.out.println("browsername ="+getbRowser);
	driver= BaseClass.getBrowser(getbRowser);

}

@AfterClass
public static void writeExtentReport()  throws Throwable{
Reporter.loadXMLConfig(new File(fileReaderManager.getInstance().getCr().getReportConfigPath()));

}
	}