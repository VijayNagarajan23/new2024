package com.testngfeatures;

import org.testng.annotations.Test;

public class Grouping {
  @Test(groups = "First Name")
  public void f() {
	  System.out.println("Vijay");
	  System.out.println("Victor");
  }
  @Test(groups = "Last name")
  public void f2() {
	  System.out.println("Vallavan");
	  System.out.println("Vance");
  }
  @Test(groups = "username")
  public void f3() {
	  System.out.println("VJ123");
	  System.out.println("VicVance2");
  }
  @Test(groups = "password")
  public void f4() {
	  System.out.println("Vijay12+");
	  System.out.println("Vic123*");
  }
}
