package Automation.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
      WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.amazon.in/");
       System.out.println(driver.getTitle());
       
       driver.findElement(By.id("gw-ftGr-desktop-hero-1"));
       
       driver.findElement(By.className("gw-ftGr-desktop-hero gw-critical-content csm-placement-id-eb7e6596-c000-48c2-b8bc-944d2e0503e3 desktop-gateway-hero_2913e004-4f54-4b4c-b8b1-2cff5e4fa173 celwidget pd_rd_wg-1SD3w pd_rd_w-3Ypc2 pd_rd_r-e12c2f8e-aba0-45a8-8b4b-c77bec673cb5"));
       
       driver.findElement(By.name("glow-destination-type"));
         
       driver.findElement(By.linkText("Amazon miniTV"));
       
       driver.findElement(By.partialLinkText("Today's"));
       
       driver.findElement(By.tagName("options"));
       
       
     WebElement Searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
//       Searchbox.click();
//       Searchbox.sendKeys("HomeDecor");
//       Thread.sleep(5000);
//       Searchbox.clear();
//       Searchbox.sendKeys("Books");
//       System.out.println(Searchbox.getAttribute("value"));
//       
//       System.out.println(Searchbox.getLocation().x);
//       System.out.println(Searchbox.getLocation().y);
//       System.out.println(Searchbox.getSize());
//       System.out.println(Searchbox.getTagName());
//       System.out.println(Searchbox.isDisplayed());
       
       
    
     
	}

}
