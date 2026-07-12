package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest {

	@Test(priority = 1, description = "Test to register With Valid credentials")
	public void testToRegisterWithValidCredentials() {
		Assert.assertTrue(true, "testToRegisterWithValidCredntials failed.");
		System.out.println("Inside testToRegisterWithValidCredntials");
	}

	@Test(priority = 2, description = "Test to register With invalid credentials")
	public void testToRegisterWithInvalidCredentials() {
		Assert.assertTrue(true, "testToRegisterWithInvalidCredntials failed.");
		System.out.println("Inside testToRegisterWithInvalidCredntials");
	}

	@Test(priority = 3, description = "Test to register With blank credentials")
	public void testToRegisterWithBlankCredentials() {
		Assert.assertTrue(true, "testToRegisterWithBlankCredntials failed.");
		System.out.println("Inside testToRegisterWithBlankCredntials");
	}

	@Test(priority = 4, enabled = false, 
			description = "Test to register With existing credentials")
	public void testToRegisterWithExistingCredentials() {
		Assert.assertTrue(true, "testToRegisterWithExistingCredntials failed.");
		System.out.println("Inside testToRegisterWithExistingCredntials");
	}
}
