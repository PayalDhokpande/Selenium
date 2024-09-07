package Automation.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser_launch {

	public static void main(String[] args) {
     
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new EdgeDriver();
	 driver.get("https://www.amazon.in/");
	// System.out.println(driver.getTitle());  
	// System.out.println(driver.getCurrentUrl());
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://www.amazon.in/");
	
	 // Web driver wait
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(null));
	 
	 //Fluent wait 
	                                                                          
	 FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	 
	 driver.close(); 	 
	 
	 FluentWait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
	 
	}

}
