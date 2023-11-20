package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class onlineresult {
	ChromeDriver driver;
	@Before
	public  void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.universityofcalicut.com");
	}
	@Test
	public void onlineresult()
	{
		driver.findElement(By.xpath("//input[@name='regno']")).sendKeys("PRAUBCA023");
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys("awoha");
		driver.findElement(By.xpath("//img[@id='captcha']")).sendKeys("awoha");
		
	}
	}

