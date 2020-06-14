Feature: Login feature
  I want to use this template for my feature file

  
  Scenario Outline: Test login feature with multiple test data
    Given Application is up and running
    When When I enter <username> and <password>
    And Click on login button
    Then I should see the  homepage

    Examples: 
      | username | password |
      | mercury  | mercury  |
      | mercury1 | mercury1 |
