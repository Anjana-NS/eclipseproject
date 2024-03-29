package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdropdown {
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
}

@Test
public void test()
{
	WebElement day=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
	Select daydetails=new Select(day);
	daydetails.selectByValue("15");
	List<WebElement> c1=daydetails.getOptions();
	System.out.println("day count="+c1.size());
	
	WebElement month=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
	Select monthdetails=new Select(month);
	monthdetails.selectByValue("10");
	List<WebElement>c2=monthdetails.getOptions();
	System.out.println("month count="+c2.size());
	
	WebElement year=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
	Select yeardetails=new Select(year);
	yeardetails.selectByValue("2002");
	List<WebElement>c3=monthdetails.getOptions();
	System.out.println("month count="+c3.size());
   }
}
