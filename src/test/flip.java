package test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class flip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
	    WebElement links=driver.findElement(By.className("_3sdu8W"));
	    Actions a= new Actions(driver);
	    for (int i=0;i<links.findElements(By.tagName("a")).size();i++) {
	    	String web=Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	links.findElements(By.tagName("a")).get(i).sendKeys(web);
	    	Thread.sleep(2000);
	    }
	    
	   Set<String> pages= driver.getWindowHandles();
	 Iterator<String> abc=  pages.iterator();
	 
	 for (int i=0;i<pages.size();i++) {
		 driver.switchTo().window(abc.next());
		 System.out.println(driver.getTitle());
	 }
	    



	}

}
