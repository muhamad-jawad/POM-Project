package com.qa.pages;

import java.util.Locale;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {

	ResourceBundle element;
	
	WebDriver driver1; 

	public void Login(WebDriver driver) {
		
		this.driver1=driver;
		
		 element= ResourceBundle.getBundle("com.qa.TestExcecution.login", Locale.US);
	
	}
	
	public void myAccount() {
		
		driver1.findElement(By.xpath(element.getString("my_account"))).click();
		
	} 
	
	public void loginEmail(String email) {
		
				
		driver1.findElement(By.xpath(element.getString("login_email"))).sendKeys(email);

			
	}
	

	public void loginPass(String pass) {
		
		
		driver1.findElement(By.xpath(element.getString("login_pass"))).sendKeys(pass);

			
	}


	public void loginSubmit() {
		
		
		//driver1.findElement(By.xpath(element.getString("login_sign_in"))).submit();
	
		driver1.findElement(By.xpath(element.getString("login_submit"))).click();
		
		
		
	}

	
	
}
