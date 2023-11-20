package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationexercise {
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://automationexercise.com/login");
}
@Test
public void Automation()
{
	//driver.findElement(By.xpath("//input[@id_gender2]")).click();
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("ANJANA SUBASH");
	driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("anjana03@gmail.com");
	driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("edrfty");
	
	WebElement day=driver.findElement(By.xpath("//*[@id='days']"));
	Select daydetails=new Select(day);
	daydetails.selectByValue("15");
	
	WebElement month=driver.findElement(By.xpath("//*[@id='months']"));
	Select monthdetails=new Select(month);
	monthdetails.selectByValue("10");
	
	WebElement year=driver.findElement(By.xpath("//*[@id='years']"));
	Select yeardetails=new Select(year);
	yeardetails.selectByValue("2002");
	
	driver.findElement(By.xpath("//input[@name='newsletter']")).click();
	driver.findElement(By.xpath("//input[@name='optin']")).click();
	
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Peter");
	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Hedrik");
	driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Carnival");
	driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("abc");
	driver.findElement(By.xpath(" //input[@id='address2']")).sendKeys("xyz");
	
	WebElement country=driver.findElement(By.xpath("//*[@id='country']"));
	Select countrydetails=new Select(country);
	countrydetails.selectByValue("Canada");
	
	driver.findElement(By.xpath("//input[@data-qa='state']")).sendKeys("Kerala");
	driver.findElement(By.xpath("//input[@data-qa='city']")).sendKeys("Thrissur");
    driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("098623");
    driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("8113946828");
    driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

     }
}