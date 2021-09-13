package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
// open web browser
// open URL "https://www.google.com/
//		
		
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("title = " + title);
//		System.out.println("the page src of google home page is: - " + driver.getPageSource());
		if (title.equals("Google")) {
			System.out.println("title verification passed");
		}
		else {
			System.out.println("title verification failed");
		}
		System.out.println("the url for google home page is: - " + driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		if (url.equals("https://www.google.com/")) {
			System.out.println("url verification passed");
		}
		else {
			System.out.println("url verification failed");
		}
			
//		driver.get("https://facebook.com/");
//		title = driver.getTitle();
//		System.out.println("title = " + title);
//		System.out.println("the url for facebook home page is: - " + driver.getCurrentUrl());
////		System.out.println("the page src of facebook home page is: - " + driver.getPageSource());
//
//		driver.get("https://www.walmart.com/");
//		title = driver.getTitle();
//		System.out.println("title = " + title);
//		System.out.println("the url for walmart home page is: - " + driver.getCurrentUrl());
////		System.out.println("the page src of walmart home page is: - " + driver.getPageSource());
		if (url.equals("https://www.google.com/")) {
			System.out.println("url verification passed");
		}
		else {
			System.out.println("url verification failed");
		}
		
		driver.quit();
		
		
	}

}
