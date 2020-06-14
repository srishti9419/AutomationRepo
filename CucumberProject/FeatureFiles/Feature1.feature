
@tag
Feature: Login feature of newtours
  @tag1
  Scenario: Test login feature with valid credentials
    Given Application is up and running 
   
    When I enter valid credential and click login
    
    Then I should see the  homepage
   
