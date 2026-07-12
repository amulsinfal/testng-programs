package testing;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class LogoutTest {
	@Test(priority = 1, description = "Test to login With valid credentials")
	public void testToLoginWithValidCredentials() {
		Assert.assertTrue(true);
		System.out.println("Inside testToLoginWithValidCredentials");
	}

	@Test(priority = 2, description = "Test logout from application.")
	public void testToLogoutFromApplication_SoftAssertion() {
		System.out.println("Inside testToLogoutFromApplication_SoftAssertion");
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Verifying home page title");
		String actualPageTitle = "HomePage";
		String expectedPageTitle = "Home page";
		softAssert.assertEquals(actualPageTitle, expectedPageTitle, "Home page title mismatch.");
		System.out.println("Verifying page header.");
		String actualPageHeader = "Welcome to the website";
		String expectedPageHeader = "Welcome to the website";
		softAssert.assertEquals(actualPageHeader, expectedPageHeader, "Page header mismatch.");	
		System.out.println("Logging out.");
		Assert.assertTrue(true);		
		System.out.println("Executed all assertions.");
		softAssert.assertAll("Executed all soft asserts.");
	}
	
	@Test(priority = 3, description = "Test logout from application.")
	public void testToLogoutFromApplication_HardAssertion() {
		System.out.println("Inside testToLogoutFromApplication_HardAssertion");
		System.out.println("Verifying home page title");
		String actualPageTitle = "HomePage";
		String expectedPageTitle = "Home page";
		Assert.assertEquals(actualPageTitle, expectedPageTitle, "Home page title mismatch.");
		System.out.println("Verifying page header.");
		String actualPageHeader = "Welcome to website";
		String expectedPageHeader = "Welcome to the website";
		Assert.assertEquals(actualPageHeader, expectedPageHeader, "Page header mismatch.");
		System.out.println("Logging out.");
		Assert.assertTrue(true);
	}
}