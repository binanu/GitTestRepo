package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://.opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
//		driver.findElement(By.linkText("Logout")).click();
//		String act_title = driver.getTitle();
//		String exp_title = "OrangeHRM";
		
//		if (act_title.equals(exp_title)) {
//			System.out.println("title verification passed");
//		}
//		else {
//			System.out.println("title verification failed");
//		}
//		
//		driver.close();
		
		
		  
		  driver.close();
	}

}
