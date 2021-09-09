@age19to100 @regression
Feature: To get help with NHS Treatment in Wales
  Scenario: To verify person between age 19 to 100 get help with NHS Treatment
    Given user is on NHS Cost Checker tool
    When user click on start button
    And user select wales country
    And user click on next button
    And user type date of birth
    And user click on next button
    And user select Yes in Do you live with a partner?
    And user click on next button
    And user select Yes in Do you or your partner claim any benefits or tax credits?
    And user click on next button
    And user select Yes in Do you or your partner get paid universal credit?
    And user click on next button
    And user select Yes in As part of your joint universal credit, do you have any of these?
    And user click on next button
    And user select Yes in Did you and your partner have a combined take home pay of amount or less in your last universal credit period?
    And user click on next button
    Then user should be able to see message from NHS about help for treatment