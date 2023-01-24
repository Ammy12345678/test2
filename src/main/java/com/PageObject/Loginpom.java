package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {
         WebDriver driver;
         
	  @FindBy(how=How.XPATH,using="//input[@id='email']")
	  private WebElement emailid;
	  
	  @FindBy(how=How.XPATH,using="//input[@id='pass']")
	  private WebElement password;
	
	  @FindBy(how=How.XPATH,using="//button[@id='u_0_5_62']")
	  private WebElement button;
	  
	  public Loginpom(WebDriver driver)
	  {
		  this.driver=driver;
	  }

	public WebElement getEmailid() {
		return emailid;
	
	}

	public WebElement getPassword() {
		return password;

	}

	public WebElement getButton() {
		return button;
	
	}
	
	
	
	
	
}
