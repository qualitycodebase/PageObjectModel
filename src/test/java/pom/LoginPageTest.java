package pom;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
	
	@Test(description="This TC will perform valid login",priority = 1)
	public void loginToApplication() throws Throwable
	{
		driver.findElement(By.xpath("(//span[contains(.,'Account')])[3]")).click();
		
		
		driver.findElement(By.xpath("(//span[contains(.,'Sign In')])[2]")).click();
		
		
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Adminuser");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tech2009");
		
		
		//driver.findElement(By.xpath("(//span[contains(.,'Sign in')])[2]")).click();
		
		// Add an explicit wait for Sign in button
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(.,'Sign in')])[2]\""))).click();
		
		
		
		
		boolean addbutton = driver.findElement(By.xpath("//a[contains(.,'Add Points')]")).isDisplayed();
		
		// TestNG
		Assert.assertTrue(addbutton, "User logged in successfully");
		
		//driver.navigate().back();
		
		Thread.sleep(5000);
		
		// TestNG -> compare actual vs expected 
		// Generate emailable htmt, xml test report 
		// Prioritize test cases (1)
		// Anotations @Test , @BeforeMethod / AfterMethod, @BeforeClass / AfterMethod, @BeforeTestSuite 
		// testng.xml 
		
	}
	
	
	@Test(description="This TC will perform invalid login", priority = 2)
	public void loginToApplication1() throws InterruptedException
	{
		driver.findElement(By.xpath("(//span[contains(.,'Account')])[3]")).click();
		
		driver.findElement(By.xpath("(//span[contains(.,'Sign In')])[2]")).click();
		
		
        driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Adminuser");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin1");
		
		driver.findElement(By.xpath("(//span[contains(.,'Sign in')])[2]")).click();
		
		
		
	String ActualResult = driver.findElement(By.xpath("//span[contains(.,'Failed to sign in! Please check your credentials and try again.')]")).getText();
	
	String ExpectedResult = "Failed to sign in! Please check your credentials and try again.";
	
	// TestNG
	
	AssertJUnit.assertEquals(ActualResult, ExpectedResult);
		
	}

}
