Feature: Login Feature

  @Login
  Scenario: Testing Login functionality
    Given User is on login page
    Then User should see an input field for mobile id
    And User should be able enter text in the mobile id field
    And User should see an input field for password
    And User should be able enter text in the password field
    And Login button also should be displayed
		And Help text also should be displayed