package com.qait.keywords;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Login {
	
	WebDriver driver;
	WebElement element1;
	
	  public Login(WebDriver driver){
		this.driver=driver;
	}
	
	public  WebDriver URL_Launch_func() throws InterruptedException{  
		 
		
		  //Url launch
		System.out.println("driver"+driver);
		  driver.get("http://gmail.com");
		  System.out.println("driver2"+driver);
		  
		  return driver;
	
}
	
	
	
	public  WebDriver Username_func() throws InterruptedException{  
		 
		  
		
		  //login 
		element1= driver.findElement(By.id("Email"));
	      element1.sendKeys("qaittestautomation@gmail.com");
          element1.submit();
          
          return driver;
          
   }
	
	
	public void enterEmail(String email){
		  WebElement element1 = driver.findElement(By.id("Email"));
	      element1.sendKeys("qaittestautomation@gmail.com");

	}
	
	public void click_Cancel(){
		
	}
	
	public void click_Submit(){
		
	}
	
	
	public void userTestCancelLogin(){
		
	}
	
	public void passward_submit_func() throws InterruptedException{  
		 
	         WebElement element2 = driver.findElement(By.id("Passwd"));  
	         element2.sendKeys("qainfotech@123");
	         element2.submit();	 
	         
	         
	       
}
}
