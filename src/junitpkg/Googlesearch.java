package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("http:\\www.google.com");
}
@Test
public void googlesearch()
{
driver.findElement(By.name("q")).sendKeys("chess",Keys.ENTER);


//String title=driver.getTitle();
//WebElement search=driver.findElement(By.name("q"));
//search.sendKeys("car");
//search.submit();
}

}
