package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	
	private WebDriver driver;
    private  By username = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
    private  By password = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
    private  By login    = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    private  By search   = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input");
    private  By claim    = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[11]/a");
    private  By emloyname= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"); 
    public Login (WebDriver driver) {
    	this.driver=driver;
    }
    public void user(String name, String pass) {
    	
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(username));
        usernameField.click();
        usernameField.sendKeys(name);

        WebElement passField = wait.until(ExpectedConditions.elementToBeClickable(password));
        passField.click();
        passField.sendKeys(pass);

        driver.findElement(login).click();
        
    }
    public void search(String ser) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(search));
        searchField.click();
        searchField.sendKeys(ser);
    }
    public void clickclaim() {
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

          WebElement claimField = wait.until(ExpectedConditions.elementToBeClickable(claim));
          claimField.click();
         
    }
    public void emname(String emname) {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

         WebElement emnam = wait.until(ExpectedConditions.elementToBeClickable(emloyname));
         emnam.click();
         emnam.sendKeys(emname);
    }
}
