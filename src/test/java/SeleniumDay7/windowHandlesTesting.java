package SeleniumDay7;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandlesTesting {


	    WebDriver driver;
	    Actions act;
	    
	    @Before
	    public void setUp() throws InterruptedException {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://demoqa.com/browser-windows/");
	        driver.manage().window().maximize();
	        // implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    
	    public void windowNewTab() throws InterruptedException {
	    	// clicks on NewTab blue button
	    	driver.findElement(By.xpath("//*[@id='tabButton']")).click();
	    	
	    	// verifies that i am still on homePage	    	
	    	System.out.println("HomePage -- ToolsQA = "+driver.getTitle());
	    	
	    	Set<String> ids = driver.getWindowHandles();
	    	
	    	Iterator<String> it = ids.iterator();
	    	
	    	String homePage = it.next();
	    	String newTab = it.next();
	    	
	    	driver.switchTo().window(newTab);
	    	
	    	Thread.sleep(3000);
	    	
	    	System.out.println("HomePage -- https://demoqa.com/browser-windows/ = " +driver.getCurrentUrl());
	    			
	    	
	    	
	    	
	    	
	    }
	
	
	
	
	
	
	
	
	

}
