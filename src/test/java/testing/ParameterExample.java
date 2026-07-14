package testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	
	@Parameters({"browser", "username", "password"})
	@Test
	public void launchBrowser(String browserName, String username, String password) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.out.println("Launching " + browserName + " browser");
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.out.println("Launching " + browserName + " browser");
		} else if(browserName.equalsIgnoreCase("Edge")) {
			System.out.println("Launching " + browserName + " browser");
		} 
		
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

}
