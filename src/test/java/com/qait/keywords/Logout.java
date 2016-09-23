package com.qait.keywords;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Logout {
	
 WebDriver driver;
	
  public Logout(WebDriver driver){
			this.driver=driver;
		}
	
	public void Logo_click_func() throws InterruptedException{  
	
	   
	         WebElement element4=driver.findElement(By.xpath("//span[@class='gb_3a gbii']"));
	         element4.click();
//return driver;
	       
	        
	         
	   
	         //driver.quit();

}

	
	
	public void Logout_button_click_func() throws InterruptedException{  
		
	     

	       
	         WebElement element5=driver.findElement(By.id("gb_71"));
	         element5.click();
	         
	  
	         driver.quit();
	         
	         //return driver;
	         

}
	
	
}
