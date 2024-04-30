package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	 
    public void setup() {
  
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         
         
  
    
    }

    public void tearDown() {
    	 if (driver != null) {
             driver.quit();
         }
    }
}
