@tag
Feature: Admin Login
  I want to use this template To Test Admin Login

  @tag1
  Scenario: Check Admin Login With Valid Inputs
    Given i open browser with url "http://orangehrm.qedgetech.com"
    Then i Should see Login Page
    When i enter valid user name as "Admin"
    And i enter password as "Qedge123!@#"
    And i click login
    Then i should see Admin module
    When i click Logout
    Then i Should see Login Page
    When  i close the browser