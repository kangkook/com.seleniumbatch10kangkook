package SeleniumDay9K;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class testPriorityInTestNG {
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

  @Test(priority=1)
  public void c() {
	  System.out.println("f");
  }
  
  @Test(priority=2)
  public void b() {
	  System.out.println("c");
  }
  
  @Test(priority=3)
  public void a() {
	  System.out.println("c");
  }
  
}
