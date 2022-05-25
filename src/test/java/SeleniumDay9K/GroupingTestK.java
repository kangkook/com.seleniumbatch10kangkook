package SeleniumDay9K;

import org.testng.annotations.Test;

import Utilities.Driver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class GroupingTestK {
	
  @Test
  public void a() {
	  System.out.println("a");
  }
  
  @Test
  public void b() {
	  System.out.println("b");
  }
  
  @Test
  public void c() {
	  System.out.println("c");
  }
  
  @Test
  public void d() {
	  System.out.println("d");
  }
  
  @Test
  public void e() {
	  System.out.println("e");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  Driver.getDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  Driver.tearDown();
  }

}
