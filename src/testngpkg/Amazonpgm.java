package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonpgm {
	
    WebDriver driver;
     @BeforeTest
		public void setUp() {
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
		}


		@Test
		public void test() 
		{
			driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobilephones",Keys.ENTER);
			String title = driver.getTitle();
		
			if (title.equals("Aamazon.in : mobilephones"))
			{
				System.out.println("Title pass " + title);
			} 
			else 
			{
				System.out.println("Title failed");
			}
			driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();


			String parentWindow = driver.getWindowHandle();


			Set<String> allWindow = driver.getWindowHandles();


			for (String handle : allWindow) {
				if (!handle.equalsIgnoreCase(parentWindow)) {
					driver.switchTo().window(handle);
					
					
					driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
					driver.findElement(By.xpath("//*[@id='nav-cart-count-container']/span[2]")).click();
					driver.close();


				}
				driver.switchTo().window(parentWindow);
			}


		}


	}

