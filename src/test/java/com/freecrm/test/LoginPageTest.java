package com.freecrm.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.freecrm.page.HomePage;
import com.freecrm.page.LoginPage;
import com.freecrm.util.TestUtils;
import com.freecrmqa.BasePage;

public class LoginPageTest extends BasePage {
	LoginPage loginPage;
	HomePage homePage;
		
	@BeforeTest(groups = {"sanity" , "regression"})
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
	}
	
	@Test(groups = {"sanity" , "regression"}, priority=2)
	public void validateLoginPageTitle()
	{
		String Title = loginPage.getLoginPageTitle();
		Assert.assertEquals(Title, "Free CRM software in the cloud powers sales and customer service");
	}
	
	@Test(groups = {"sanity"}, priority=1)
	public void logoVerify()
	{
	   boolean isLogoDisplayed = loginPage.logoDisplayed();
	   Assert.assertTrue(isLogoDisplayed,"FreeCRM LOGO is not displayed");
	}
	
	@Test(groups = {"sanity"}, priority=2)
	public void logoVeri()
	{
	   boolean isLogoDisplayed = loginPage.logoDisplayed();
	   Assert.assertTrue(isLogoDisplayed,"FreeCRM LOGO is not displayed");
	}
	
	@Test(groups = {"sanity"}, priority=3 )
	public void loginVerify()
	{
		TestUtils.staticWait(3);
		 HomePage page = loginPage.login();
		 Assert.assertEquals(page.getHomePageTitle(), "CRMPRO");
	}
	
	@AfterTest(groups = {"sanity" , "regression"})
	public void teardown()
	{
		driver.close();
	}

}
