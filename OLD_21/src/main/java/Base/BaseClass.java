package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Page.HomePage;

public class BaseClass {
	protected WebDriver driver;
	protected HomePage homePage;
	
	
	
	@BeforeMethod
	public void setup() {
		System. setProperty("webdriver.chorme.driver", "/Users/shumiakter/eclipse-workspace/org.mountsinai/driver");
		driver = new ChromeDriver();
		driver.get("https://www.mountsinai.org/");
		homePage = new HomePage(driver);
		
	}
	@AfterMethod
	private void terUp() {
		driver.quit();
		
	}
	
	

}
