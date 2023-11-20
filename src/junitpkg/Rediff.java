package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("\\http:register.rediff.com");
	}
	@Test
	public void Rediff()
	{
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("ANJANA");
		driver.findElement(By.xpath("//*[@id='newpasswd']")).sendKeys("uhgfc");
		driver.findElement(By.xpath("//*[@id='newpasswd1']")).sendKeys("uhgfc");
		driver.findElement(By.xpath("//*[@id='div_altemail']/table/tbody/tr/td[3]/input")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id='mobno']")).sendKeys("709647867");
		driver.findElement(By.xpath("//*[@id='country']")).sendKeys("india");
	 
	}

}
