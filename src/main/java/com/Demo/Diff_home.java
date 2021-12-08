package com.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Diff_home {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;
	
	public Diff_home(WebDriver driver2) {

	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getSignin() {
		return signin;
	}

}
