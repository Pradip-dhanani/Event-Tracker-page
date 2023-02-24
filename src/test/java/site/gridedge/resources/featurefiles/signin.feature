Feature: Sign In Functionality
  As a user
  I want to Sign In on Grid Edge website

  @SMOKE
  Scenario:Verify user should Sign In with valid credential successfully
    Given User is on Grid Edge home page
    When User enter email id "basic.test.user@gridedge.co.uk"
    And User enters password "0&Mq9#i*$$Rt"
    And User click on checkbox
    And User click on Sign in button
    Then User should see porfolio page successfully



