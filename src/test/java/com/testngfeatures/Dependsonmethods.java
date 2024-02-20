package com.testngfeatures;

import org.testng.annotations.Test;

public class Dependsonmethods {
  @Test
  public void f() {
	  System.out.println("Square");
 }
  @Test(dependsOnMethods = "f")
  public void f2() {
	  System.out.println("rectangle");
  }
  @Test(dependsOnMethods = "f")
  public void f3() {
	  System.out.println("Triangle");
  }
  
}
