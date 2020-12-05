Feature: Home Page
	In order to check my order details
	As a registered user
	I want to specify the features of Order Details Page
	
Background:
	Given A registered user exits
	Given User is on Amazon Login Page
	When User enters username
	And User enters password
	And User clicks on login button
	Then User navigates to Order Page

 Scenario: Check Previous Order Details
   When User clicks on a Order Link
   Then User checks the previous order details
   
 Scenario: Check Cancelled Order Details
 	When User clicks on a cancelled order link
 	Then User checks the cancelled order details

    