package SaturdayReview05072022;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textboxTest2 {
		
		static WebDriver driver;
		static WebDriverWait wait;
		
		
		@BeforeClass
		public static void setUp() {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demoqa.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver,5); 
			
		}
		
		@Before
		public void elements() {
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]")).click();
			
			//*[@id="app"]/div/div/div[2]/div/div[1]/div/div[2]/svg/path
			
			
			driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
			
			//*[@id=\"item-0\"]/svg/path
		}
		
		
		
		@Test
		public void fullNameTextbox()  {
//			driver.findElement(By.id("userName")).sendKeys("TechCircle");
			driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("TechCircle");
			//*[@id="userName"]
			
		}
		
		@Test
		public void emailTextbox()  {
			driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("TechCircle@gmail.com");
			//*[@id="userEmail"]
			
		}
		
		@Test
		public void currentAddress()  {
			driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Current Address TechCircel");
			//*[@id="currentAddress"]
			
		}
		
		@Test
		public void permanentAddress()  {
			driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("Permanent Address TechCircle");
			//*[@id="permanentAddress"]
			
		}
		
//		@AfterClass
//		public void submit() {
//			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
//			
//			//*[@id="submit"]
//		}
//		
		
	
}