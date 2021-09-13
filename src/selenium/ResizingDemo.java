package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizingDemo {

	public static void main(String[] args) throws InterruptedException {
//	set the web driver and give the file path
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
//	create an object for the web driver selected
		WebDriver driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//	navigate to URL
	    driver.get("http://jqueryui.com/resizable/");
//	maximize window
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		Thread.sleep(3000);
		Actions resize = new Actions(driver);
		resize.moveToElement(element).dragAndDropBy(element, 200, 50).build().perform();
	}

}
