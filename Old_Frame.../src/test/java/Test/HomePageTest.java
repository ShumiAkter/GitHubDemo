package Test;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Basee.BseeClass;

public class HomePageTest extends BseeClass {
	//WebDriver driver;

	@Test(enabled = false, priority = 1)
	public void logoTest() {
		homePage.logoDisplayed();

	}

	@Test(enabled = false, priority = 3)
	public void UserIdTest() {
		homePage.ClickUserIdField();

	}

	@Test(enabled = false, priority = 2)
	public void loginBottomTest01() throws InterruptedException {
		homePage.logonBottomClicked();

	}

	@Test(enabled = false)
	public void forgotPasswordTest() throws InterruptedException {
		homePage.forgotPsddwordClicked();
	}

	@Test(enabled = false)
	public void newUserRegistrationBottomClickTest() throws InterruptedException {
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[text()='New User Registration']")).click();
		Thread.sleep(300);
	}

	@Test(enabled = false)
	public void forgotUserIdTest() {
		homePage.forgotUserIdClick();

	}

	@Test(enabled = false)
	public void unlockLlinkClickedTest() {
		driver.findElement(By.xpath("//a[text()='unlock']")).click();

	}

	@Test(enabled = false)
	public void loginBottomClick02() {
		driver.findElement(By.name("Submit Login")).click();
	}

	@Test(enabled = false)
	public void newUserRegistrationClickTest03() {
		driver.findElement(By.linkText("New User Registration")).click();

	}

	@Test(enabled = false)
	public void newUserRegistrationClickTest04() {
		driver.findElement(By.partialLinkText("New User Regi")).click();
	}

	// for cssselector you can use class or id
	// cssSelector byclass---> first html tag, then dot, then write the valuse of
	// the class attribute inside the string
	@Test(enabled = false)
	public void newUserRegistrationClickTest05() {
		driver.findElement(By.cssSelector("a.cms-newuser-reg")).click();

	}

	@Test(enabled = false)
	public void clickNewUserIdTest() {
		driver.findElement(By.cssSelector("input.cms-login-field.ng-pristine.ng-invalid.ng-touched")).click();
	}

	@Test(enabled = false)
	public void loginBottomtest3() {
		driver.findElement(By.cssSelector("button#cms-login-submit")).click();

	}

	// this is expath for cssDector attribute
	@Test(enabled = false)
	public void loginBottomTest4() {
		driver.findElement(By.cssSelector("button[name='Submit Login']")).click();

	}

	// NOT WORKING
	@Test(enabled = false)
	public void loginBottomTest5() {
		driver.findElement(By.cssSelector("button.cms-green-button-reg[name='Submit Login']]")).click();
	}

	@Test(enabled = false)
	public void loginBottomTest6() {
		driver.findElement(By.cssSelector("button#cms-login-submit[name='Submit Login']")).click();

	}

	@Test(enabled = false)
	public void tableTest() {
		driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=589152046215&hvpos=&hvnetw=g&hvrand=6266664577490873360&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9004339&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_14580410&gclid=Cj0KCQiAgribBhDkARIsAASA5buxZxovFvi3xePihPRVr8__2JpVah36yU3T6Nbio1_d9s3mWXv8NE8aAp-iEALw_wcB");
		String t = driver.findElement(By.tagName("table")).getText();
		System.out.println("The text for the webElement is: " + t);

	}

	@Test(enabled = false)
	public void logoTest2() {
		boolean elementDisplayed = driver.findElement(By.xpath("//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']")).isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + elementDisplayed);
	}

	@Test(enabled = false)
	public void logoButtonTest07() throws InterruptedException {
		boolean logoButtomEnabled = driver.findElement(By.id("cms-login-submit")).isEnabled();
		System.out.println(" Is the Login Button Enables? Ans: " + logoButtomEnabled);
		Thread.sleep(400);
	}

	@Test(enabled = false)
	public void newUserRegistrationTest() {
		boolean nurBattomEnables = driver.findElement(By.xpath("/a[text()='New User Registration']")).isEnabled();
		System.out.println("Is the New Registration button Enabled? " + nurBattomEnables);

	}

	// from the checkBox
	@Test(enabled = false)
	public void use_of_isDelected_method() {
		boolean checkBoxSelected = driver.findElement(By.cssSelector("label#cms-label-tc")).isSelected();
		System.out.print("Is the Check Box Selected? Ans: " + checkBoxSelected);
	}

	// how to find the title of the page
	@Test(enabled = false)
	public void use_of_getTitle_method() {
		System.out.println("The title of the Page is: " + driver.getTitle());

	}

	@Test(enabled = false)
	public void use_of_getTest_method() {// QUESTION WHY WEBELE......
		WebElement nur = driver.findElement(By.xpath("//a[contains(text(),'New')]"));
		System.out.println("The text for the web Element is: " + nur.getText());
	}

	@Test(enabled = false)
	public void use_of_getCurrentURL_method() throws InterruptedException {// QUESTION WHY WEBELE......
		driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
		Thread.sleep(4000);
		System.out.println("The Current RUL is: " + driver.getCurrentUrl());

	}

	@Test(enabled = false)
	public void use_of_getAttribute_method() {
		String value01 = driver.findElement(By.xpath("//a[contains(text(),'New')]")).getAttribute("id");
		String value02 = driver.findElement(By.xpath("//a[contains(text(),'New')]")).getAttribute("class");
		String value03 = driver.findElement(By.xpath("//a[contains(text(),'New')]")).getAttribute("title");
		String value04 = driver.findElement(By.xpath("//a[contains(text(),'New')]")).getAttribute("href");

		System.out.println("The value of the id attribute is: " + value01);
		System.out.println("The value of the id attribute is: " + value02);
		System.out.println("The value of the id attribute is: " + value03);
		System.out.println("The value of the id attribute is: " + value04);

	}

//new 
//we use User 'id' field and'Password' field
	@Test(enabled = false)
	public void use_of_sendkeys_method() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).sendKeys("enthrall_12");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='cms-login-password']")).sendKeys("Nadfg123");
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_sendkeys_method_then_click_submit_and_then_clear() throws InterruptedException {
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Laptop");
		Thread.sleep(5000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("T Shirt");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
		Thread.sleep(5000);

	}

//new
//search field
//enter_key = Enter button in your laptop/destop
	@Test(enabled = false)
	public void use_of_sendkeys_method_then_click_by_enter_key_and_then_clear() throws InterruptedException {
		// driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Laptop", Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("T Shirt", Keys.RETURN);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
		Thread.sleep(5000);

	}

//new
	//we used gecko driver
	@Test(enabled = false)
	public void use_of_navigate_method() throws InterruptedException {
		Thread.sleep(4000);
		driver.navigate().to("https://www.ebay.com");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);

	}
	//new
	//very important interview question
	@Test(enabled = false)
	public void setASpecificSizeOfWindow() throws InterruptedException {
		Dimension dimension = new Dimension(800, 500);
		driver.manage().window().setSize(dimension);
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com");
		Thread.sleep(4000);
		driver.manage().window().setSize(dimension);
		Thread.sleep(4000);
		System.out.println("The size of screen is " + driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().setSize(dimension);
		System.out.println("The size of the screen is "+ driver.manage().window().getSize());
	}
	//dropdown, all categories
	//interview question about dropdown
	//here we sing selectByIndex() emthod
	//most commonly use method in drop down--> selectByvisibleTest()
	@Test(enabled = false)
public void dropdown_selectByIndex_method() throws InterruptedException {
		driver.navigate().to("https://www.ebay.com/");
		WebElement dropElement = driver.findElement(By.name("_sacat"));
		Select select = new Select(dropElement);
		select.selectByIndex(6);
		Thread.sleep(5000);
	}
	@Test(enabled = false)
	
	public void dropdown_selectByvisibleTest_method1() throws InterruptedException {
		driver.navigate().to("https://www.ebay.com/");
		WebElement dropElement = driver.findElement(By.name("_sacat"));
		Select select1= new Select(dropElement);
		select1.selectByVisibleText("DVDs & Movies");
		Thread.sleep(5000);
		
	}
	
	@Test(enabled = false)
	public void mouseHoverActionAboutUs() throws InterruptedException {
		driver.get("https://www.mountsinai.org");
		Actions actions = new Actions(driver);
		WebElement motors= driver.findElement(By.xpath("//a[normalize-space(text())='About Us' and @class='hidden-xs dropdown']"));
		Thread.sleep(5000);
		actions.moveToElement(motors).build().perform();
		Thread.sleep(500);
	}
	@Test(enabled = false)
	public void mouseHoverActionOurLocations() throws InterruptedException {
		driver.get("https://www.mountsinai.org");
		Actions actions =new Actions(driver);
		WebElement ourLocation= driver.findElement(By.xpath("//a[normalize-space(text())='Our Locations']"));
		Thread.sleep(500);
		actions.moveToElement(ourLocation).build().perform();
		Thread.sleep(500);
		
	}
	//lecture from 40
	 //new 
	
	@Test(enabled = false)
	public void use_of_click_method_in_oginBottomTest01() throws InterruptedException {
		driver.get("https://portal.cms.gov/portal/");
		//driver.findElement(By.id("cms-login-submit")).click();
		driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	@Test(enabled = false)
	public void use_of_click_method_in_oginBottomTest02() throws InterruptedException {
		driver.get("https://portal.cms.gov/portal/");
		//driver.findElement(By.id("cms-login-submit")).click();
		driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);

	}
	@Test(enabled = false)
	public void use_of_alternate_of_click_method_in_loginBottmTest() {
		driver.get("https://portal.cms.gov/portal/");
		WebElement loginBtn= driver.findElement(By.id("cms-login-submit"));
		js.executeScript("arguments[0].click()", loginBtn);
		
	}
	//NEW
	
	@Test(enabled = false)
	public void use_of_alternate_of_click_method_in_loginButtonTest04() {
		driver.get("https://portal.cms.gov/portal/");
		js.executeScript("document.getElementByID('cms-login-submit').click();");
	}
	
	//NEW
	
	@Test(enabled = false)
	public void use_of_sendkeys_method_and_click() throws InterruptedException {
		Thread.sleep(4000);
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Laptop", Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(5000);

	}
	//NEW
	//*********NEED HELP
	//Alternative of sending valuse in text field== by using javascript
	@Test(enabled = false)
	public void use_of_sendkeys_method_by_javascriptExcutor() throws InterruptedException {
		Thread.sleep(4000);
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement searchField=	driver.findElement(By.xpath("//input[@id='gh-ac']"));
	WebElement searchButton =	driver.findElement(By.id("gh-btn"));
	js.executeScript("arguments[0].value='Laptop' ", searchField);
	Thread.sleep(500);
	js.executeScript("argument[0].click()", searchButton);
	Thread.sleep(500);
		
	}
	@Test(enabled = false)
	public void how_to_handle_element_by_regular_method() throws InterruptedException {
		Thread.sleep(5000);
		
		
	}
	@Test(enabled = false)
	public void use_of_explicty_wait_in_Mountsonai() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.mountsinai.org");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement requestAnAppionElement = driver.findElement(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"));
	wait.until(ExpectedConditions.visibilityOf(requestAnAppionElement)).click();
	}
	
	//1st WAY: SCROLL BY ACTION CLASS
	@ Test(enabled = true)
	public void use_of_scroll_down_and_scroll_up_action() throws InterruptedException {
		//for scroll down using Action class
	actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	Thread.sleep(500);
	actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	Thread.sleep(500);
		
	}
}
