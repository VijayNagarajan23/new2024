package com.testngfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocation {
	public WebDriver driver;
  @Test(priority = -1)
  public void f() throws Throwable {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
	  WebElement element = driver.findElement(By.linkText("Create new account"));
		element.click();
		Thread.sleep(2000);
	   
	  
  }
  @Test(priority = 1,invocationCount = 3)
  public void f1() throws Throwable {
	  WebElement Surname = driver.findElement(By.name("lastname"));
		Surname.sendKeys("N");
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("2468");
		Thread.sleep(1000);
  }
  @Test(priority = 2)
  public void f3() throws Throwable {
	  
		Thread.sleep(1000);
		driver.close();
  }
  
  @Test(priority = 0,invocationCount = 3)
  public void f2() throws Throwable {
	  WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Vijay");
		Thread.sleep(1000);
		
  }
}
