package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	
	ChromeDriver cd;
	@Before
	public void setUp()
	{
		cd=new ChromeDriver();
        cd.get("https://www.automationexercise.com/");

	}
	
	
	@Test
	public void automation()
	{
		cd.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();

        cd.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")).click();

        cd.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a")).click();

        cd.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();

        cd.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();

        cd.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();

	}
}
