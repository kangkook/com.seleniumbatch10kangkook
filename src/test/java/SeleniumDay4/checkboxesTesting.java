package SeleniumDay4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxesTesting {

    WebDriver driver;
    
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @Test
    public void checkCheckboxes() throws InterruptedException {
        
        
        //verify if checkboxes are unchecked by defaulth
            //if checked, uncheck them
        Boolean checkbox1Selected = driver.findElement(By.xpath("//div[@id='content']/div/form/input[1]")).isSelected();
        Boolean checkbox2Selected = driver.findElement(By.xpath("//div[@id='content']/div/form/input[2]")).isSelected();
        
//        String checkbox1Text = driver.findElement(By.xpath("//div[@id='content']/div/form/input[1]")).getText();
//        String checkbox2Text = driver.findElement(By.xpath("//div[@id='content']/div/form/input[2]")).getText();
//        
        
        if(checkbox1Selected) {
            driver.findElement(By.xpath("//div[@id='content']/div/form/input[1]")).click();
        }else{
            System.out.println("the checkbox1 is by default unchecked");
        }
        
        if(checkbox2Selected) {
            driver.findElement(By.xpath("//div[@id='content']/div/form/input[2]")).click();
        }else{
            System.out.println("the checkbox2 is by default unchecked");
        }
        
        
    }
    
		
		
		//*[@id="content"]/ul/li[6]
		
		
		//*[@id="content"]/ul/li[6]
		
		

	
}
