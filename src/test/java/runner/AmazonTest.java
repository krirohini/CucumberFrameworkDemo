package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/test/resources/feature"},
			glue = {"stepDefinitions", "hooks"},
			tags = "@Smoke or @Regression",
			plugin = {"pretty", 
						"json:target/MyReports/report.json",
						"junit:target/MyReports/report.xml"}
		)

public class AmazonTest {
	
	

}
