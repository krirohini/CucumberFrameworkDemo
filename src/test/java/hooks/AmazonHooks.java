package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before("@Smoke")
	public void setup_browser(Scenario sc) {
		System.out.println(sc.getName());
	}
	
	@After("@Regression")
	public void teardown_closeBrowser() {
		System.out.println("@After - teardown_closeBrowser - Close Browser");
	}

}
