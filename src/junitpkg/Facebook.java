package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
@Test
public void facebook()
{
	driver.findElement(By.id("email")).sendKeys("anjana@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("42abcdef");
	driver.findElement(By.name("login")).click();
}
@After
public void tearDown()
{
	driver.quit();
	
}
	
	}


