package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Library {

	public static void custom_sendkeys(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	public static void custom_click(WebElement element)
	{
		element.click();
	}
}
