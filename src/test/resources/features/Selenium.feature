Feature: User Login

  @selenium
  Scenario: Valid login
    Given the user is on the sauce-demo login page
    When the user enters the valid credentials
    Then the user should be navigated to the dashboard