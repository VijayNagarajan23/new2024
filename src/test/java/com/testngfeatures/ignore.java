package com.testngfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignore {
	public WebDriver driver;
  @Test(priority = 0)
  public void f1() throws Throwable {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.get("https://www.facebook.com");
  }
  @Test(priority = 2)
  @Ignore
  public void f2() throws Throwable {
	  WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("vijayarcade4@gmail.com");
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("Vijay123+");
  }
  @Test(priority = 1)
  public void f3() throws Throwable {
	  WebElement element = driver.findElement(By.linkText("Create new account"));
	  element.click();
	  Thread.sleep(4000);
	  WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Vijay");
		Thread.sleep(4000);
		WebElement Surname = driver.findElement(By.name("lastname"));
		Surname.sendKeys("N");
  }
}
