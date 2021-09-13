package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
//		select a browser
			WebDriver driver = new ChromeDriver();
//		tell Selenium to wait for 5 seconds for the browser to find and act on elements before throwing an error
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		open a browser and navigate to "http://opensource-demo.orangehrmlive.com/"
			driver.get("http://html.com/input-type-file/");
//		maximize the window
			driver.manage().window().maximize();
			List<WebElement> links = driver.findElements(By.tagName("a"));
//		count the number of links in the application	
			
			System.out.println(links.size());
//		print the name of the links in the application
			for (WebElement e:links) {
				System.out.println(e.getText());
			}
			
     		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\owner\\Desktop\\UFT Suff");
	}

}
