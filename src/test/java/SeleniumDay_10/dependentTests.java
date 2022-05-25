package SeleniumDay_10;

import org.testng.annotations.Test;

import Utilities.Driver;

import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class dependentTests {
		
	
  @Test (dependsOnMethods = {"OpenBrowser"})
  public void AclickOnRSVP() {
//	  Driver.getDriver().findElement(By.xpath("//*[@id=\"wix-events-widget\"]/div/ul/li/div/div[3]/div/a"));
	  System.out.println("this will execute second(clickOnRSVP), it depends on 'OpenBrowser' Method");
  }
  
  @Test
  public void OpenBrowser() {
	  System.out.println("this will execute first(OpenBrowser)");
	  Assert.assertTrue(false);
//	  Driver.getDriver();
  }
  
  @Test
  public void OpenBrowser2() {
	  System.out.println("this will execute second(OpenBrowser)");
	  Assert.assertTrue(false);
  }
  
  @Test(dependsOnMethods = {"AclickOnRSVP"})
  public void thirdMethod() {
	  System.out.println("this depends on 'AclickOnRSVP' method");
//	  Assert.assertTrue(false);
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  
  @AfterMethod
  public void afterMethod() {
  }

}
