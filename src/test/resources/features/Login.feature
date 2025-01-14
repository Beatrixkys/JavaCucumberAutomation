Feature: Login

@Login1 @Feature:Login
Scenario: To validate login
    Given I am on "Home" Page
    And I click on "account" on Tab Menu
    Then I am on "Login" Page
    And I login with username "standard_user" and password "secret_sauce"
    Then I am on "Login" Page
