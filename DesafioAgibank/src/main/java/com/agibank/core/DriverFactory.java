package com.agibank.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	
	private DriverFactory() {}

	public static WebDriver getDriver(){
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver" , "/Users/Elton/Documents/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			getDriver().manage().window().maximize();
		}
		return driver;
}

	public static void killDriver(){
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
