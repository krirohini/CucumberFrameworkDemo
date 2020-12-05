Feature: Amazon Search

	@Smoke
  Scenario: Search a product
    Given I have a search field on Amazon Page
    When I search for a product with name "Apple MacBook Pro" and price 1000
    Then Product with name "Apple MacBook Pro" should be displayed
    
   @Regression
   Scenario: Search a product iPhone
    Given I have a search field on Amazon Page
    When I search for a product with name "iPhone" and price 1200
    Then Product with name "iPhone" should be displayed
    Then Order id is 12345 and user name is "rohini" 
    