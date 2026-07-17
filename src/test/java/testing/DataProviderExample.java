package testing;

import org.testng.annotations.Test;

import dataProviders.TestDataProvider;

public class DataProviderExample {
	
	@Test(dataProvider = "loginData", dataProviderClass = TestDataProvider.class)
	public void doLogin(String username, String password) {
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	
	@Test(dataProvider = "excelLoginData", dataProviderClass = TestDataProvider.class)
	public void verifyMessageAfterLogin(String username, String password, String message) {
		System.out.println("Username in the excel file: " + username);
		System.out.println("Password in the excel file: " + password);
		System.out.println("Message in the excel file: " + message);
		System.out.println();
		
	}
}
