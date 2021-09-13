package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
//		select a browser
			WebDriver driver = new ChromeDriver();
//		delete all cookies
			driver.manage().deleteAllCookies();
//		tell selenium to wait for 5 seconds for the browser to find and act on elements before throwing an error
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		open a browser and navigate to "http://opensource-demo.orangehrmlive.com/"
			driver.get("http://opensource-demo.orangehrmlive.com");
//		maximize the window
//			enter user name
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		enter password 
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		click on login button
			driver.findElement(By.id("btnLogin")).click();
			
			driver.manage().window().maximize();
			Thread.sleep(3000);

			WebElement hoverOnAdmin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b"));
			WebElement hoverOnUserMgmt = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
			WebElement hoverOnUser = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
			
			Actions act = new Actions(driver);
			Thread.sleep(3000);
			act.moveToElement(hoverOnAdmin).build().perform();
			Thread.sleep(3000);
			act.moveToElement(hoverOnUserMgmt).build().perform();
			Thread.sleep(3000);
			act.moveToElement(hoverOnUser).build().perform();
			

	}

}
