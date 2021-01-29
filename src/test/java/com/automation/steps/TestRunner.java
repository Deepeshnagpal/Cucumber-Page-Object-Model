package com.automation.steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "com.automation.steps" }, monochrome = true, plugin = {
		"html:target/reports", "json:target/cucumber-reports/cucumber.json",
		"junit:target/cucumber-reports/cucumber.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner {
	
	
}
