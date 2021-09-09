@ageUnder16 @regression
Feature: To get help with NHS Treatment in Wales
  Scenario: To verify person age under 16 get help with NHS Treatment
    Given user is on NHS Cost Checker tool
    When user click on start button
    And user select wales country
    And user click on next button
    And user type date of birth
    And user click on next button
    Then user should be able to see message from NHS about help with treatment