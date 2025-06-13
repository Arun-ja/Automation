package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Userlogin {

	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")WebElement signin;
	@FindBy(xpath="//*[@id=\"email\"]")WebElement useremail;
	@FindBy(xpath="//*[@id=\"pass\"]")WebElement userpass;
	@FindBy(xpath="//*[@id=\"send2\"]/span")WebElement signinbtn;
	
	public  Userlogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void login()
	{
		signin.click();
	}
	
	public void data(String mailid, String password)
	{
		useremail.sendKeys(mailid);
		userpass.sendKeys(password);
	}
	
	public void button()
	{
		signinbtn.click();
	}
	
	public void title()
	{
		String actual=driver.getTitle();
		String expected="My Account";
		
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
	}
}
