package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest {

	@Test(priority = 1, description = "Test Search Product With existing product")
	public void testToSearchProductWithExistingProduct() {
		System.out.println("Inside testSearchProductWithExistingProduct");
		Assert.assertTrue(true);
	}

	@Test(priority = 2, description = "Test Search Product With non existing product")
	public void testToSearchProductWithNonExistingProduct() {
		System.out.println("Inside testSearchProductWithNonExistingProduct");
		Assert.assertTrue(true);
	}

	@Test(priority = 3, description = "Test Search Product With blank product name")
	public void testToSearchProductWithBlankProductName() {
		System.out.println("Inside testSearchProductWithBlankProductName");
		Assert.assertTrue(true);
	}

	@Test(priority = 4, timeOut = 4000, 
			description = "Test Search Product With invalid product name")
	public void testToSearchProductWithInvalidProductName() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Inside testSearchProductWithInvalidProductName");
		Assert.assertTrue(true);
	}

}
