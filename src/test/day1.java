package test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day1 {
	@Test
	public void webCarLoan() {
		System.out.println("webCarLoan");
	}
	@Test
	public void apiCarLoan() {
		System.out.println("apiCarLoan");
		Assert.assertTrue(false);
	}
	@Test(dataProvider="getData")
	public void mobileCarLoan(String a1, String b1) {
		System.out.println("mobileCarLoan");
		System.out.println(a1);
		System.out.println(b1);
	}
	@DataProvider
	public Object[][] getData() {
		//3 different combination of username and password
		//
		Object data[][]=new Object[3][2];
		//1st combination
		data[0][0]="firstusername";
		data[0][1]="password";
		
		//2nd combination
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		//3rd combination
		data[2][0]="thirdusername";
		data[2][1]="thirdpassord";
		
		return data;
	}
}
