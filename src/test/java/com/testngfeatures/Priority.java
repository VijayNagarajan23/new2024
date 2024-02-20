package com.testngfeatures;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Priority {
	public WebDriver driver;
  @Test(priority = -1)
  public void f1() throws Throwable {
	  driver = new ChromeDriver();
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("https://www.facebook.com/");
	  WebElement element = driver.findElement(By.linkText("Create new account"));
	  element.click();
	  Thread.sleep(2000);
	  WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Vijay");
		WebElement Surname = driver.findElement(By.name("lastname"));
		Surname.sendKeys("N");
		Thread.sleep(2000);
	  WebElement element1 = driver .findElement(By.name("birthday_day"));
	  element1.click();
	  Thread.sleep(3000);
	  driver.close();
  }
  @Test(priority = 0)
  public void f2() throws Throwable {
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
	  Thread.sleep(4000);
	  WebElement element = driver.findElement(By.linkText("Create new account"));
	  element.click();
	  Thread.sleep(2000);
	  WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Vijay");
		WebElement Surname = driver.findElement(By.name("lastname"));
		Surname.sendKeys("N");
		Thread.sleep(2000);
		WebElement element1 = driver .findElement(By.name("birthday_day"));
		  element1.click();
		  Thread.sleep(3000);
		  driver.close();	  
	  
  }
  @Test(priority = 1)
  public void f3() throws Throwable {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
	  WebElement element = driver.findElement(By.linkText("Create new account"));
	  element.click();
	  Thread.sleep(2000);
	  WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Vijay");
		WebElement Surname = driver.findElement(By.name("lastname"));
		Surname.sendKeys("N");
		Thread.sleep(2000);
	  WebElement element1 = driver .findElement(By.name("birthday_day"));
	  element1.click();
	  Thread.sleep(3000);
	  driver.close();	     
  }
  
  
  
  //@Test(priority = 1)
  //public void f3() throws Throwable {
	//  WebElement firstname = driver.findElement(By.name("firstname"));
		//firstname.sendKeys("Vijay");
		//WebElement Surname = driver.findElement(By.name("lastname"));
		//Surname.sendKeys("N");
		//Thread.sleep(4000);
		//driver.close();
	  
//  }
}
