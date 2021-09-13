package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginJava {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
//	select a browser
		WebDriver driver = new ChromeDriver();
//	delete cookies
		driver.manage().deleteAllCookies();
//	tell Selenium to wait for 5 seconds for the browser to find and act on elements before throwing an error
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	open a browser and navigate to "http://opensource-demo.orangehrmlive.com/"
		driver.get("https://opensource-demo.orangehrmlive.com/");
//	maximize the window
		driver.manage().window().maximize();
//	enter an invalid user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
//	enter an invalid password
		driver.findElement(By.id("txtPassword")).sendKeys("admin12");
//	click on login button
		driver.findElement(By.id("btnLogin")).click();
//	take a screenshot of the current page
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	copy the screenshot to a desired section
		FileUtils.copyFile(src, new File("C:/Users/owner/eclipse-workspace/GreatSeleniumAnkur/src/selenium/HRMlogin.png"));
//	close the browser
		driver.close();

	}

}
