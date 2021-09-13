package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
//	select a browser
		WebDriver driver = new ChromeDriver();
//	delete all cookies
		driver.manage().deleteAllCookies();
//	tell selenium to wait for 5 seconds for the browser to find and act on elements before throwing an error
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	open a browser and navigate to "http://opensource-demo.orangehrmlive.com/"
		driver.get("https://opensource-demo.orangehrmlive.com/");
//	maximize the window
		driver.manage().window().maximize();
//	enter user name
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//	enter password 
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	click on login button
		driver.findElement(By.id("btnLogin")).click();
//	hover the mouse on 'Admin'
		Thread.sleep(2000);
//		Action hoverMouse = new Action
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
		
		int rowCount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println(rowCount);
		
		int count = 0;
		for (int r=1; r<=rowCount; r++) {
			String status = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr[1]/td[5]")).getText();
			if (status.equals("Enabled")) {
				count++;
			}
		}
		
		System.out.println("number of enabled employees = " + count);
		System.out.println("number of disabled employees = " + (rowCount-count));
		
		driver.quit();
		}

}
