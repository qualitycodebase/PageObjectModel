package pom;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends LoginPage {
	
	@Test(description="This TC will perform valid login",priority = 1)
	public void loginToApplication() throws Throwable
	{
		
	Assert.assertTrue(addbutton, "User logged in successfully");
		
		
	}
	
	
	@Test(description="This TC will perform invalid login", priority = 2)
	public void loginToApplication1() throws InterruptedException
	{
	
	AssertJUnit.assertEquals(ActualResult, ExpectedResult);
		
	}

}
