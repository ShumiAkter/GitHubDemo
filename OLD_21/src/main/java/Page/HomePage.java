package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//img[@alt='Mount Sinai']" )
	WebElement logo;
	
	public boolean logoDisplayed() {
		boolean shum = logo.isDisplayed();
		return shum;
		
	}
	
	
	

}
