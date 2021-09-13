package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
//	select a browser
		WebDriver driver = new ChromeDriver();
//	tell Selenium to wait for 5 seconds for the browser to find and act on elements before throwing an error
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	open a browser and navigate to "http://opensource-demo.orangehrmlive.com/"
		driver.get("http://opensource-demo.orangehrmlive.com/");
//	maximize the window
		driver.manage().window().maximize();
//	enter user name
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
//	enter password
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//	click on login button
		driver.findElement(By.id("btnLogin")).click();
//	click on welcome admin link
		driver.findElement(By.id("welcome")).click();
//	click on log out
		driver.findElement(By.cssSelector("a[contains(text(),'Logout')]")).click();
		
				
	}

}
