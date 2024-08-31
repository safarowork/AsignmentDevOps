package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.HomePage;
import testBase.BaseClass;

public class LogoVeriicationTest extends BaseClass{
	
	HomePage homepage;
	
	@Test
	void testLogo()
	{
		homepage = new HomePage(driver);	
		
		Assert.assertEquals(homepage.verifyLogoDisplay(), true);
	}

}
