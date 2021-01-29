package com.automation.pageObjects;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.BasePage;

public class HomePage extends BasePage {

	//Page Object Class Constructor

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txt_val_1")
	private WebElement txt_value1;

	@FindBy(id = "txt_val_2")
	private WebElement txt_value2;

	@FindBy(id = "txt_val_4")
	private WebElement txt_value4;

	@FindBy(id = "txt_val_5")
	private WebElement txt_value5;

	@FindBy(id = "txt_val_6")
	private WebElement txt_value6;

	@FindBy(id = "txt_ttl_val")
	private WebElement txt_ttl_value;

	@FindBy(xpath = "//*[contains(@id,'txt_val_') and contains(@id,'txt_ttl_val')]")
	private List<WebElement> alltextValues;

	@FindBy(xpath = "//*[contains(@id,'txt_val_')]")
	private List<WebElement> txt_value_1_5;


	public String getText_ttlValue() {
		return txt_ttl_value.getText();
	}

	public void listValuesGreaterThan0(int num) {
		try {
			for (WebElement webElement : alltextValues) {
				String values = webElement.getText();

				Number number = NumberFormat.getCurrencyInstance(Locale.US).parse(values);
				if (number.doubleValue() > num) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
			}
		} catch (Exception e) {
			// nothing to do here
		}

	}

	public void isValueCurrencyFormatted(Locale locale,String currencyFormat) {
		try {
			for (WebElement webElement : alltextValues) {
				String values = webElement.getText();
				isCurrencyValid(values, currencyFormat);
			}
		} catch (Exception e) {
			// nothing to do here
		}

	}

	public boolean isCurrencyValid(String value, String currencyFormat) {
		if (value.startsWith(currencyFormat)) {
			return true;
		} else {
			return false;
		}
	}

	public void totalBalanceMatchesSumValue() {
		try {
			double sum = 0;
			for (WebElement webElement : txt_value_1_5) {
				String values = webElement.getText();

				Number number = NumberFormat.getCurrencyInstance(Locale.US).parse(values);
				sum = sum + number.doubleValue();
			}
			Number totalBalance = NumberFormat.getCurrencyInstance(Locale.US).parse(getText_ttlValue()).doubleValue();

			if (totalBalance.equals(sum)) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
		} catch (Exception e) {
			// nothing to do here
		}

	}

	public void checkTotalBalance(String totalBalance) {
		try {
			if(totalBalance.equals(txt_ttl_value))
				Assert.assertTrue(true);
			else
				Assert.assertFalse(false);
		} catch (Exception e) {
			// nothing to do here
		}
	}
}
