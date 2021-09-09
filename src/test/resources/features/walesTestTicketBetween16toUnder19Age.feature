@age16toUnder19 @regression
Feature: To get help with NHS Treatment in Wales
  Scenario: To verify person between age 16 to under 19 get help with NHS Treatment
    Given user is on NHS Cost Checker tool
    When user click on start button
    And user select wales country
    And user click on next button
    And user type date of birth
    And user click on next button
    And user select Yes in full time education
    And user click on next button
    Then user should be able to see message from NHS for help with treatment