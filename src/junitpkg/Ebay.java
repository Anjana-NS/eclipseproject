package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

 ChromeDriver driver;
 @Before
 public void setUp()
 {
	 driver=new ChromeDriver();
	 driver.get("http://www.ebay.com");
	}
 @Test
 public void ebay()
 {
	 driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Mobiles",Keys.ENTER);
	 driver.findElement(By.xpath("//*[@id='s0-53-17-6-3-4[0]-3-2-1-list']/li[2]/div/a]")).click();
	 
}
 }
