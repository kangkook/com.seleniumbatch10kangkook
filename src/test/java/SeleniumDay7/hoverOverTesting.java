package SeleniumDay7;


	import java.util.List;
	import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
	import org.junit.Ignore;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hoverOverTesting {


	    WebDriver driver;
	    Actions act;
	    
	    @Before
	    public void setUp() throws InterruptedException {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("http://www.amazon.com/");
	        driver.manage().window().maximize();
	        // implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    
	    
	    @Test
	    public void hoverOverTest() {
	    	act = new Actions(driver);
	    	
	        WebElement amazonMenu = driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));    
	        
	        act.moveToElement(amazonMenu).build().perform();
	        
	    	
	    	
	    }
	    
	    
	    
	    
}