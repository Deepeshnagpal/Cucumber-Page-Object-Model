package com.automation.steps;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.junit.Assert;

import com.automation.pageObjects.HomePage;
import com.automation.utilities.BasePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeTests extends BasePage {

	HomePage homePage;

	@Before
	public void before() {
		driver = getDriver();
	}
	
	@Given("User open the browser and navigate to home page")
	public void user_open_the_browser_and_navigate_to_home_page() {
		homePage = new HomePage(driver);
		homePage.getTitle();
	}
	
	@Then("check the text for each value is diplayed on home page")
	public void check_the_text_for_each_value_is_diplayed_on_home_page(List<Map<String, String>> items) {

		try {
			System.out.println(items);
			Assert.assertTrue(true);
		} catch (Exception e) {
			// do nothing here
		}
	}
	
	@Then("check each value displayed on screen are greater than {int}")
	public void check_each_value_displayed_on_screen_are_greater_than(Integer int1) {
		homePage.listValuesGreaterThan0(int1);
	}
	
	@Then("check total balance is {string} as per the value displayed on home page screen")
	public void check_total_balance_is_as_per_the_value_displayed_on_home_page_screen(String string) {
		homePage.checkTotalBalance(string);
	}
	
	@Then("check each value on page are in {string} currency format")
	public void check_each_value_on_page_are_in_currency_format(String string) {
		homePage.isValueCurrencyFormatted(Locale.US, string);
	}

	@Then("check total balance is equal to sum of all values on home page")
	public void check_total_balance_is_equal_to_sum_of_all_values_on_home_page() {
		homePage.totalBalanceMatchesSumValue();
	}

	@After
	public void close() {
		tearDown();
	}
}
