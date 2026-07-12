package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest {
	@Test(priority = 1, description = "Test to verify product name.")
	public void testToVerifyProductName() {
		Assert.assertTrue(true);
		System.out.println("Inside testToVerifyProductName");
	}
	
	@Test(priority = 2, description = "Test to verify product description.")
	public void testToVerifyProductDescription() {
		Assert.assertTrue(true);
		System.out.println("Inside testToVerifyProductDescription");
	}
	
	@Test(priority = 3, description = "Test to verify product Price.")
	public void testToVerifyProductPrice() {
		int actualPrice = 29;
		int expectedPrice = 29;
		Assert.assertTrue(actualPrice==expectedPrice, "Product price mismatch");
		System.out.println("Inside testToVerifyProductPrice");
	}
	
	@Test(priority = 4, invocationCount = 3, description = "Test to verify product count.")
	public void testToVerifyProductCount() {
		Assert.assertTrue(true);
		System.out.println("Inside testToVerifyProductCount");
	}
}
