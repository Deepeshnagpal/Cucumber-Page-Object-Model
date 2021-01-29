# Author: Deepesh
Feature: Exercise1 Home Page Verification

  Background: 
    Given User open the browser and navigate to home page

  Scenario: Verify the right count of values are displayed on Home page
    Then check the text for each value is diplayed on home page
      | label  | textValues  |
      | Value1 | $122,365.24 |
      | Value2 | $599.00     |
      | Value3 | $850,139.99 |
      | Value4 | $23,329.50  |
      | Value5 | $566.27     |

  Scenario: Verify values are greater on 0
    Then check each value displayed on screen are greater than 0

  Scenario: Verify total balance is correct
    Then check total balance is "$1,000,000.00" as per the value displayed on home page screen

  Scenario: Verify values are formatted as currency
    Then check each value on page are in "$" currency format

  Scenario: Verify total balance is equal to sum of all values
    Then check total balance is equal to sum of all values on home page
