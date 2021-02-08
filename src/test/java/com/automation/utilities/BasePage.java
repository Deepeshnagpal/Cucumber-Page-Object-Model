package com.automation.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	protected WebDriver driver;

	/**
	 * wrapper for driver initialization
	 */
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", ".//drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		navigateTo();
	}

	public WebDriver getDriver() {

		if (driver == null) {
			initDriver();
		}
		return driver;
	}


	/**
	 * Close driver instance
	 */
	public void tearDown() {
		driver.quit();
	}


	public void navigateTo() {

		try {
			driver.get(ConstantValues.URL);
		} catch (Exception e) {
			//nothing to do here
		}
	}
}
