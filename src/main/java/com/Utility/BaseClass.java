package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;


    
public class BaseClass {
  public  WebDriver driver;
     @Parameters("browsername")
	@BeforeMethod
	public void Browseropen(String browsername) {
   if (browsername.equalsIgnoreCase("chrome") )  
   {  WebDriverManager.chromedriver().setup();
	          driver=new ChromeDriver();
	          driver.get("https://www.facebook.com/");
   }
	 
     	else if(browsername.equalsIgnoreCase("edge") ) 
     	{	WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
            driver.get("https://www.facebook.com/");
     	}
     }
	
	@AfterMethod
	public void browserclode() {
		driver.close();
	}
}
