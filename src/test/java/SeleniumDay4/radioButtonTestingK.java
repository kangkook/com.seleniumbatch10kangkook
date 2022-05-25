package SeleniumDay4;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radioButtonTestingK {

	/*
	 * 1. go to https://demoqa.com/radio-button
2. verify if first radio button is unchecked by default
3. verify if second radio button is unchecked by default
4. verify if third radio button is disabled by default
5. click on the second radio button ' Impressive'
6. verify text 'You have selected Impressive' is displayed
	 */
	
WebDriver driver;
    
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
    }
 
    @Test
    public void radioButtonSelected() {
        
//        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();

    	
//        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();

    	
//        driver.findElement(By.xpath("//*[@id=\"noRadio\"]")).isEnabled();

    	
//        Boolean radioButton1Selected = driver.findElement(By.id("yesRadio")).isSelected();
//        Boolean radioButton2Selected = driver.findElement(By.id("impressiveRadio")).isSelected();
//        Boolean radioButton3Selected = driver.findElement(By.id("noRadio")).isEnabled();
//
//   
//        
//        if(radioButton1Selected) {
//            driver.findElement(By.id("yesRadio")).click();
//        }else{
//            System.out.println("the Yes button is by default unchecked");
//        }
//        
//        if(radioButton2Selected) {
//            driver.findElement(By.id("impressiveRadio")).click();
//        }else{
//            System.out.println("the Impressive button is by default unchecked");
//        }
//        
//        if(radioButton3Selected) {
//            System.out.println("the No Button is enabled");
//          
//        }else{
//            System.out.println("the No button is disabled");
//        }
//        
//        
//        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();
//
//        Boolean textMessage =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p")).isDisplayed();
//        
//        if(textMessage) {
//            System.out.println("good job");
//        }
    }
}
