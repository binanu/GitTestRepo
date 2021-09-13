package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
//	set the web driver and give the file path
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
//	create an object for the web driver selected
		WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//	Navigate to URL
	    driver.get("http://api.jquery.com/dblclick/");
//	maximize window
		driver.manage().window().maximize();
//  identify the frame		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size() + " frame on the page");
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("/html/body/div"));
		Thread.sleep(2000);
		
			Actions act = new Actions(driver);
			act.doubleClick(ele).build().perform();
			Thread.sleep(2000);
			
			act.doubleClick(ele).build().perform();
			Thread.sleep(2000);

			act.doubleClick(ele).build().perform();
			Thread.sleep(2000);
			
	}

}
