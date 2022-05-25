package SeleniumDay_11;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testingJSExecutor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
	        
         WebDriver driver = new ChromeDriver();
       
         // This method will maximize the browser before route to the url
         driver.manage().window().maximize();
         
         
         
         // get method will take you the URL you have given.
       driver.get("https://www.google.com");
       
       JavascriptExecutor js = (JavascriptExecutor) driver;
       
       String innerText = js.executeScript(" return document.documentElement.innerText;").toString();
       System.out.println(innerText);
		
		
		
		
		
		
		
	}

}
