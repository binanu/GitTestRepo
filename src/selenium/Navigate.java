package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
//	select a browser
		WebDriver driver = new ChromeDriver();
//	delete cookies
		driver.manage().deleteAllCookies();
//	tell Selenium to wait for 5 seconds for the browser to find and act on elements before throwing an error
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	open a browser and navigate to "http://opensource-demo.orangehrmlive.com/"
		driver.get("https://facebook.com");
//	maximize the window
		driver.manage().window().maximize();
//  navigate to walmart.com		
		driver.navigate().to("https://www.twitter.com/");
		Thread.sleep(2000);
//	navigate back to google 
		driver.navigate().back();
		Thread.sleep(2000);
//	navigate forward to Walmart
		driver.navigate().forward();
//	refresh the page
		driver.navigate().refresh();
		


	}

}
