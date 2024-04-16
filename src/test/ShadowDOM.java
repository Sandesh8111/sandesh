package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions chrome= new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		chrome.addArguments("headless");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/shadowDOM/");
		WebElement opendom= driver.findElement(By.tagName("my-open-component"));
		SearchContext openroot=opendom.getShadowRoot();
		openroot.findElement(By.cssSelector("input[type='text']")).sendKeys("AAAAAAAAAAAAA");
		
		Actions a=new Actions(driver);
		a.sendKeys(Keys.TAB).sendKeys("BBBBBBBBBBBBBBBBBBBBBb").build().perform();
		a.sendKeys(Keys.TAB).sendKeys("CCCCCCCCCC").build().perform();
		
	    driver.
		
		//WebElement closedroot= driver.findElement(By.tagName("my-close-component"));
		//SearchContext closeroot=closedroot.getShadowRoot();
		//closeroot.findElement(By.cssSelector("input[type='text']")).sendKeys("BBBBBBBBBBBBBB");
	}

}
