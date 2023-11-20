package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbloginpage;

public class Fblogintest {

	WebDriver driver;
	@BeforeTest
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	
	@Test
	public void test()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setValues("anjana@gmail.com","22abc");
		ob.login();
    }
}
