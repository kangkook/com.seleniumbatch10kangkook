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

	public class dragAndDropTesting {


	    WebDriver driver;
	    Actions act;
	    
	    @Before
	    public void setUp() throws InterruptedException {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("http://demoqa.com/droppable/");
	        driver.manage().window().maximize();
	        // implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    
	    @Test
	    public void simpleDragAndDrop() {
	    	 act = new Actions(driver);
	    	 
	         WebElement source = driver.findElement(By.id("draggable"));
	         WebElement target = driver.findElement(By.id("droppable"));

	         act.dragAndDrop(source, target).build().perform();

	     }
	     
	     @Test
	     public void AcceptDragAndDrop() throws InterruptedException {
	         act = new Actions(driver);
	         
	         driver.findElement(By.id("droppableExample-tab-accept")).click();
	         
	         WebElement source1 = driver.findElement(By.id("acceptable"));
	         WebElement target1 = driver.findElement(By.xpath("//*[@id='droppableContainer']/div/div[2]/div/div[2]"));
	         
	         act.dragAndDrop(source1, target1).build().perform();
	     }         
	         
	     

	     @Test
	     public void preventPropoDragAndDrop() {
	         act = new Actions(driver);
	         
	         driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();
	         
	         WebElement source = driver.findElement(By.id("dragBox"));
	         WebElement target = driver.findElement(By.id("notGreedyInnerDropBox"));

	         act.dragAndDrop(source, target).build().perform();
	         
	         
	     }
	     @Test
	     public void refertDraggableDragAndDrop() {
	         act = new Actions(driver);
	         
	         driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();
	         
//	         WebElement  willRevert = driver.findElement(By.id("revertable"));
//	         WebElement target4 = driver.findElement(By.id("revertableDropContainer"));
//	         act.dragAndDrop(willRevert, target4).build().perform();
//     
//	         
	     }
	    
	    
	     @After
	     public void close() {
	         driver.close();
	     }
	    
	    
	}	    
	    
//	    
//
//	    @Test
//	    public void printAll18TestCaseName() {
//	        
//	        List<WebElement> HomePageTestCaseTitles = driver.findElements(By.xpath("//*[@id='accordion-222-sub_row_1-0-1-0-0']/ul/li"));
//	        
//	      //*[@id="accordion-222-sub_row_1-0-1-0-0"]/ul/li
//	      //*[@id="accordion-222-sub_row_1-0-1-0-0"]/ul/li[2]
//	      //*[@id="accordion-222-sub_row_1-0-1-0-0"]/ul/li[3]
//	        
//	        for(WebElement eachElement:HomePageTestCaseTitles ) {
//	            String each = eachElement.getText();
//	            System.out.println("Group 1 -> "+each);}
//	        }
//	        
//	        
//	        @Test
//	        public void printAll8TestCaseName() {
//	            
//	            List<WebElement> myAccountLoginTitles = driver.findElements(By.xpath("//*[@id=\"accordion-222-sub_row_1-0-1-0-2\"]/ul/li"));
//	            
//	          //*[@id="accordion-222-sub_row_1-0-1-0-2"]/ul/li
//	            //*[@id="accordion-222-sub_row_1-0-1-0-2"]/ul/li[2]
//
//	            
//	            for(WebElement eachElement2:myAccountLoginTitles ) {
//	                String each2 = eachElement2.getText();
//	                System.out.println("Group 2 -> "+each2);
//	            }
//	             
//	    }
//	    
//		
//	}
