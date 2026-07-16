package dataProviders;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider(name="loginData")
	public Object[][] getLoginData() {
		return new Object[][] {
			{"ValidUsername", "ValidPassword"},
		};
	}

}
