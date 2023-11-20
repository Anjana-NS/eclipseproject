package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {

ChromeDriver driver;
@Before
public void setUp()
{
    driver=new ChromeDriver();
	driver.get("http:\\www.facebook.com");
	}
@Test
public void Fblogin()
{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anjana");
	driver.findElement(By.xpath("//input [@id='pass']")).sendKeys("23iertyh");
    driver.findElement(By.xpath("//button[@name='login']")).click();
}
}