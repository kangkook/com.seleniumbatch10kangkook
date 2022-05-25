package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementK {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // This method will maximize the browser before route to the url
        driver.manage().window().maximize();

        // get method will take you the URL you have given.
        driver.get("https://www.amazon.com");
//        Thread.sleep(3000);
        
        
        
//        driver.findElement(By.id("twotabsearchtextbox"));
//        dirver.findElement(By.className(<string>);
//        dirver.findElement(By.linkText(<string>);
//        dirver.findElement(By.tagName(<string>));
        /*
         * method "sendKeys"
         */
    
       WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("asdaSD");
       
       WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
       
       /*
        * If you would like to send some data / string to the
        * 
        * .sendKeys(<string>)
        */
       
       
       searchBox.sendKeys("labtop");
       
       /*
        * If you would like to replicate the enter button action
        * 
        * .submit();
        */
       
       searchBox.submit();
       
       
       
       
       searchButton.click();
       
       
       driver.quit();
       
       
       /*
        * 
        * CSS: 
        * it will go top to buttom when it search the element.
        * 
        * Xpath:
        * it can search the element top to buttom or buttom to top
        * 
        * 
        * Dynamic Element
        * id = searchBoxTop232
        * 
        * 
        * 
        * 
        * Xpath vs CSS

CSS:

    * it will go top to buttom when it search the element.

Xpath
    
    * it can search the element top to buttom or buttom to top 

    Relative Xpath

        we can write unique xpath

            contain
            start with 
            end with 
            link text

            Xpath=   ( //Tag_name[@attribute_name=¡¯Attribute_value¡¯] )

    Absloute Xpath 


            /html/body/div/div/div[3]/div/div/main/div/div/div/div[2]/div/div/div/section[3]

Dynamic Element

    id = searchBoxTop232
    id = searchBoxMiddle1232


    Do you prefer to using Xpath or CSS ?

    I prefer xpath, because it can go to parent to child or child to parent and we can handle the different situations.

    How do you handle dynamic Element? 

            I am using relative xpath and creating my own Xpath with contain / start with / end with 
        * 
        * 
        * 
        */
		
		
		
	}

}
