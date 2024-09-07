package Automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Snapdeal extends Dynamic_Code{

	public static void main(String[] args) throws Throwable {
Browser_Launch("Chrome");
Thread.sleep(5000);
Takesscreenshot("Browserlaunch");
   
Hiturl("https://snapdeal.com/");
Thread.sleep(5000);  
screenshot("Snapdeal_application1");
   
Thread.sleep(3000);
driver.findElement(By.id("inputValEnter")).sendKeys("Kitchen");
Thread.sleep(5000);
Takesscreenshot("Searchbar");

//scroll by 1000 offset
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver; 
js.executeScript("window.scrollBy(0,1000)");   
Takesscreenshot("After scroll by 1000"); 
  
//goind back by 1000 offset
Thread.sleep(3000);
JavascriptExecutor js3 = (JavascriptExecutor) driver; 
js3.executeScript("window.scrollBy(0,-1000)");
Takesscreenshot("Going_back by -1000");

//refresh
Thread.sleep(3000);

//driver.navigate().refresh();
JavascriptExecutor js2 = (JavascriptExecutor) driver; 
js2.executeScript("window.history.go(0)");
Takesscreenshot("Refresh");

//scroll to bottom
Thread.sleep(3000);
JavascriptExecutor js1 = (JavascriptExecutor) driver;
js1.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
screenshot("Scroll to bottom");

driver.findElement(By.linkText("Computer Keyboard")).click();
screenshot("Searched computer keyboard");
Thread.sleep(3000);

//driver.navigate().back()
JavascriptExecutor js4 = (JavascriptExecutor) driver; 
js4.executeScript("window.history.back()");
Thread.sleep(3000);
screenshot("Goind back to webpage");

//another way 
//driver.navigate().forward();
JavascriptExecutor js5 = (JavascriptExecutor) driver;
js5.executeScript("window.history.forward()");
Thread.sleep(3000);
screenshot("Forwarded again"); 
}

}
