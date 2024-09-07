package Automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Jeevansathi_action extends Dynamic_Code{

	public static void main(String[] args) {
 Browser_Launch("Chrome");
 Hiturl("https://www.jeevansathi.com/");
 // Action class: it provides action like mouse action and keyboard action.
 Actions act = new Actions(driver);
 
 WebElement Email = driver.findElement(By.cssSelector("input#email"));

 act.moveToElement(Email).click().sendKeys("Payaldhokpande@gmail.com").build().perform();
 
SelectAndCopyText();
Tab();
Tab();
Tab();
PasteText();




	}

}
