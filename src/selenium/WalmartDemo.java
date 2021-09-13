package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalmartDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		
		String title = driver.getTitle();
		System.out.println("title = " + title);
//		System.out.println("the url for walmart home page is: - " + driver.getCurrentUrl());
//		System.out.println("the page src of walmart home page is: - " + driver.getPageSource());
		String url = driver.getCurrentUrl();
		if (url.equals("https://www.walmart.com/")) {
			System.out.println("url verification passed");
		}
		else {
			System.out.println("url verification failed");
		}
		
		driver.close();
	}

}
