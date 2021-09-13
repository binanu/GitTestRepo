package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChangeColor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
//		select a browser
			WebDriver driver = new ChromeDriver();
//		delete all cookies
			driver.manage().deleteAllCookies();
//		tell selenium to wait for 5 seconds for the browser to find and act on elements before throwing an error
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		open a browser and navigate to "http://opensource-demo.orangehrmlive.com/"
			driver.get("http://jqueryui.com/slider/");
//		maximize the window
			driver.manage().window().maximize();
			Thread.sleep(3000);
//			WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
			WebElement slider = driver.findElement(By.className("ui-slider-handle.ui-corner-all.ui-state-default"));
			Actions act = new Actions(driver);
			act.moveToElement(slider).dragAndDropBy(slider, 60, 0).build().perform();
	}

}
