package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
WebDriver driver;

	
	@BeforeMethod
	public void setupApplication()
	{
		
		Reporter.log("=====Browser Session Started=====", true);
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		
        driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.21-points.com/");
		
		Reporter.log("=====Application Started=====", true);
	}
	
	
	@AfterMethod
	public void closeApplication()
	{
		driver.quit();
		
		Reporter.log("=====Browser Session End=====", true);
		
	}

}
