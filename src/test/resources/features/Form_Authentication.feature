Feature: Internet Herokuapp Portal

  Scenario Outline: Validate the Form Authentication
    Given I navigate to internet herokuapp app
    When I click on Form Authentication link
    And I type username "<username>"
    And I type password "<password>"
    And I click on Login
    Then I should be presented with the Successfull login message "<message>"
    And I Log out


    Examples:
    | username | password | message |
    | tomsmith | SuperSecretPassword! | Welcome to the Secure Area. When you are done click logout below. |
    | tomsmith | superSecretPassword! | welcome                                                           |
