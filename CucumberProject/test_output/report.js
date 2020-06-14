$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/AutomationRepo/CucumberProject/FeatureFiles/Feature2.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature",
  "description": "I want to use this template for my feature file",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Test login feature with multiple test data",
  "description": "",
  "id": "login-feature;test-login-feature-with-multiple-test-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Application is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "When I enter \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see the  homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-feature;test-login-feature-with-multiple-test-data;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "login-feature;test-login-feature-with-multiple-test-data;;1"
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ],
      "line": 13,
      "id": "login-feature;test-login-feature-with-multiple-test-data;;2"
    },
    {
      "cells": [
        "mercury1",
        "mercury1"
      ],
      "line": 14,
      "id": "login-feature;test-login-feature-with-multiple-test-data;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Test login feature with multiple test data",
  "description": "",
  "id": "login-feature;test-login-feature-with-multiple-test-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Application is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "When I enter mercury and mercury",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see the  homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.application_is_up_and_running()"
});
formatter.result({
  "duration": 7114131200,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Steps.click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.i_should_see_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "Test login feature with multiple test data",
  "description": "",
  "id": "login-feature;test-login-feature-with-multiple-test-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Application is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "When I enter mercury1 and mercury1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see the  homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.application_is_up_and_running()"
});
formatter.result({
  "duration": 6256201387,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Steps.click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.i_should_see_homepage()"
});
formatter.result({
  "status": "skipped"
});
});