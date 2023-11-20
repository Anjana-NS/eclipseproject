package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {

	WebDriver driver;
	
	By fbemail=By.id("email");
	By fbpswd=By.id("pass");
	By login=By.name("login");
	
	public Fbloginpage(WebDriver driver){
		
		this.driver=driver;
		
	}
	public void setValues(String email,String pwsd)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpswd).sendKeys(pwsd);
		
 	}
	
	public void login()
	{
		driver.findElement(login).click();
		
	}
}
