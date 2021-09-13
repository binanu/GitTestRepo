package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Validation {

	public static void main(String[] args) throws InterruptedException {

//	set the web driver and give the file path
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
//	create an object for the web driver selected
		WebDriver driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//	navigate to URL
	    driver.get("https://jqueryui.com/tooltip/");
//	maximize window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement ageBox = driver.findElement(By.id("age"));
		String toolTipText = ageBox.getAttribute("title");
		System.out.println(toolTipText);
		if (toolTipText.equals("We ask for your age only for statistical purposes.")) {
			System.out.println("tool tip test passed");
		}else {
			System.out.println("tool tip test failed");
		}
	}

}
