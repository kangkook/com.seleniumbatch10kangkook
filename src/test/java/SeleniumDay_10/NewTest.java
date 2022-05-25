package SeleniumDay_10;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
  
	
	
	
	@Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
		System.out.println("Printing these items: --" + n + "=" + s);
		
  }

  @DataProvider(name="dp")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 3, "b" },
      new Object[] { 4, "b" },
      new Object[] { 5, "b" },
      new Object[] { 6, "b" },
      new Object[] { 7, "b" },
      new Object[] { 8, "b" },
      new Object[] { 9, "b" },
      new Object[] { 10, "b" },
      new Object[] { 11, "b" },
      new Object[] { 12, "b" },
      new Object[] { 13, "b" },
      
    };
	  
	  
	  
  }
  
  
  ///
  @DataProvider(name = "data-provider")
  public Object[][] dpMethod() {
      return new Object[][] { { "First-Value" }, { "Second-Value" }, { "Third-Value" } };
  }

  @Test(dataProvider = "data-provider")
  public void myTest(String val) {
      System.out.println("Passed Parameter Is : " + val);
  }
}
