package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginLogoutTest {

	@Test(priority = 1, description = "Test to login With valid credentials")
	public void testToLoginWithValidCredentials() {
		Assert.assertTrue(false, "testToLoginWithValidCredentials failed");
		System.out.println("Inside testToLoginWithValidCredentials");
	}

	@Test(priority = 2, dependsOnMethods = "testToLoginWithValidCredentials", 
			description = "Test logout from application.")
	public void testToLogoutFromApplication() {
		Assert.assertTrue(true);
		System.out.println("Inside testToLogoutFromApplication");
	}
}
