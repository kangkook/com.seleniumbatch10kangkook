package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) {

	        WebDriverManager.chromedriver().setup();

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://www.amazon.com");
		
	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	       
	       WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	       
	       
	       searchBox.sendKeys("playstation 5");
	       searchButton.click();
	       
		
	}

}
