package com.qa.TestExcecution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.createDriver;
import com.qa.pages.login;

public class loginTest {


WebDriver driver;
	
	
	@BeforeMethod
	public void launch() {
		
		createDriver a= new createDriver();
		driver = a.generateDriver();
		
	}
	
	@Test
	
	public void tc_01 () throws Exception {
		
				
			login s= new login();
		    s.Login(driver);
		    s.myAccount();
		    Thread.sleep(5000);
			s.loginEmail("jawad123@gmail.com");
			Thread.sleep(5000);
			s.loginPass("Jawad123");
			Thread.sleep(5000);
			s.loginSubmit();
			
	
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
	}
	
	
	
	
	
	
	
	
}
