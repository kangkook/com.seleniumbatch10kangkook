package SeleniumDay7;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandlesTesting2 {


	    WebDriver driver;
	    Actions act;
	    
	    @Before
	    public void setUp() throws InterruptedException {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://demoqa.com/browser-windows");
	        driver.manage().window().maximize();
	        // implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    }
	    
	    @Test
	    public void windowNewTab() throws InterruptedException {
	        //clicks on NewTab blue button
	        driver.findElement(By.xpath("//*[@id='tabButton']")).click();
	        
	        //verifies that i am still on homePage
	        System.out.println("HomePage -- ToolsQA = "+ driver.getTitle());

	        Set<String> ids = driver.getWindowHandles();
	        
	        Iterator<String> it = ids.iterator();
	        
	        String homePage = it.next();
	        String newTab = it.next();
	        
	        driver.switchTo().window(newTab);
	        
	        Thread.sleep(3000);
	        System.out.println("NewTab -- https://demoqa.com/sample = " + driver.getCurrentUrl());
     
	        driver.switchTo().window(homePage);
		    	////////////////////////////
	    	
	    			Thread.sleep(5000);
        //clicks on NewTab blue button
        driver.findElement(By.xpath("//*[@id='windowButton']")).click();
//        driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();
      //*[@id="windowButton"]
        
        //verifies that i am still on homePage
        System.out.println("HomePage -- ToolsQA = "+ driver.getTitle());

        Set<String> ids2 = driver.getWindowHandles();
        
        Iterator<String> it2 = ids2.iterator();
        
        String homePage2 = it2.next();
        String newTab2 = it2.next();
        
        driver.switchTo().window(newTab);
        
        Thread.sleep(3000);
        System.out.println("NewWindowTab -- https://demoqa.com/sample = " + driver.getCurrentUrl());

        driver.switchTo().window(homePage2);
		Thread.sleep(5000);

	    	///////////////////////////////
	    	
        //clicks on NewTab blue button
        driver.findElement(By.xpath("//*[@id='messageWindowButton']")).click();
        
        //verifies that i am still on homePage
        System.out.println("HomePage -- ToolsQA = "+ driver.getTitle());

        Set<String> ids3 = driver.getWindowHandles();
        
        Iterator<String> it3 = ids3.iterator();
        
        String homePage3 = it3.next();
        String newTab3 = it3.next();
        
        driver.switchTo().window(newTab);
        
        Thread.sleep(3000);
        System.out.println("NewWindowMessageTab -- https://demoqa.com/sample = " + driver.getCurrentUrl());
        
        driver.switchTo().window(homePage3);
	    	
	    }
	
	//////////////////
//	    jqueryui.com/droppable
	
	
	
	
	
	
	

}
