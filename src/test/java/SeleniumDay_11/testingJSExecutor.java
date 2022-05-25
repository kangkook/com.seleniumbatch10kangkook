package SeleniumDay_11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testingJSExecutor {

	public static void main(String[]args) {

		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement okButton = driver.findElement(By.id(""));
		
		js.executeScript("document.getElementById('enter element id').click();");
		
		// or
		
		js.executeScript("arguments[0].click();",okButton);
		
		
		////////////////////////////
		

		
		
}
}