Feature: Internet Herokuapp Portal

  Scenario: Validate the Form Authentication
    Given I navigate to internet herokuapp app
    When I click on Form Authentication link
    And I type username
    And I type password
    And I click on Login
    Then I should be presented with the Successfull login message