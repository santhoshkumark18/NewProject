Feature: LetCode Application

  Scenario Outline: LetCode login successful

    When User should navigate to the application
    And User should able enter as email "<name>"
    And User should able enter as pass "<rollno>"
    And User should able click login button
    Then login should be successful
    Examples:
      | name     | rollno |
      | santhosh | 18     |