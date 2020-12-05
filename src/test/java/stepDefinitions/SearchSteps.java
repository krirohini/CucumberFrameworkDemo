package stepDefinitions;

import com.rohini.amazon.Product;
import com.rohini.amazon.Search;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchSteps {
	
	Product product;
	Search search;

	
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Step 1: I'm on the seach page");
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String prudctName, Integer price) {
	    System.out.println("Step 2: Search the product with the name : "
	    							+ prudctName + " Price : " + price );
	    product = new Product(prudctName, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3: product " + productName + " is displayed");
		search = new Search();
		search.displayProduct(product);
	}
	
	@Then("Order id is {int} and user name is {string}")
	public void orderNumber_for_username_should_be_displayed(Integer orderNumber, String userName) {
		System.out.println("Order Number " + orderNumber + " is displayed");
		search = new Search();
		search.displayProduct(product);
	}

}
