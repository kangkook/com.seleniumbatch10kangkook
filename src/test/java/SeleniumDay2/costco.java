package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class costco {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.costco.com");
		
		WebElement searchBox = driver.findElement(By.id("search-field"));
	
		searchBox.sendKeys("labtop");
		
		WebElement searchButton = driver.findElement(By.id("co-search-thin"));
		
//		searchBox.sendKeys("labtop");
		searchButton.click();
		
			


	}

}
