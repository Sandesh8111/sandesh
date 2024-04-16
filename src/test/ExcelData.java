package test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
	
	public class ExcelData {
@Test
		public void screenshot() throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot srcshot = (TakesScreenshot)driver;
		File source= srcshot.getScreenshotAs(OutputType.FILE);
		File dest= new File(System.getProperty("user.dir")+"SANDE\\eclipse-workspace\\TestNG\\screenshot.png");
		FileUtils.copyFile(source, dest);
	}
		}
	


