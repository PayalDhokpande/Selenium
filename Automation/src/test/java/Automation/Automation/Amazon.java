package Automation.Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		driver.getTitle();
		
		WebElement Searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		Searchbox.sendKeys("Books");
		
		System.out.println(Searchbox.getAttribute("value"));
		
		driver.findElement(By.id("nav-search-submit-button")).click();		
		 
		System.out.println("2nd title" + driver.getTitle()); 

		driver.findElement(By.xpath("(//div[@class=\"_bGlmZ_img_3idRh _bGlmZ_expandedImgT1_RpAoS\"])[2]")); 
		
		System.out.println("3rd title " + driver.getTitle());
	}

}
