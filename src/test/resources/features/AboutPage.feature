Feature: About Page

Background:
    Given I am on "Home" Page
    And I click on "about" on Tab Menu

@Feature:AboutPage
Scenario:To validate About Page headers 
    Given I am on "About" Page
    Then I validate About Page headers

@VerifyFooter @Feature:AboutPage
Scenario:To validate Footer
    Given I am on "About" Page
    Then I validate Footer Header section 
    And I validate Footer Company Links section
    And I validate Footer Quick Links section
    And I validate Disclaimer section
    And I validate Copyright section
