package testngpkg;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public  class Datadriven_instagram {

	ChromeDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
	}
	
	
@Test
public void test() throws Exception
{
FileInputStream ob=new FileInputStream("C:\\Users\\anjana\\Desktop\\instadriven.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(ob);
XSSFSheet sh=wb.getSheet("Sheet1");
System.out.println(sh.getLastRowNum());
for(int i=1;i<=sh.getLastRowNum();i++)
{
	String username=sh.getRow(i).getCell(0).getStringCellValue(); //to read cell value-get string value
	System.out.println("username="+username);
	String pswd=sh.getRow(i).getCell(1).getStringCellValue();
	System.out.println("password="+pswd);

	driver.findElement(By.name("email")).sendKeys("anjana@gmail.com");	
	driver.findElement(By.name("pass")).sendKeys("anjana123");
	driver.findElement(By.name("login")).click();
}
;
	}

}
