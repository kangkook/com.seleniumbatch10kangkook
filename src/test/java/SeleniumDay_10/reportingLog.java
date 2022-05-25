package SeleniumDay_10;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class reportingLog {
	
	
	
  @Test
  public void f() {
	  
	  Reporter.log("before Assertion");
	  
	  
	Assert.assertTrue(true);;
	System.out.println("if this code execute, assertion pass");
	Reporter.log("if this code execute, assertion pass");
	  
	  
  }
  
  
  
}
