package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fblogin {
	ChromeDriver cd;
@BeforeTest
public void setUp()
{
	cd=new ChromeDriver();
 }
@BeforeMethod
public void urlloading()
{
	cd.get("https://www.facebook.com/");

}
@Parameters({"email","pswrd"})
@Test
public void test(String email,String pswrd)
{
	cd.findElement(By.name("email")).sendKeys(email);
	
	cd.findElement(By.name("pass")).sendKeys(pswrd);
	
	cd.findElement(By.name("login")).click();

    }

}
