Feature: Uber Booking feature

@Smoke
Scenario: Booking Sedan Cab 
	Given User wants to select a car type "Sedan" from Uber Application
	When User selects the car type "Sedan" and pickup location "Banglore" to drop location "Pune"
	Then Driver starts the journey
	And Driver ends the journey
	Then User pays 1000.89 USD
	
@Regression @Smoke
Scenario: Booking SUV Cab
	Given User wants to select a car type "SUV" from Uber Application
	When User selects the car type "Sedan" and pickup location "Banglore" to drop location "Pune"
	Then Driver starts the journey
	And Driver ends the journey
	Then User pays 1000.89 USD

@Prod	
Scenario: Booking Mini Cab
	Given User wants to select a car type "Mini" from Uber Application
	When User selects the car type "Sedan" and pickup location "Banglore" to drop location "Pune"
	Then Driver starts the journey
	And Driver ends the journey
	Then User pays 1000.89 USD