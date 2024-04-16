package test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class TestNG {
	WebDriver driver;

	@Test
	public void element() {
		WebElement shadowHost = driver.findElement(By.id("shadow_host"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		System.out.println(shadowRoot.findElement(By.className("info")).getText());
		
		
		WebElement shadowHost1 = shadowRoot.findElement(By.cssSelector("#nested_shadow_host"));
		SearchContext shadowRoot1= shadowHost1.getShadowRoot();
		
		System.out.println(shadowRoot1.findElement(By.cssSelector("#nested_shadow_content")).getText());
	}

	@BeforeTest
	public void abc() {
		driver = new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		// return;
	}
}