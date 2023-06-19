Feature:
  Letcode application

  Scenario Outline:
    Given User should able click login button
    And User should able enter as eamil  "<email>"
    And  User should able enter as passwd "<pass>"
    When User should able click submit
    Then Login should be successful
    Examples:
      | email                        | pass        |
      | santhoshinreallife@gmail.com | Santhosh@18 |
