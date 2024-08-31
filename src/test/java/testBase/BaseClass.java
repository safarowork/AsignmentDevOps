package testBase;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;
	
	@Parameters({"os", "browser"})
	@BeforeClass
	public void setUp(String os, String browser) throws MalformedURLException, URISyntaxException
	{
		DesiredCapabilities decap = new DesiredCapabilities();
		
		switch(os.toLowerCase())
		{
		case "windows" : decap.setPlatform(Platform.WIN10); break;
		case "linux" : decap.setPlatform(Platform.LINUX); break;
		case "mac" : decap.setPlatform(Platform.MAC); break;
		default: System.out.println("Invalid OS"); return;
		}
		
		switch(browser.toLowerCase())
		{
		case "chrome" : decap.setBrowserName("chrome"); break;
		case "edge" : decap.setBrowserName("MicrosoftEdge"); break;
		case "firefox" : decap.setBrowserName("firefox"); break;
		default: System.out.println("Invalid browser"); return;
		}
		
		URL url = new URI("http://localhost:4444/wd/hub").toURL();
		
		driver = new RemoteWebDriver(url, decap);
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}

	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
