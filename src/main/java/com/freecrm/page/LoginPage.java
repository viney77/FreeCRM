package com.freecrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrmqa.BasePage;

public class LoginPage extends BasePage {
 
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	 private WebElement usernametextField;
	
	@FindBy(name="password")
	 private WebElement passwordtextField;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div/div/input")
      private WebElement loginButton;	

	@FindBy(className="img-responsive")
	  private WebElement freeCrmLogo;
	
	public String getLoginPageTitle()
	{
	  return driver.getTitle();	
	}
	 public boolean logoDisplayed()
	 {
		 return freeCrmLogo.isDisplayed();
	 }
	 public HomePage login()
	 {
		 usernametextField.sendKeys(prop.getProperty("username"));
		 passwordtextField.sendKeys(prop.getProperty("password"));
		 loginButton.click();
		 return new HomePage();
	 }
	 

}
