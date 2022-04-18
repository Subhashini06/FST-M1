@activity5

Feature: Data driven test with Example

Scenario Outline: Testing with Data from Scenario
  Given User is on Login page
  When User enters "<UserNames>" and "<Passwords>"
  Then Read the page title and confirmation message
  And Close the Browser

  Examples:
    |UserNames|    |Passwords|
    |admin    |    |password |
    |adminUser|    |password |