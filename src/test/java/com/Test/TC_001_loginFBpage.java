package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.Loginpom;
import com.Utility.BaseClass;
import com.Utility.Library;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_loginFBpage extends BaseClass {

	@Test
	public void verifylogin()
	{
		
		
	Loginpom fis=PageFactory.initElements(driver, Loginpom.class);
	Library.custom_sendkeys(fis.getEmailid(),"dfgh");
	Library.custom_sendkeys(fis.getPassword(),"gftg");
	Library.custom_click(fis.getButton());
	
	
		
		
	}
	
	
	
	
	
}
