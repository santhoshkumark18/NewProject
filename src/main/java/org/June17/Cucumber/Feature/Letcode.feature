Feature:
  LetCode Application Login Page

  Background:
    When User should able click login button
@smoke
  Scenario:
    Login should be successful

    And User should able enter as email "santhoshkumar"
    And User should able enter as passwd "Santhosh@18"
    And User should able click login button
    Then Login should be successful
@sanity
  Scenario:
  Login should be failed

    And User should able enter as email "santhoshkumar"
    And User should able enter as passwd "Santhosh@18"
    And User should able click login button
    But Login should be failed