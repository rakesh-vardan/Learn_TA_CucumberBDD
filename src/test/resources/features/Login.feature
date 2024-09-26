Feature: User Login
  As a registered user
  I want to login to my account
  So that I can access my personalized dashboard

  @smoke
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the dashboard

  @smoke
  Scenario: Successful login with in-valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the dashboard

  @loginParameter
  Scenario: Login with admin credentials
    Given the user enters "admin" as the username and "admin123" as the password
    When the user clicks the login button
    Then the user should be redirected to the dashboard

  @loginParameter
  Scenario: Login with user credentials
    Given the user enters "user" as the username and "user123" as the password
    When the user clicks the login button
    Then the user should be redirected to the dashboard

  @dataDrivenTest
  Scenario Outline: Login with multiple credentials - data driven testing
    Given the user enters "<username>" as the username and "<password>" as the password
    When the user clicks the login button
    Then the user should be redirected to the "<page>"

    Examples:
      | username | password | page         |
      | admin    | admin123 | dashboard    |
      | guest    | guest123 | guest home   |
      | invalid  | wrong    | error page   |