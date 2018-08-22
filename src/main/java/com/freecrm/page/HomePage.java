package com.freecrm.page;

import org.openqa.selenium.support.PageFactory;

import com.freecrmqa.BasePage;

public class HomePage extends BasePage{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle()
	{
		return driver.getTitle();
	}
	
}
