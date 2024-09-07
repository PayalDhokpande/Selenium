package Automation.Automation;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Flipkart extends Dynamic_Code{

	public static void main(String[] args) throws Throwable {
    Browser_Launch("Chrome");
    Hiturl("https://www.flipkart.com/");
    
 TakesScreenshot ts = (TakesScreenshot) driver; 
 File Source = ts.getScreenshotAs(OutputType.FILE);
 File Target = new File("./Screenshots/Flipkart_browser.png");
 org.openqa.selenium.io.FileHandler.copy(Source, Target);
 
 driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("Home Decor");
 Thread.sleep(5000);
 TakesScreenshot ts1 = (TakesScreenshot) driver; 
 File Source1 = ts1.getScreenshotAs(OutputType.FILE);
 File Target1 = new File("./Screenshots/Searched_Product.png");
 org.openqa.selenium.io.FileHandler.copy(Source1, Target1);
 // using project path 
 String Projectpath = System.getProperty("user.dir");
 driver.findElement(By.cssSelector("button._2iLD__")).click();
 Thread.sleep(5000);
   TakesScreenshot ts2 = (TakesScreenshot) driver; 
   File Source3 = ts2.getScreenshotAs(OutputType.FILE);
   File Target3 = new File(Projectpath+ "\\Screenshots\\Product_results.png");
   org.openqa.selenium.io.FileHandler.copy(Source3, Target3);

   
   TakesScreenshot ts3 = (TakesScreenshot) driver;
    File Source4 = ts3.getScreenshotAs(OutputType.FILE); 
    File Target4 = new File("./Screenshots/practice.png");
    org.openqa.selenium.io.FileHandler.copy(Source4, Target4);
    
    String Projectpath1 = System.getProperty("user.dir");
    TakesScreenshot ts5 = (TakesScreenshot) driver;
     File Source5 = ts5.getScreenshotAs(OutputType.FILE);
     File Target5 = new File(Projectpath1+ "\\Screenshots\\Prractive.png");
     org.openqa.selenium.io.FileHandler.copy(Source5, Target5);
   driver.close();
	}

}
