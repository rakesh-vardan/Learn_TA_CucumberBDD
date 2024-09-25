Feature: User Login
  As a registered user
  I want to login to my account
  So that I can access my personalized dashboard

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the dashboard
