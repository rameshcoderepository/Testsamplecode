package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FerlinTest 

{
	  @Test
	    public void setup() 
	  {

		System.setProperty("webdriver.chrome.driver","E:\\Automation\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.ferlini.it/");
			
			 String title = driver.getTitle();
			 System. out.println(title);
			
			 driver.findElement(By.linkText("CONTATTACI")).click();
			
			 String title1 = driver.getTitle();
			 System. out.println(title1);
	
			 WebElement mapElement = driver.findElement(By.xpath("//*[@id=\"page-58c3bbbb03596e9dc41d1b46\"]"));
			 Assert.assertTrue(mapElement.isDisplayed());
			
			 WebElement messageField = driver.findElement(By.xpath("//*[@id=\"textarea-yui_3_17_2_53_1489218200494_4206-field\"]"));
			 messageField.sendKeys("Selenium  NA TestNg Test");
			
			 WebElement nameField = driver.findElement(By.id("text-yui_3_17_2_1_1490690886464_15563-field"));
			 nameField.sendKeys("Lakshmi Narayanan");
			
			 WebElement companyField = driver.findElement(By.id("text-yui_3_17_2_1_1490690886464_16230-field"));
			 companyField.sendKeys("Ferlini Srl");
			
			 WebElement emailField = driver.findElement(By.name("email"));
			 emailField.sendKeys("slakshminarayanan2808@gmail.com");
		
			 WebElement phoneField = driver.findElement(By.xpath("//input[@data-title='Country']"));
			 phoneField.sendKeys("+91");
	
			 WebElement phoneField1 = driver.findElement(By.xpath("//input[@data-title='Areacode']"));
			 phoneField1.sendKeys("866");
			
			 WebElement phoneField2 = driver.findElement(By.xpath("//input[@data-title='Prefix']"));
			 phoneField2.sendKeys("779");
			
			 WebElement phoneField3 = driver.findElement(By.xpath("  //input[@data-title='Line']"));
			 phoneField3.sendKeys("3317");
			
			 WebElement Finish =driver.findElement(By.xpath("//*[@id=\"block-b0936ec21f513f82c110\"]/div/div/div/form/div[2]/input"));
			 Finish.click();
		
			
	 
	  } 
				        		
	}



