Feature:
  BookCart Application

  Scenario Outline:
  Login Page of the Appliction

    When User should able click login button
    And User should able enter as email "<email>"
    And User should click enter as pass "<pass>"
    And User should able click login button
    Then Login should be successful
    Examples:
      | email                   | pass             |
      | santhoshkumar@gmail.com | santhoshKumar@18 |
