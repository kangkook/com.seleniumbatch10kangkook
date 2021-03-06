package SeleniumDay6;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertBoxTestingTola {

	WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void alerts() throws InterruptedException {

        // first alert
        driver.findElement(By.xpath("//*[@id='alertButton']")).click();

        Thread.sleep(3000);

        driver.switchTo().alert().accept();
        // Thread.sleep(2000);

        // timer Alert
        wait = new WebDriverWait(driver, 30);
        
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("timerAlertButton"))));
        driver.findElement(By.id("timerAlertButton")).click();
        //Thread.sleep(5000);
        
        wait.until(ExpectedConditions.alertIsPresent());

    //    driver.switchTo().alert().wait(7000);
        
        Alert timerAlert = driver.switchTo().alert();
        System.out.println(timerAlert.getText());
        Thread.sleep(2000);
        timerAlert.accept();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
        String actualText = driver.findElement(By.xpath("//*[@id=\"confirmResult\"]")).getText();
        String expectedText = "You selected Ok";
        Assert.assertEquals(expectedText, actualText);


		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
        
        String actualText1 = driver.findElement(By.xpath("//*[@id=\"promptResult\"]")).getText();
        String expectedText1 = "You entered Hello";  //correct text expectation
        Assert.assertEquals(actualText1, expectedText1); //hard assertion
        System.out.println("Hello assert passed");


    }
	
	
}
