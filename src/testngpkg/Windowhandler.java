package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {

	WebDriver driver;
    @BeforeTest
		public void setUp() {
			driver = new ChromeDriver();
						driver.manage().window().maximize();
		}


	@Test
	public void test()
	{
		driver.get("http://demo.guru99.com/popup.php");
		String parentwindow=driver.getWindowHandle(); //current window
		System.out.println("parent window title"+driver.getTitle());
		driver.findElement(By.xpath("html/body/p/a")).click();
		
		String allWindowHandle=driver.getWindowHandle();
		
		Set<String> allWindow = driver.getWindowHandles();
		
		for(String handle : allWindow)
		{
		if(!handle.equalsIgnoreCase(parentwindow))	{
			driver.switchTo().window(handle);
			//string s=d.findElement(BY.xpath("/html/body/form/table/tbody/tr/td/h2"));
			//system.out.println(s);
			driver.close();
			
		}
			driver.switchTo().window(parentwindow);
			
		}
	}
}
