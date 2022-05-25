package SeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
	        
         WebDriver driver = new ChromeDriver();
       
         // This method will maximize the browser before route to the url
         driver.manage().window().maximize();
         
         
         
         // get method will take you the URL you have given.
       driver.get("https://www.google.com");
		
       // driver.gettitle will return the current page of the title
       String title = driver.getTitle().toString();
       System.out.println("title: "+title);
       
       
       // driver.getCurrentUrl will return the current page of the url
       String url = driver.getCurrentUrl().toString();
       System.out.println("url: "+url);
       
       
      
       driver.navigate().to("https://www.youtube.com");
       
       // this method for stopping the code execution the amount of the milisecond.
       Thread.sleep(3000);
       
       // navigate().back will take you back to the previous page.
       driver.navigate().back();
       
       
       // navigate.forward will take you the 2nd page
       driver.navigate().forward();
       
       
       // this will return the source file (html) !!! DONT USE IT !!!
//       String pagesource = driver.getPageSource().toString();
       
       System.out.println("!!! PASS !!!");
       
       // 
       driver.quit();
       
		// this will close the tab / window
//		driver.close();
		
	}

}
