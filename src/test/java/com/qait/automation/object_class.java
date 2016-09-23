package com.qait.automation;

import keywords.ReportAction;

import org.openqa.selenium.WebDriver;

import ShiviFrameWork.ActionPackage.Inbox;
import ShiviFrameWork.ActionPackage.Login;
import ShiviFrameWork.ActionPackage.Logout;
import ShiviFrameWork.DriverPackage.Driver_class;


public class object_class {
     public Driver_class driver_obj;
	 Login login_obj1=null;
	 Inbox inbox_obj=null;
	 Logout logout_obj1=null;
	  WebDriver driver=null;
	  public ReportAction  reprtAction=null;
	  
	public object_class() throws InterruptedException{ 
		
		
		
		 //Driver
		driver_obj=new Driver_class();
		
		//driver= driver_obj.driver_funtion();
		//Report
		reprtAction=new ReportAction();
		
		 //Login
	     login_obj1= new Login(driver);
        
    
	     //Inbox
	     inbox_obj= new Inbox(driver);
	     
     
	     //Logout
	     logout_obj1= new Logout(driver);
	    
      

          }
}
