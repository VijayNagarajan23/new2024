package com.testngfeatures;


import org.testng.Assert;
import org.testng.annotations.Test;

public class assertnew {
  @Test
  public void f() {
	  String a="square";
	  String b="Square";
	  Assert.assertEquals(a, b);
  }
  @Test
  public void f2() {
	  String a="Square";
	  String b="Square";
	  Assert.assertEquals(a, b);
  }
  
}
