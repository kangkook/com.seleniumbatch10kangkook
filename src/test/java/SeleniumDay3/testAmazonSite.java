package SeleniumDay3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testAmazonSite {
	
	WebDriver driver;
	
//	@Before
	public void setUp() {
		
	WebDriverManager.chromedriver().setup();	
	
    driver = new ChromeDriver();
	
    
    driver.get("https://www.amazon.com/");
    driver.navigate().to("https://www.amazon.com/");
    driver.manage().window().maximize();
	}
	

	
	

}
