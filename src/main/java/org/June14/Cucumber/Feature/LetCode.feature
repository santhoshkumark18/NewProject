Feature:
  Letcode Application Login Scenario

  Background:
    When User should navigate to the application
    And User should able click login button

  Scenario:
    And User should able enter as email "santhoshinrealife@gmail.com"
    And User should able enter as pass "Santhosh@18"
    And User should able click login button
    Then login should be successful
@smoke
  Scenario:
    And User should able enter as email "santhosh@gmail.com"
    And User should able enter as pass "Santhosh@180"
    And User should able click login button
    Then login should be successful
