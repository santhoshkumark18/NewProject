Feature:
  Letcode Application

  Scenario Outline:
    Given User should navigate to the application
    And User should able click login button
    And User should able enter as eamil "<email>"
    And User should able enter as passwd "<pass>"
    When User click submit
    Then Login should be successful
    Examples:
      | email  | pass     |
      | ortoni | pass1234 |