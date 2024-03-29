package com.testngfeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f() {
	  System.out.println("Test 1");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("D");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("E");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("C");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("F");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("B");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("G");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("A");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("H");
  }

}
