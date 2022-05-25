package SaturdayReview04302022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationtesting {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://practice.automationtesting.in/shop/");
		

		
//		WebElement searchBox = driver.findElement(By.id("menu-item-50"));
		
		WebElement myAccount = driver.findElement(By.id("menu-item-50"));
		
		
//		searchBox.sendKeys("camera");
		
		myAccount.click();
		
//		Thread.sleep(2000);
		
//		String title = driver.getTitle().toString();
//		
//		String expectedTitle = "Amazon.com : camera";
//
//		
//
//		if(title.equals(expectedTitle)) {
//			System.out.println("title is matching and it is: " + title);
//			driver.quit();
//			
//		}else {
//			System.out.println("expected title: " + expectedTitle + " , " + "actual title: " + title);
//		}
//		
		
		
		
	}

}