package com.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Diff_Main {

	public Diff_Main(WebDriver driver2) {

	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
	
	
	}

	public WebDriver driver;

	@FindBy(xpath = "(//input[@class='is_required validate account_input form-control'])[2]")
	private WebElement email;
	
	@FindBy(xpath = "(//input[@class='is_required validate account_input form-control'])[3]")
	private WebElement pswd;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement btn;
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPswd() {
		return pswd;
	}
	public WebElement getBtn() {
		return btn;
	}
	
	


	}


