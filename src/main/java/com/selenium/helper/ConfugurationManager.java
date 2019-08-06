package com.selenium.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfugurationManager  {

	public static Properties ps;
	
	public ConfugurationManager() throws Throwable{
	{
	try{
	File file=new File(System.getProperty("user.dir")+"\\src\\test\\resource\\com\\selenium\\properties\\detail.properties");
	
	
	FileInputStream fis=new FileInputStream(file);
	ps= new Properties();
	ps.load(fis);
	}catch(Exception e){
	e.printStackTrace();
	throw new IOException("not found");
	}

	}}

	public String getReportConfigPath() throws Throwable{
	 String reportConfigPath = ps.getProperty("reportConfigPath");
	 if(reportConfigPath!= null) return reportConfigPath;
	 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
	 }
	
	
	public String getbRowser() throws Throwable
	{
		
		String objectBrowser = ps.getProperty("browsername");
		if(objectBrowser == null)
		{
			throw new Exception ("Browser not in  configuration properties");
		}
		return objectBrowser;
	}
	
	public String getUrl() throws Throwable{

		String objectUrl=ps.getProperty("url");
		if(objectUrl==null){
			throw new Exception("url not found on the configuration .property file ");
				}
		return objectUrl;
		}
	}