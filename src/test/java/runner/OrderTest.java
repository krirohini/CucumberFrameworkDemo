package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/test/resources/feature/Order.feature"},
			glue = {"stepDefinitions"},
			plugin = {"pretty"}
		)

public class OrderTest {
	
	

}
