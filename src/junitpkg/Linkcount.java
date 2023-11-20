package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.ebay.com");
		}
	@Test
	public void test1()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
				System.out.println("total no of links="+li.size());
	for(WebElement link:li) //for each loop

	{

		System.out.println(link.getText() + " - " + link.getAttribute("href"));

				}

					
	}

}
