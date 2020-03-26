package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GoogleLoginTest {
	
	WebDriver driver;
	
	@Test
	public void initDriver() {
		
		// Instantiated the driver object
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		
		driver = new ChromeDriver();
		
		// Go to the website / application URL
		
		driver.get("https://mail.google.com/");
		
		driver.findElement(By.cssSelector(".whsOnd.zHQkBf")).sendKeys("qualitycodebase@gmail.com");
		
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		
		// TestNG verify i am on the right page
		
		boolean ActualResult = driver.findElement(By.cssSelector(".whsOnd.zHQkBf")).isDisplayed();
	
		
		Assert.assertTrue(ActualResult);
				
		
	}
	
	
	@AfterClass
	public void closeDriver() {
		
		driver.quit();
		
	}
	
	

}
