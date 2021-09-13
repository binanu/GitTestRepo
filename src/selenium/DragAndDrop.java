package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
//	select a browser
		WebDriver driver = new ChromeDriver();
//	delete all cookies
		driver.manage().deleteAllCookies();
//	tell selenium to wait for 5 seconds for the browser to find and act on elements before throwing an error
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	open a browser and navigate to "http://opensource-demo.orangehrmlive.com/"
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//	maximize the window
		driver.manage().window().maximize();
		WebElement sourceRome = driver.findElement(By.id("box6"));
		WebElement targetItaly = driver.findElement(By.id("box106"));
		
		WebElement sourceMadrid = driver.findElement(By.id("box7"));
		WebElement targetSpain = driver.findElement(By.id("box107"));
		
		WebElement sourceOslo = driver.findElement(By.id("box1"));
		WebElement targetNorway = driver.findElement(By.id("box101"));
		
		WebElement sourceStockholm = driver.findElement(By.id("box2"));
		WebElement targetSweden = driver.findElement(By.id("box102"));
		
		WebElement sourceWahington = driver.findElement(By.id("box3"));
		WebElement targetUS = driver.findElement(By.id("box103"));
		
		WebElement sourceCopenhagen = driver.findElement(By.id("box4"));
		WebElement targetDenmark = driver.findElement(By.id("box104"));
		
		WebElement sourceSeoul = driver.findElement(By.id("box5"));
		WebElement targetSouthKorea = driver.findElement(By.id("box105"));
		
		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(sourceOslo, targetNorway).build().perform();
		act.dragAndDrop(sourceWahington, targetUS).build().perform();
		act.dragAndDrop(sourceCopenhagen, targetDenmark).build().perform();
		act.dragAndDrop(sourceSeoul, targetSouthKorea).build().perform();
		act.dragAndDrop(sourceMadrid, targetSpain).build().perform();
		act.dragAndDrop(sourceStockholm, targetSweden).build().perform();
		act.dragAndDrop(sourceRome, targetItaly).build().perform();
		
		
	}

}
