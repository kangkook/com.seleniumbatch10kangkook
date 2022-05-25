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

	public class dragAndDropTestingFrame {


	    WebDriver driver;
	    Actions act;
	    
	    @Before
	    public void setUp() throws InterruptedException {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://jqueryui.com/droppable/");
	        driver.manage().window().maximize();
	        // implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    
	    @Test
	    public void simpleDragAndDrop() {
	    	 act = new Actions(driver);
	    	 
	    	 System.out.println(driver.findElement(By.tagName("iframe")).getSize());
	    	 
	    	 driver.switchTo().frame(0);
	    	 
	    	 
	    	 
	    	 
	         WebElement source = driver.findElement(By.id("draggable"));
//	         WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
	       //*[@id="draggable"]
	         
	         
	         WebElement target = driver.findElement(By.id("droppable"));
//	         WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));
	       //*[@id="droppable"]

	         act.dragAndDrop(source, target).build().perform();

	         driver.switchTo().defaultContent();
	         
	         
	     }
	
	
	
}
