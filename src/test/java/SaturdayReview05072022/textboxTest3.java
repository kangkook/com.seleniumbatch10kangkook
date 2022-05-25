package SaturdayReview05072022;

import java.util.concurrent.TimeUnit;

import org.junit.After;
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

public class textboxTest3 {
		
		static WebDriver driver;
		static WebDriverWait wait;
		
		
		@BeforeClass
		public static void setUp() {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demoqa.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver,3); 
		}	
		
		@Before
		public void textbox() {
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
		}
		
		@Test
		public void test3() {
			WebElement fullNameTextbox = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
			WebElement emailTextbox = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
			WebElement currentAddress = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
			WebElement permanentAddress = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));

			fullNameTextbox.sendKeys("TechCircle");
			emailTextbox.sendKeys("TechCircle@gmail.com");
			currentAddress.sendKeys("Current Address");
			permanentAddress.sendKeys("Permanent Address");
		}
		
		@After
		public void submit() {
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		}
}