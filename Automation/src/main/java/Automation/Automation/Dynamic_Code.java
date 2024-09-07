package Automation.Automation;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Dynamic_Code {
  
	      public static WebDriver driver; 

	public static void Browser_Launch(String browser) {
      // To launch browser
		if(browser.equalsIgnoreCase("Chrome")) {
			
			driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("edge")) {
		    driver = new EdgeDriver();
		    }else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			
		}
	// To maximize window
        driver.manage().window().maximize();
	// To apply explicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Launched browser is : " + browser);
	}

	// To hit url
	public static void Hiturl(String url) {
		driver.get(url);
		System.out.println(driver.getTitle());
	}
	
// screenshot by (./)
	public static void Takesscreenshot(String Screenshot_name) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver; 
		 File Source = ts.getScreenshotAs(OutputType.FILE);
		 File Target = new File("./Myntra_ss/"+ Screenshot_name + ".png");
		 org.openqa.selenium.io.FileHandler.copy(Source, Target);
	}
	
// Screenshot using projectpath
	public static void screenshot(String ss_name) throws Throwable {
		 String Projectpath = System.getProperty("user.dir");
		 TakesScreenshot ts1 = (TakesScreenshot) driver; 
		 File Source1 = ts1.getScreenshotAs(OutputType.FILE);
		 File Target1 = new File(Projectpath+"\\Myntra_ss\\"+ ss_name + ".png");
		 FileHandler.copy(Source1, Target1);
		 
	}
	
// Javascript executor interface
	
// 1. To refresh
	public static void refresh() {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.history.go(0)");
	}
	
// 2. To go forward on url
	
	public static void forward() {
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.history.forward()");
	}
	
// 3. To go backward on url
	public static void back() {
		JavascriptExecutor js4 = (JavascriptExecutor) driver; 
		js4.executeScript("window.history.back()");
	}
	
//4. To scroll page to bottom
	public static void ScrollToBottom() {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
//5.To scroll by offset
	
	public static void ScrollByOffset(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy" + "("+ x + ","+ y + ")"); 
		}
	
//Action class
// Mouse action
   

// 1. To enter text
	public static void enter_text(WebElement Webelement, String text) {
	  	 Actions act = new Actions(driver);      

		act.moveToElement(Webelement).click().sendKeys(text).build().perform();

	}


//2. To right click
	

	public static void right_click(WebElement element) {
	   Actions act1 = new Actions(driver);      

		act1.contextClick(element).build().perform();
}

// 3.for double click
		public static void double_click(WebElement element1) {
			Actions act2 = new Actions(driver);      

			act2.doubleClick(element1).build().perform();

		}
		
 // 4. drag and drop

		public static void drag_n_drop(WebElement DG, WebElement DP) {
		   Actions act3 = new Actions(driver);      

			act3.dragAndDrop(DG, DP).build().perform();
		}


//5. code for moving slider by offset

		public static void drag_n_drop_by_offsets(WebElement element2, int x, int y) {
			 Actions act4 = new Actions(driver);      

			act4.moveToElement(element2).dragAndDropBy(element2, x, y).build().perform();
		}


//6.  switch to frame

public static void Switch_to_frame(WebElement element3) {

	driver.switchTo().frame(element3);

}

//7.To get back to window

	public static void Back_to_window() {

		driver.switchTo().defaultContent();
	}
	
	// Keyboard action
	// 1. To select, copy and paste
	
public static void SelectAndCopyText(){
	   Actions act5 = new Actions(driver);      

		act5.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act5.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();		
	}

	public static void Tab() {
		   Actions act6 = new Actions(driver);      

		act6.keyDown(Keys.TAB).build().perform();
	}

	public static void PasteText() {
		   Actions act7 = new Actions(driver);      

		act7.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}
	
//2. page down

public static void Pagedown() {
	   Actions act8 = new Actions(driver);      

	act8.keyDown(Keys.PAGE_DOWN).build().perform();

}

//3. To page up

public static void Pageup() {
	   Actions act9 = new Actions(driver);      

	act9.keyDown(Keys.PAGE_UP).build().perform();
	

}

}


