Feature: Energy Tracker Page
  As a user
  I want to visit energy tracker page
  So I can see my total site consumption, carbon usage and cost consumption


  Background: flow till portfolio page
    Given User is on Grid Edge home page
    When User enter email id "basic.test.user@gridedge.co.uk"
    And User enters password "0&Mq9#i*$$Rt"
    And User click on checkbox
    And User click on Sign in button
    Then User should see porfolio page successfully


  @SMOKE
  Scenario:Verify user should navigate to Energy tracker page
    Given User is on porfolio page
    When User click on Energy Tracker button
    Then User should navigate to Energy tracker page successfully






