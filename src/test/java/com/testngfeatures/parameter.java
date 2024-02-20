package com.testngfeatures;

import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.testng.annotations.Test;

public class parameter {
	@Parameters()
	@Test
  public void f1(String uname) {
	  System.out.println("username is:"+uname);
  }
  @Test
  @Parameters  
  public void f2(String Password) {
	  System.out.println("password:"+Password);
  }
}
