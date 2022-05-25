package SeleniumDay4;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homework {
	
	WebDriver driver;
	
//	homework
//	1. go to https://demoqa.com/checkbox
//	2. expand all the checkboxes
//	3. verify if all the checkboxes are unchecked by default
//	4. click on 'Home', Parent Checkbox
//	5. now verify if all the checkboxes are checked

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
    }
 
    @Test
    public void checkCheckBoxes() {
    	
    	
    	
    	
//    	 Boolean isYesBoxSelected = driver
//                 .findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[2]/label")).isSelected();
//
//         Boolean isImpressiveBoxSelected = driver
//                 .findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/label")).isSelected();
//
//         Boolean isNoBoxEnabled = driver
//                 .findElement(By.xpath("//*[@id=\"noRadio\"]")).isEnabled();
//
//         if (isYesBoxSelected) {
//             driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
//         } else {
//             System.out.println("The Yes box is default unchecked");
//         }
//
//         if (isImpressiveBoxSelected) {
//             driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();
//
//         } else {
//             System.out.println("The Impressive box is default unchecked");
//         }

	
	
	
}
}