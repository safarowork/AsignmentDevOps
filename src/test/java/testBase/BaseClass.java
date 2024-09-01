package testBase;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, URISyntaxException
	{
		
		
	/*	DesiredCapabilities decap = new DesiredCapabilities();
		
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
		*/
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}

	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
