package testing;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class AnnotationOrderTest {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite Inside beforeSuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest Inside beforeTest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass Inside beforeClass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod Inside beforeMethod");
	}
	@Test (priority = 1)
	public void testRegister() {
		System.out.println("@Test Inside testRegister");
	}
	@Test (priority = 2)
	public void testLogin() {
		System.out.println("@Test Inside testLogin");
	}
	@Test (priority = 3)
	public void testLogout() {
		System.out.println("@Test Inside testLogout");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod Inside afterMethod");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass Inside afterClass");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest Inside afterTest");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite Inside afterSuite");
	}
}
