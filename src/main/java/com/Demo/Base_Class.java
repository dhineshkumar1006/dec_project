package com.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class {

	public static WebDriver driver;//-->null
	
	public static void getbrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"//driver//chromedriver.exe");	
			
			 driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"//driver//geckodriver.exe");	
			
			 driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
	}

	
	
	public static void url(String url) {

		driver.get(url);
	}

	public static void clickonelement(WebElement element) {

		element.click();
	}

	public static void inputvalueelement(WebElement element, String value) {

		element.sendKeys(value);
	}
	public static void close() {

		driver.close();
	}
	public static void quit() {

		driver.quit();
	}

}
