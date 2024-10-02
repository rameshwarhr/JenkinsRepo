package DataProvider;

import org.testng.annotations.DataProvider;

public class dataProvider {

	@DataProvider(name = "logindata")
	public Object[][] loginTestData() {
		return new Object[][] { { "standard_user", "secret_sauce" }, 
				{ "problem_user", "secret_sauce" }, 
				};
	}
}

