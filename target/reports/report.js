$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/TestRequirement.feature");
formatter.feature({
  "name": "Exercise1 Home Page Verification",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User open the browser and navigate to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeTests.user_open_the_browser_and_navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the right count of values are displayed on Home page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "check the text for each value is diplayed on home page",
  "rows": [
    {
      "cells": [
        "label",
        "textValues"
      ]
    },
    {
      "cells": [
        "Value1",
        "$122,365.24"
      ]
    },
    {
      "cells": [
        "Value2",
        "$599.00"
      ]
    },
    {
      "cells": [
        "Value3",
        "$850,139.99"
      ]
    },
    {
      "cells": [
        "Value4",
        "$23,329.50"
      ]
    },
    {
      "cells": [
        "Value5",
        "$566.27"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomeTests.check_the_text_for_each_value_is_diplayed_on_home_page(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User open the browser and navigate to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeTests.user_open_the_browser_and_navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify values are greater on 0",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "check each value displayed on screen are greater than 0",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeTests.check_each_value_displayed_on_screen_are_greater_than(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User open the browser and navigate to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeTests.user_open_the_browser_and_navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify total balance is correct",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "check total balance is \"$1,000,000.00\" as per the value displayed on home page screen",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeTests.check_total_balance_is_as_per_the_value_displayed_on_home_page_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User open the browser and navigate to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeTests.user_open_the_browser_and_navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify values are formatted as currency",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "check each value on page are in \"$\" currency format",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeTests.check_each_value_on_page_are_in_currency_format(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User open the browser and navigate to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeTests.user_open_the_browser_and_navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify total balance is equal to sum of all values",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "check total balance is equal to sum of all values on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeTests.check_total_balance_is_equal_to_sum_of_all_values_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});