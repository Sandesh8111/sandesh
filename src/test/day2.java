package test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day2 {
	@Test
	public void webHomeLoan() {
		System.out.println("webHomeLoan");
	}
	@Parameters({"ApiKey","Password"})
	@AfterSuite
	public void apiHomeLoan(String a,String b) {
		System.out.println("apiHomeLoan");
		System.out.println(a);
		System.out.println(b);
	}
	@BeforeSuite
	public void mobileHomeLoan() {
		System.out.println("mobileHomeLoan");
	}
}
