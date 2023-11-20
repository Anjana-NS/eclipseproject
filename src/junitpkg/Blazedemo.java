package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo {

 ChromeDriver driver;
 @Before
 public void setUp()
 {
	 driver=new ChromeDriver();
	 driver.get("http:\\www.blazedemo.com/register");
	 
	}
@Test
public void Blazedemo()
{
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("ANJANA");
	driver.findElement(By.xpath("//input[@name='company']")).sendKeys("TATA");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anjana@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("22rtyuih");
	driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys("22rtyuih");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}

}
