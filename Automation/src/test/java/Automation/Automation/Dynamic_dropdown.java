package Automation.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dynamic_dropdown  extends Dynamic_Code{

	public static void main(String[] args) {

		Browser_Launch("Chrome");
		Hiturl("https://www.redbus.in/");
		
	WebElement From_stn = driver.findElement(By.xpath("//input[@id=\"src\"]"));
	
    From_stn.sendKeys("Nagpur");
    
   List<WebElement> Options = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]"));
	
   for (int i=0; i<=Options.size(); i++) {
	   try {
		   if(Options.get(i).getText().contains("Chatrapathi, Nagpur")) {
				  Options.get(i).click();
			   }
	} catch (Exception IndexOutOfBoundsException) {
		// TODO: handle exception
	}
	  
   }
}
	

}
