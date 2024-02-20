package com.testngfeatures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
  @Test
  public void f() {
	  String a = "Triangle";
	  String b = "triangle";
	  SoftAssert s = new SoftAssert();
	  s.assertEquals(a,b);
  }
  
  @Test
  public void f2() {
	  String a ="Triangle";
	  String b= "triAnGle";
	  SoftAssert s = new SoftAssert();
	  s.assertEquals(a, b);
  }
}
