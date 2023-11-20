package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Doubleandrightclick {
	
	ChromeDriver cd; 
	
	@BeforeTest
	public void setUp()
	{
		cd=new ChromeDriver();
		cd.get("https://demo.guru99.com/test/simple_context_menu.html");
	}

@Test
public void test()
{
	WebElement right=cd.findElement(By.xpath("//*[@id='authentication']/span"));
	Actions act=new Actions(cd);
	act.contextClick(right).perform();
	cd.findElement(By.xpath("//*[@id='authentication']/ul/li[1]")).click();
	cd.switchTo().alert().accept();
	
	WebElement doubleclickelement=cd.findElement(By.xpath("//*[@id='authentication']/button"));
	act.doubleClick(doubleclickelement).perform();
	Alert a=cd.switchTo().alert();
	String text=a.getText();
	System.out.println("alert text="+text);
	a.accept();
	
}


}
