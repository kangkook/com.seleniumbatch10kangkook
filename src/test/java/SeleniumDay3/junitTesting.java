package SeleniumDay3;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class junitTesting {
		
		WebDriver driver;
		
		@BeforeClass
		public static void beforeClass() {
			System.out.println("Before Class");
		}
		
		@AfterClass
		public static void afterClass() {
			System.out.println("After Class");
		}
		
		
		@Before
		public void setUp() {
			
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muwool\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
		WebDriverManager.chromedriver().setup();	
			
        driver = new ChromeDriver();
		
        
        driver.get("https://www.techcircleschool.com/");
        System.out.println("Open Browser");
        driver.navigate().to("https://www.techcircleschool.com/");
        
    }
		@Test
		public void test1() {
				System.out.println("Test1");
		        driver.get("https://www.google.com/");

		}
		
		@Test
		public void test2() {
			System.out.println("Test2");
	        driver.navigate().to("https://www.naver.com/");

		}
		
		@Test
		public void test3() {
			System.out.println("Test3");
		}
		
		@Ignore
		@Test(expected = ArithmeticException.class)
		public void test4() {
			System.out.println("Test4");
			int i = 45/0;
			System.out.println(i);
		}
		
		@Ignore
		@Test(timeout = 5000)
		public void test5() {
			System.out.println("Test5");
		}
		
		@Ignore
		@After
		public void tearDown() {
			driver.close();
			System.out.println("Close Browser");
		}

}
	
	
	
	
	
	
	
	
	
	
	
	

