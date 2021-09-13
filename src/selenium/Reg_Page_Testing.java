package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reg_Page_Testing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.partialLinkText("Forg")).click();
		driver.navigate().back();
//		driver.findElement(By.partialLinkText("Ter")).click();
		
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ahhag");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("dhahg");
//		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ahdgja@gmail.com");
//		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ahdgja@gmail.com");
//		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("ahghg123");
//		driver.findElement(By.xpath("//span[2]//input[1]")).click();
//		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
//		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 layerConfirm _2rsa uiOverlayButton _4jy3 _4jy1 selected _51sy']")).click();
//		
	}

}
