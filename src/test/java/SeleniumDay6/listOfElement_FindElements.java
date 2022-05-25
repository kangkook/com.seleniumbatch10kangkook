package SeleniumDay6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class listOfElement_FindElements {


    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://practice.automationtesting.in/test-cases/");
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    

    @Test
    public void printAll18TestCaseName() {
        
        List<WebElement> HomePageTestCaseTitles = driver.findElements(By.xpath("//*[@id='accordion-222-sub_row_1-0-1-0-0']/ul/li"));
        
      //*[@id="accordion-222-sub_row_1-0-1-0-0"]/ul/li
      //*[@id="accordion-222-sub_row_1-0-1-0-0"]/ul/li[2]
      //*[@id="accordion-222-sub_row_1-0-1-0-0"]/ul/li[3]
        
        for(WebElement eachElement:HomePageTestCaseTitles ) {
            String each = eachElement.getText();
            System.out.println("Group 1 -> "+each);}
        }
        
        
        @Test
        public void printAll8TestCaseName() {
            
            List<WebElement> myAccountLoginTitles = driver.findElements(By.xpath("//*[@id=\"accordion-222-sub_row_1-0-1-0-2\"]/ul/li"));
            
          //*[@id="accordion-222-sub_row_1-0-1-0-2"]/ul/li
            //*[@id="accordion-222-sub_row_1-0-1-0-2"]/ul/li[2]

            
            for(WebElement eachElement2:myAccountLoginTitles ) {
                String each2 = eachElement2.getText();
                System.out.println("Group 2 -> "+each2);
            }
             
    }
    
	
}
