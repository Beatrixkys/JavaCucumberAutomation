Feature: HomePage

@VerifyLinks @Feature:HomePage
Scenario:To validate find broken Links
    Given I am on "Home" Page
    Then I check links

@VerifyHeaders @Feature:HomePage
Scenario:To validate Home Page Headers
    Given  I am on "Home" Page
    Then I validate Home Page headers

@VerifyMenu @Feature:HomePage
Scenario:To validate Tab Menu
    Given I am on "Home" Page
    Then I validate Tabs on Tab Menu
    And I click on "products" on Tab Menu
    Then I validate Products Dropdown on Tab Menu

@VerifyFooter @Feature:HomePage
Scenario:To validate Footer
    Given I am on "Home" Page
    Then I validate Footer Header section 
    And I validate Footer Company Links section
    And I validate Footer Quick Links section
    And I validate Disclaimer section
    And I validate Copyright section
