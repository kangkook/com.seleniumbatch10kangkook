package SeleniumDay3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testGoogleSite {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		
	WebDriverManager.chromedriver().setup();	
	
    driver = new ChromeDriver();
	
    
    driver.get("https://www.google.com/");
//    System.out.println("Open Browser");
//    driver.navigate().to("https://www.techcircleschool.com/");
    driver.manage().window().maximize();
	}
	
	@Test
	public void searchItem() {
//		driver.findElement(By.name("q")).sendKeys("TechCircle School", Keys.ENTER);
		
//		driver.findElement(By.name("q")).sendKeys("TechCircle School", Keys.ENTER);

		
		
				
	WebElement searchInputBox = driver.findElement(By.name("q"));
  	       
		       searchInputBox.sendKeys("TechCircle School");
		       searchInputBox.submit();
		
	}
	
	
	
	
	

}
