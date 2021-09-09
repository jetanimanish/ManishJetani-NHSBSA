$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/walesTestTicketBetween16toUnder19Age.feature");
formatter.feature({
  "line": 2,
  "name": "To get help with NHS Treatment in Wales",
  "description": "",
  "id": "to-get-help-with-nhs-treatment-in-wales",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@age16toUnder19"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 10618071500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "To verify person between age 16 to under 19 get help with NHS Treatment",
  "description": "",
  "id": "to-get-help-with-nhs-treatment-in-wales;to-verify-person-between-age-16-to-under-19-get-help-with-nhs-treatment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on NHS Cost Checker tool",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on start button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user select wales country",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user type date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user select Yes in full time education",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should be able to see message from NHS for help with treatment",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnNHSCostCheckerTool()"
});
formatter.result({
  "duration": 356127900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnStartButton()"
});
formatter.result({
  "duration": 302954500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userSelectWalesCountry()"
});
formatter.result({
  "duration": 267898500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnNextButton()"
});
formatter.result({
  "duration": 183710300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userTypeDateOfBirth()"
});
formatter.result({
  "duration": 134639900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnNextButton()"
});
formatter.result({
  "duration": 176802900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userSelectYesInFullTimeEducation()"
});
formatter.result({
  "duration": 260895900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnNextButton()"
});
formatter.result({
  "duration": 194006900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userShouldBeAbleToSeeMessageFromNHSForHelpWithTreatment()"
});
formatter.result({
  "duration": 4548300,
  "status": "passed"
});
formatter.after({
  "duration": 53600,
  "status": "passed"
});
});