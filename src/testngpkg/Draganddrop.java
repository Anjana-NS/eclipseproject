package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	
ChromeDriver driver;

@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
}

@Test
public void draganddrop()
{
	WebElement src1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement dest1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	Actions act=new Actions (driver);
	act.dragAndDrop(src1,dest1);
	act.perform();
}
}