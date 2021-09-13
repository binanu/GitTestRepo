package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wiki {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
//	select a browser
		WebDriver driver = new ChromeDriver();
//	delete cookies
		driver.manage().deleteAllCookies();
//	tell Selenium to wait for 5 seconds for the browser to find and act on elements before throwing an error
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	open a browser and navigate to "http://opensource-demo.orangehrmlive.com/"
			driver.get("https://www.wikipedia.org/");
//	maximize the window
		driver.manage().window().maximize();
//	enter any name in to the search box
		driver.findElement(By.id("searchInput")).sendKeys("Hussein");
//	click on search button
		driver.findElement(By.xpath("//button[@type='submit']/i")).click();
	}

}
