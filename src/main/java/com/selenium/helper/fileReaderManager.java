package com.selenium.helper;

import org.openqa.selenium.WebDriver;

public class fileReaderManager {


	public static fileReaderManager fr=new fileReaderManager(); 
	
	
		public static fileReaderManager getInstance() 
		{
			return fr;
		}



		ConfugurationManager cr;
		
		public  ConfugurationManager getCr() throws Throwable 
		{
			if(cr==null)
			{
				cr =new ConfugurationManager();
			}
			
			return cr;
		}
	
}
