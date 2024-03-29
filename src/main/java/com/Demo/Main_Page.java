package com.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_Page {
	
	public WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement id;
	
	@FindBy(name = "pass")
	private WebElement name;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btn;
	
	public Main_Page(WebDriver driver2) {

	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
	
	}
	public WebElement getId() {
		return id;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getBtn() {
		return btn;
	}
	


}