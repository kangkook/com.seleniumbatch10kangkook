package SaturdayReview05072022;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textboxTest4 {
		
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

		@Test
		public void test4() {
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
			
			
			driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("test123");
			driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("test123@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("1234 Abcd Dr.");
			driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("same as current address");
			
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			
			String name = driver.findElement(By.xpath("//*[@id=\"name\"]")).getText();
//			String name = driver.findElement(By.xpath("//*[@id=\"name\"]/text()[2]")).getText();


			System.out.println(name);
					
					//*[@id="name"]
			//*[@id="name"]/text()[2]
			
			String expectedName = "Name:test123";
//			String expectedName = "test123";
			
			Assert.assertEquals(expectedName, name);
			
			
			
			
		}
}