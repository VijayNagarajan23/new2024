package com.testngfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Timeup {
	public WebDriver driver;
  @Test(priority = 0)
  public void f() throws Throwable {
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(3000);
	  
  }
  @Test(priority = 1,timeOut = 4000)
  public void f1() throws Throwable {
	  WebElement element = driver.findElement(By.linkText("Create new account"));
	  element.click();
	  Thread.sleep(2000);
	  driver.close();
  }
}
