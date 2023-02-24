$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/site/gridedge/resources/featurefiles/energytracker.feature");
formatter.feature({
  "line": 1,
  "name": "Energy Tracker Page",
  "description": "As a user\r\nI want to visit energy tracker page\r\nSo I can see my total site consumption, carbon usage and cost consumption",
  "id": "energy-tracker-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3963105100,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "flow till portfolio page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "User is on Grid Edge home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enter email id \"basic.test.user@gridedge.co.uk\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters password \"0\u0026Mq9#i*$$Rt\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should see porfolio page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInTest.userIsOnGridEdgeHomePage()"
});
formatter.result({
  "duration": 99350000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "basic.test.user@gridedge.co.uk",
      "offset": 21
    }
  ],
  "location": "SignInTest.userEnterEmailId(String)"
});
formatter.result({
  "duration": 221229300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0\u0026Mq9#i*$$Rt",
      "offset": 22
    }
  ],
  "location": "SignInTest.userEntersPassword(String)"
});
formatter.result({
  "duration": 106201100,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnCheckbox()"
});
formatter.result({
  "duration": 92901000,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInButton()"
});
formatter.result({
  "duration": 20169473300,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userShouldSeePorfolioPageSuccessfully()"
});
formatter.result({
  "duration": 20093044800,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify user should navigate to Energy tracker page",
  "description": "",
  "id": "energy-tracker-page;verify-user-should-navigate-to-energy-tracker-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@SMOKE"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User is on porfolio page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User click on Energy Tracker button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User should navigate to Energy tracker page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "EnergyTrackerTest.userIsOnPorfolioPage()"
});
formatter.result({
  "duration": 53400,
  "status": "passed"
});
formatter.match({
  "location": "EnergyTrackerTest.userClickOnEnergyTrackerButton()"
});
formatter.result({
  "duration": 119428500,
  "status": "passed"
});
formatter.match({
  "location": "EnergyTrackerTest.userShouldNavigateToEnergyTrackerPageSuccessfully()"
});
formatter.result({
  "duration": 4476829200,
  "status": "passed"
});
formatter.after({
  "duration": 121300,
  "status": "passed"
});
formatter.uri("src/test/java/site/gridedge/resources/featurefiles/signin.feature");
formatter.feature({
  "line": 1,
  "name": "Sign In Functionality",
  "description": "As a user\r\nI want to Sign In on Grid Edge website",
  "id": "sign-in-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3334264900,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify user should Sign In with valid credential successfully",
  "description": "",
  "id": "sign-in-functionality;verify-user-should-sign-in-with-valid-credential-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@SMOKE"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on Grid Edge home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enter email id \"basic.test.user@gridedge.co.uk\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters password \"0\u0026Mq9#i*$$Rt\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should see porfolio page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInTest.userIsOnGridEdgeHomePage()"
});
formatter.result({
  "duration": 17700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "basic.test.user@gridedge.co.uk",
      "offset": 21
    }
  ],
  "location": "SignInTest.userEnterEmailId(String)"
});
formatter.result({
  "duration": 215408900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0\u0026Mq9#i*$$Rt",
      "offset": 22
    }
  ],
  "location": "SignInTest.userEntersPassword(String)"
});
formatter.result({
  "duration": 201014900,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnCheckbox()"
});
formatter.result({
  "duration": 88965300,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInButton()"
});
formatter.result({
  "duration": 20149819100,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userShouldSeePorfolioPageSuccessfully()"
});
formatter.result({
  "duration": 20113681000,
  "status": "passed"
});
formatter.after({
  "duration": 23200,
  "status": "passed"
});
});