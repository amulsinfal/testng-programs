package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test(priority = 1, groups = { "Smoke", "Regression" }, 
			description = "Test Login With Valid Credentials")
	public void testLoginWithValidCredentials() {
		Assert.assertTrue(true);
		System.out.println("Inside testLoginWithValidCredentials");
	}

	@Test(priority = 2, groups = { "Regression" }, 
			description = "Test Login With invalid Credentials")
	public void testLoginWithInvalidCredentials() {
		Assert.assertTrue(true);
		System.out.println("Inside testLoginWithInvalidCredentials");
	}

	@Test(priority = 3, groups = { "Regression" }, 
			description = "Test Login With blank Credentials")
	public void testLoginWithBlankCredentials() {
		Assert.assertTrue(true);
		System.out.println("Inside testLoginWithBlankCredentials");
	}

	@Test(priority = 4, groups = { "Regression" }, 
			description = "Test Login With locked Credentials")
	public void testLoginWithLockedCredentials() {
		Assert.assertTrue(true);
		System.out.println("Inside testLoginWithLockedCredentials");
	}
}