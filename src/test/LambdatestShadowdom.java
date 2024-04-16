package test;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdatestShadowdom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/shadow-dom");
		WebElement root=driver.findElement(By.id("shadow_host"));
		SearchContext dom=root.getShadowRoot();
		dom.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("SANDY");
		dom.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("SANDESH");
		
		WebElement root2=driver.findElement(By.tagName("shadow-signup-form"));
		SearchContext dom2=root2.getShadowRoot();
		dom2.findElement(By.cssSelector("input[name='username']")).sendKeys("adcfadcs");

	}

}
