package testing;

import org.testng.annotations.Test;

import dataProviders.TestDataProvider;

public class DataProviderExample {
	
	@Test(dataProvider = "loginData", dataProviderClass = TestDataProvider.class)
	public void launchBrowser(String username, String password) {
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
}
