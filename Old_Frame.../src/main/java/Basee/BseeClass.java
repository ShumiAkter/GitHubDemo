package Basee;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Page.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BseeClass {
	protected WebDriver driver;
	protected HomePage homePage;
	protected JavascriptExecutor js;
	protected Actions actions;
	protected  WebDriverWait wait;
		

	@BeforeMethod
	public void setup() {
		// system is a class and setproperty is a method
		// ******//System.setProperty("webdriver.chrome.driver","/Users/shumiakter/eclipse-workspace/gov.portal.cms1/driver/chromedriver");
		// webdriver is a interface and chromeDriver is concreat class whic implements
		// WebDriver interface
		// new 2nd way to show location
		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		// + "/driver/chromedriver") ;

		// 3d wayt o sholow location
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");

		// new
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		actions = new Actions(driver);
		js = (JavascriptExecutor)driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
				
		// WebDriverManager.chromedriver().driverVersion("104.0.5112.79").setup();
		
		// for Firefox Driver
		// WebDriverManager.chromedriver().driverVersion("104.0.5112.70").setup();
		// driver = new FirefoxDriver();

		//new
		driver.manage().window().fullscreen();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://portal.cms.gov/portal/");
		driver.get("https://www.ebay.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		homePage = new HomePage(driver);
	}

	@AfterMethod
	public void terarUp() {
		driver.quit();
	}
}
