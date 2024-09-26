Feature: User Login
  As a registered user
  I want to login to my account
  So that I can access my personalized dashboard

  @smokeTagged
  Scenario: Successful login with valid credentials-1
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the dashboard

  @regressionTagged
  Scenario: Successful login with in-valid credentials-1
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the dashboard

  Scenario: Successful login with valid credentials-2
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the dashboard

  Scenario: Successful login with in-valid credentials-2
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the dashboard
