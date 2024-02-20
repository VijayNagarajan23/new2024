package com.testngfeatures;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
  @Test(dataProvider = "f2")
  public void f1(String username,String password) {
	  System.out.println("Username is:"+username);
	  System.out.println("Password is:"+password);
	  
  }
  @Test
  @DataProvider
  public Object[][] f2() {
	  
	  return new Object[][]{{"user1","123"},{"user2","456"},{"user3","789"},{"user4","143"}};
	  
	  
	  
  }
}
