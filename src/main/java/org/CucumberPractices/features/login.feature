Feature:
  LetCode Application

  Scenario Outline: :
    When should be login successfull
    And user should enter the user as "<email>"
    And user should enter the pass as "<pass>"
    And user should click login button
    Then login should be successfull

    Examples:
      | email                        | pass        |
      | santhoshinreallife@gmail.com | santhosh@18 |
      | santhosh@gmail.com           | santhosh@18 |
