package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;
import Page.Login;

public class LoginTest extends Base{
private Login login;
@BeforeTest
public void setup() {
	super.setup();
	login = new Login(driver);
}
@Test
public void asertlogin() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize WebDriverWait with a timeout of 10 seconds

	// Wait for the element to be visible
	WebElement headerElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5")));

	// Get the text of the header element
	String pageHeaderText = headerElement.getText();

	// Assert that the page header text matches the expected value
	Assert.assertEquals(pageHeaderText, "Login", "Page header text doesn't match");
}
@Test
public void login() {
	login.user("Admin","admin123");
	
}
@Test
public void search() {
	login.user("Admin","admin123");
	login.search("admin");
}
@Test
public void claim() {
	login.user("Admin","admin123");
	login.clickclaim();
	login.emname("employee");
}
}
