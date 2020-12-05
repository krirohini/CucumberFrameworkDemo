package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("User wants to select a car type {string} from Uber Application")
	public void user_wants_to_select_a_car_type_from_uber_application(String carType) {
	    System.out.println("Step 1: " + carType);
	}

	@When("User selects the car type {string} and pickup location {string} to drop location {string}")
	public void user_selects_the_car_type_and_pickup_location_to_drop_location(String carType, String pickUpLocation, String dropUpLocation) {
	    System.out.println("Step 2: " + carType + " " + pickUpLocation + " " + dropUpLocation);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	    System.out.println("Step 3: Driver starts the journey");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
	    System.out.println("Step 4: Driver ends the journey");
	}

	@Then("User pays {double} USD")
	public void user_pays_usd(Double paidAmount) {
	    System.out.println("Step 5: User pays " + paidAmount);
	}
	
	
}
