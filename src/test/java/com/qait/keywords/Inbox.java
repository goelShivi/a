package com.qait.keywords;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Inbox {
	
 WebDriver driver;
	
	public Inbox(WebDriver driver){
			this.driver=driver;
		}
	
	
	static String s=null;
	
	
	
	public void Inbox_function() throws InterruptedException{  
		 
		int count,oldcount=0,index=1;
		int unreademailcount;
		List<WebElement> myElements;
		   
	   
		  String value = driver.findElement(By.xpath("//span/a[@ href='https://mail.google.com/mail/u/0/#inbox']")).getAttribute("title");
      
		System.out.println("value:"+value);
		String s1 = value.substring(value.indexOf('(')+1, value.lastIndexOf(')'));
		System.out.println("Value::"+s1);
		
			
		String value2 = driver.findElement(By.xpath("//div/span[@class='Dj']/b[3]")).getText();
		 System.out.println("value2:"+value2);
		 int vInt2 = Integer.parseInt(value2);	
		 
		 
		 System.out.println("vInt2:"+vInt2);
			
			String value3 = driver.findElement(By.xpath("//div/span[@class='Dj']/b[2]")).getText();
			 System.out.println("value3:"+value3);
			 int vInt3 = Integer.parseInt(value3);	
			 System.out.println("vInt3:"+vInt3);
			int div=vInt2/vInt3;
			int mod=vInt2%vInt3;
			
			System.out.println("div:"+div);
			System.out.println("mod:"+mod);
			System.out.println("testing");
			
		
			 if(mod==0 && div==0)
			 {
				 System.out.println("Inbox is empty");
				 
			
			 }
			 else if(mod!=0 && div==0)
			 {
				//less than 10	
				 
				 By mySelector = By.xpath("//div[@role='main']//tbody//tr//td[@tabindex]/div[@class]//span[@id]/b ");
					 myElements = driver.findElements(mySelector);
					count=myElements.size();
					System.out.println("count1:"+count);	 
			 
			 }else if(mod==0 && div!=0)
			 {
			 //proper div
				 
				 
				for(int temp=1;temp<=div;temp++){
					if(index>0 && index<=3)
					{   
						By mySelector = By.xpath("//div[@role='main']//div[@class='y6']//b");
						List<WebElement> myElements2 = driver.findElements(mySelector);
						unreademailcount=myElements2.size();
						 System.out.println("count2:"+unreademailcount);
						 oldcount=oldcount+unreademailcount;
						
						System.out.println("oldcount2:"+oldcount);
						System.out.println("1");
						System.out.println("index"+index);
						
						Thread.sleep(5000);
						driver.findElement(By.xpath("(//div[@aria-label='Older'])["+index+"]")).click();
						
						
						
						System.out.println("temp complete:"+temp);
						index++;
						}
					else{
						By mySelector = By.xpath("//div[@role='main']//div[@class='y6']//b");
						List<WebElement> myElements2 = driver.findElements(mySelector);
						unreademailcount=myElements2.size();
						 System.out.println("count2:"+unreademailcount);
						 oldcount=oldcount+unreademailcount;
						
						System.out.println("oldcount2:"+oldcount);
						System.out.println("1");
						System.out.println("index"+index);
						
						Thread.sleep(5000);
						driver.findElement(By.xpath("(//div[@aria-label='Older'])[4]")).click();
						
					
						System.out.println("temp complete:"+temp);
						index++;	
						
					}
					
				} 
				 
			 }else if(mod!=0 && div!=0)
			 {
			 //not fully div
				 
				 for(int temp=1;temp<=div+1;temp++){
						

						if(index>0 && index<=3)
						{   
							By mySelector = By.xpath("//div[@role='main']//div[@class='y6']//b");
							List<WebElement> myElements2 = driver.findElements(mySelector);
							unreademailcount=myElements2.size();
							 System.out.println("count2:"+unreademailcount);
							 oldcount=oldcount+unreademailcount;
							
							System.out.println("oldcount2:"+oldcount);
							System.out.println("1");
							System.out.println("index"+index);
							
							Thread.sleep(5000);
							driver.findElement(By.xpath("(//div[@aria-label='Older'])["+index+"]")).click();
							
							
							
							System.out.println("temp complete:"+temp);
							index++;
							}
						else{
							By mySelector = By.xpath("//div[@role='main']//div[@class='y6']//b");
							List<WebElement> myElements2 = driver.findElements(mySelector);
							unreademailcount=myElements2.size();
							 System.out.println("count2:"+unreademailcount);
							 oldcount=oldcount+unreademailcount;
							
							System.out.println("oldcount2:"+oldcount);
							System.out.println("1");
							System.out.println("index"+index);
							
							Thread.sleep(5000);
							driver.findElement(By.xpath("(//div[@aria-label='Older'])[4]")).click();
							
						
							System.out.println("temp complete:"+temp);
							index++;	
							
						}

				 } 
			 }else{
				 System.out.println("Invalid");	 
			 }
			 //return driver;	
}

}
