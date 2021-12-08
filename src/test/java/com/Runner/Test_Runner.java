package com.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Runner {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("abcd@gmail.com");

		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		pswd.sendKeys("jaku1029");

		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		btn.click();
	}
}
