package DataProvider;

import org.testng.annotations.DataProvider;

public class dataProvider {

	@DataProvider(name = "logindata")
	public Object[][] loginTestData() {
		return new Object[][] { { "standard_user", "secret_sauce" }, 
				{ "problem_user", "secret_sauce" }, 
				{ "performance_glitch_user", "secret_sauce" },
				{ "error_user", "secret_sauce" }, 
				{ "visual_user", "secret_sauce" } 
				};
	}
}
