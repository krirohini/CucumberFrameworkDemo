package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/test/resources/feature"},
			glue = {"stepDefinitions"},
			tags = "not @Smoke or @Regression and @Smoke or @Prod",
			plugin = {"pretty"}
		)

public class UberTest {
	
	

}
