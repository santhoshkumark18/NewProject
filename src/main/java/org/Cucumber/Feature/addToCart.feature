Feature:
  Letcode Application
  Background:
    Given User should navigate to the application
    And User should able click login button
    @smoke
  Scenario:
    And User should able enter email as "ortoni"
    And User should able enter passwd as "pass1234"
    When User click submit
    Then Login should be successful

  Scenario:

    And User should able enter email as "ortonikc"
    And User should able enter passwd as "pass1234"
    When User click submit
    But Login should be failure
