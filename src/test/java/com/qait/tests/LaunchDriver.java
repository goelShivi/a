package com.qait.tests;

import org.testng.annotations.Test;

public class LaunchDriver {

	String app_url_AACT_OMA = getYamlValue("app_url_AACT");
	
	@Test
	public void driver_initialize() throws InterruptedException {
		
		test.launchApplication(app_url_AACT_OMA);
		
		
		
		
		
//		 object_class_obj = new object_class();
//		 object_class_obj.driver_obj.driver_funtion();
//		 object_class_obj.reprtAction.report();
//		Reporter.log("driver_initialize()", true);
//		Reporter.log(System.getProperty("browser"),true);
		

	}
//  	@BeforeClass
//	@Test(priority = 2)
//	public void login_test() throws InterruptedException {
//
//		object_class_obj.login_obj1.URL_Launch_func();
//		object_class_obj.login_obj1.Username_func();
//		object_class_obj.login_obj1.passward_submit_func();
//
//		Reporter.log("login_test", true);
//	}
	
//	@Test(priority = 3)
//	public void inbox_test() throws InterruptedException {
//
//		object_class_obj.inbox_obj.Inbox_function();
//		 
//		 Reporter.log("inbox_test", true);
//
//	}
//
//	@Test(priority = 4)
//	public void logout_test() throws InterruptedException {
//
//		object_class_obj.logout_obj1.Logo_click_func();
//		object_class_obj.logout_obj1.Logout_button_click_func();
//		
//		Reporter.log("logout_test", true);
//	}
//
//	@AfterSuite
//	public void driver_close() throws InterruptedException {
//
//		//Logout_button_click_driver.quit();
//		
//		Reporter.log("driver_close()", true);
//
//	}

}
