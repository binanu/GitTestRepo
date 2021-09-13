package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.partialLinkText("Forg")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Ter")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Coo")).click();
		driver.navigate().back();
//		driver.findElement(By.partialLinkText("Data P")).click();
//		driver.navigate().back();
		driver.findElement(By.partialLinkText("Create a")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Esp")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Sign U")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Log")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Mess")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Facebook L")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Wat")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Peo")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Pag")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Pla")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Pri")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Ad")).click();
//		driver.navigate().back();
			
	}

}
