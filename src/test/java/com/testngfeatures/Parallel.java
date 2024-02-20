package com.testngfeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel {
  @Test
  public void f() throws Throwable {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  driver.close();
  }
  @Test
  public void f2() throws Throwable {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver1 = new EdgeDriver();
	  driver1.get("https://www.google.com");
	  Thread.sleep(2000);
	  driver1.close();
	  
  }
  @Test
  public void f3() throws Throwable {
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver2 = new FirefoxDriver();
	  driver2.get("https://www.google.com");
	  Thread.sleep(2000);
	  driver2.close();
  }
}
