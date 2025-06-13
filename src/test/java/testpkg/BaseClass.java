package testpkg;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.Navigation;
import pagepkg.Registrationpage;
import pagepkg.Userlogin;

public class BaseClass
{
	public static WebDriver driver;
	Registrationpage regpg;
	Userlogin usln;
	Navigation nav;
	
	
	
	@BeforeTest
	public void Base()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		
	}
	
	@BeforeMethod
	public void bfmthd()
	{
		regpg=new Registrationpage(driver);
		usln=new Userlogin(driver);
		nav=new Navigation(driver);
		
	}
}