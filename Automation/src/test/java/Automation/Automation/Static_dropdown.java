package Automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdown extends Dynamic_Code {

	public static void main(String[] args) {
  Browser_Launch("chrome");
  Hiturl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=CjwKCAjwreW2BhBhEiwAavLwfI2VemP6Xh5dgP3MNNXvsXwdDV7IvFrN-G-Zn3jukSkuUVn7ALCTQBoCPRQQAvD_BwE");
     
  WebElement create_profile_for = driver.findElement(By.cssSelector("select#reg_relationship"));
  
  Select sd = new Select(create_profile_for);
  sd.selectByVisibleText("Relative/Friend");
 // sd.selectByValue("6D"); // value in DOM file
 //sd.selectByIndex(1); // Check index on webpage or DOM file
  
   
 WebElement Day = driver.findElement(By.cssSelector("select#reg_dtofbirth_day"));
 Select sd1 = new Select(Day);
  
 sd1.selectByVisibleText("5");
  
 WebElement Month = driver.findElement(By.cssSelector("select#reg_dtofbirth_month"));
  
 Select sd2 = new Select(Month);
   
 sd2.selectByVisibleText("Oct");
   
 WebElement Year = driver.findElement(By.cssSelector("select#reg_dtofbirth_year")); 
    
 Select sd3 = new Select(Year);
    
 sd3.selectByVisibleText("1996");
    
 WebElement Height = driver.findElement(By.cssSelector("select#reg_height"));
    
 Select sd4 = new Select(Height);
 
 sd4.selectByVisibleText("4' 11\" (1.50 mts)");
 
 WebElement Religion = driver.findElement(By.cssSelector("select#reg_religion"));
    
 Select sd5 = new Select(Religion);
 
 sd5.selectByVisibleText("Hindu");
    
	}

}
