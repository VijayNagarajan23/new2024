package com.testngfeatures;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exception1 {
	
	public class Exception {
		public WebDriver driver;
	  @Test
	  public void f() throws Throwable {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(1000);
		  driver.get("https://www.google.com/");
	  }
	  @Test(expectedExceptions = NoSuchElementException.class)
	  public void f2() throws Throwable {
		  WebElement element = driver.findElement(By.xpath("//textarea[@id='APjFqq']"));
		  element.sendKeys("Amazon");
		  Thread.sleep(1000);
		  driver.close();
	  }

	}
}