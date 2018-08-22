package com.freecrm.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtils {
	
	public static void staticWait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static WebElement waitForElementToClickable(WebDriver driver, WebElement element) {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static WebElement waitForElementToDisplayed(WebDriver driver, WebElement element) {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
	}
}
