package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.*;


import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReports {
	ExtentReports report;
	
@BeforeTest
	public void extentreport() {
		String path= System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		 report = new ExtentReports();
		 
		 
		
		
	}
	@Test
	public void abc() {
		
		WebDriver chrome= new ChromeDriver();
		chrome.get("https://www.google.com/");
		System.out.println(chrome.getTitle());
	}
}
