package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {

    WebDriver driver;
     @BeforeTest
		public void setUp() {
			driver = new ChromeDriver();
			driver.get("https://www.trivago.com");
						
}
     
 @Test
 public void datepicker()
 {
	 driver.findElement(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[2]/div[3]/div/button[11]/time"))
     datepickermethod("December 2023,6");
	 datepickermethod("January 2024,30");
	 
 }
 private void datepickermethod(String expmonth,String expdate) {
	 while(true)
	 {
		 String month=driver.findElement (By.xpath("//*id=\)
	 }
 }
 
 
 
 
 
 }