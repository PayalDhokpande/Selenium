  package Automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Myntra extends Dynamic_Code {

	public static void main(String[] args) throws Throwable {
    Browser_Launch("Chrome");
    Takesscreenshot("Broswerlaunch");
    Hiturl("https://www.myntra.com/");
    screenshot("Myntra_webpage"); 
    WebElement Searchbar = driver.findElement(By.cssSelector("input.desktop-searchBar"));
    
    Searchbar.sendKeys("Handbags");
    Thread.sleep(2000);
    screenshot("Product search");
    
    driver.findElement(By.cssSelector("a.desktop-submit")).click();
    Thread.sleep(2000);
    screenshot("Search result");
      
   // ScrollByOffset(0, 600);
    driver.findElement(By.xpath("//img[@title=\"max Textured Half Moon Hobo Bag\"]")).click();
    screenshot("Selected product");
    
    //ScrollToBottom();
    Thread.sleep(2000);
    Takesscreenshot("Scrolled to bottom");
    
    driver.findElement(By.xpath("//a[@data-reactid=\"212\"]")).click();
    screenshot("Mensbackpack");
    
   // back();
    Thread.sleep(2000);
    screenshot("Back");
    
   // refresh();
    Thread.sleep(2000);
    screenshot("Refresh");
    
  // forward();
   Thread.sleep(2000);
   screenshot("Forward");
   
   driver.close();


    
	}

}
