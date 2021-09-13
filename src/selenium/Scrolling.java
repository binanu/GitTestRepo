package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
//		set the web driver and give the file path
			System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
//		create an object for the web driver selected
			WebDriver driver = new ChromeDriver();
		    driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		navigate to URL
		    driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
//		maximize window
			driver.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript(arg0, arg1)
//		
	}

}
