package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	 WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	//1st way to write webelement
	@FindBy(xpath = "//em[@id='cms-homepage-header-logo-unauth' and @class=\"cms-icon cms-sprite-loggedout ms-3\"] ")
	WebElement logo;

	@FindBy(xpath = "//input[@id='cms-login-userId']")
	WebElement userId;

	@FindBy(id = "cms-login-submit")
	WebElement loginBottom;

	// seocnd to write webelement
	By forgotUserIdBy = By.id("cms-forgot-userid");

//3d way to write webelement
	@FindBy(how = How.XPATH, using = "//a[text()='Password' and @id='cms-forgot-password']")
	WebElement forgotPassword;

	public boolean logoDisplayed() {
		boolean sha = logo.isDisplayed();
		System.out.println("The logo is Displayed " + sha);
		return sha;
	}

	public void ClickUserIdField() {
		userId.click();
	}

	public void logonBottomClicked() throws InterruptedException {
		Thread.sleep(300);
		loginBottom.click();
		Thread.sleep(300);
	}// second way to write webelement:

	public void forgotUserIdClick() {
		driver.findElement(forgotUserIdBy).click();
		

	}
public void forgotPsddwordClicked() throws InterruptedException {
	Thread.sleep(400);
	forgotPassword.click();
	Thread.sleep(400);
	
}
}
