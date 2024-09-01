package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='nav-logo-sprites']") 
	@CacheLookup  WebElement logo;
	
	public boolean verifyLogoDisplay()
	{
		boolean status = logo.isDisplayed();
		return status;
	}
	

}
