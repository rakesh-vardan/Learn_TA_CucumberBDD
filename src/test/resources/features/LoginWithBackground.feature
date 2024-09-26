Feature: User Login
  As a registered user
  I want to login to my account
  So that I can access my personalized dashboard

  Background:
    Given the user is on the login page
    And the user enters valid credentials

  Scenario: Successful login
    When the user clicks the "login" button
    Then the user should be redirected to the "home" page

  Scenario: Logout functionality
    Given the user is logged in
    When the user clicks the "logout" button
    Then the user should be redirected to the "login" page
