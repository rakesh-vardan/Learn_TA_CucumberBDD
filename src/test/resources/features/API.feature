Feature: Fetch user data

  @api
  Scenario: Get user details by ID
    Given the API endpoint is available
    When a GET request is sent to "1"
    Then the response code should be 200
    And the response body should contain the username "Bret"