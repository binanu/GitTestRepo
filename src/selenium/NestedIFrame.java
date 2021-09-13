package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
//	select a browser
		WebDriver driver = new ChromeDriver();
//	tell Selenium to wait for 5 seconds for the browser to find and act on elements before throwing an error
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	open a browser and navigate to "http://opensource-demo.orangehrmlive.com/"
		driver.get("http://demo.automationtesting.in/Frames.html");
//	maximize the window
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		WebElement outerFrame = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/iframe[1]"));
		driver.switchTo().frame(outerFrame);
		
		WebElement innerFrame = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/iframe[1]"));
		driver.switchTo().frame(innerFrame);
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("any name");
	}

}
