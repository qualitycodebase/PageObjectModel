package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass{
	
	boolean addbutton ; 
	String ActualResult;
	String ExpectedResult;
	
	
	public void verifyValidLoginCase() {
		
         driver.findElement(By.xpath("(//span[contains(.,'Account')])[3]")).click();
		
		 driver.findElement(By.xpath("(//span[contains(.,'Sign In')])[2]")).click();
		
		
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Adminuser");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tech2009");
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(.,'Sign in')])[2]\""))).click();
		
		
		
		
		addbutton = driver.findElement(By.xpath("//a[contains(.,'Add Points')]")).isDisplayed();
	}
	
	
	public void VerifyInvalidUserLogin() {
		
        driver.findElement(By.xpath("(//span[contains(.,'Account')])[3]")).click();
		
		driver.findElement(By.xpath("(//span[contains(.,'Sign In')])[2]")).click();
		
		
        driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Adminuser");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin1");
		
		driver.findElement(By.xpath("(//span[contains(.,'Sign in')])[2]")).click();
		
		ActualResult = driver.findElement(By.xpath("//span[contains(.,'Failed to sign in! Please check your credentials and try again.')]")).getText();
		
		ExpectedResult = "Failed to sign in! Please check your credentials and try again.";
	}

}
