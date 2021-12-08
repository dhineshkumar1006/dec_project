package com.demo;

import org.openqa.selenium.WebDriver;
import com.Demo.Base_Class;
import com.Demo.Diff_Main;
import com.Demo.Diff_home;
import com.Demo.Main_Page;

public class Test_Runner extends Base_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		getbrowser("chrome");

		Main_Page m = new Main_Page(driver);
		
		//Diff_home dh = new Diff_home(driver);
		
		//Diff_Main dm = new Diff_Main(driver);

		url("https://www.facebook.com/");

		inputvalueelement(m.getId(), "abcd@gmail.com");

		inputvalueelement(m.getName(), "jklmno");

		clickonelement(m.getBtn());

		Thread.sleep(3000);
		
//		url("http://automationpractice.com/index.php");
//		
//	    clickonelement(dh.getSignin());
//	    
//	    inputvalueelement(dm.getEmail(), "kara2021@gmail.com");
//	    
//	    inputvalueelement(dm.getPswd(), "janadhee");
//	    
//	    clickonelement(dm.getBtn());
	    
	    
	    
	    
		
		

	}
}

