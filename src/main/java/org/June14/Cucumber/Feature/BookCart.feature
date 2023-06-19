Feature:
  BookCart Application

  Scenario Outline:
    When user should click login button
    And user should enter the email as "<email>"
    And user should enter the pass as "<pass>"
    And user should click login button
    Then login should be successful
    Examples:
      | email                        | pass         |
      | santhoshinreallife@gmail.com | santhosh@18  |
      | santhosh@gmail.com           | santhosh@180 |
