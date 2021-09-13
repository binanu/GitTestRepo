package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
//		select a browser
			WebDriver driver = new ChromeDriver();
//		delete all cookies
			driver.manage().deleteAllCookies();
//		tell selenium to wait for 5 seconds for the browser to find and act on elements before throwing an error
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		open a browser and navigate to "http://opensource-demo.orangehrmlive.com/"
			driver.get("http://the-internet.herokuapp.com/key_presses");
//		maximize the window
			driver.manage().window().maximize();
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(3000);
			act.sendKeys(Keys.DELETE).build().perform();
			Thread.sleep(3000);
			act.sendKeys(Keys.SPACE).build().perform();
			Thread.sleep(3000);
			act.sendKeys(Keys.SHIFT).build().perform();
			
			

	}

}
