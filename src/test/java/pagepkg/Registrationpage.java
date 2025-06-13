package pagepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registrationpage {
WebDriver driver;
WebDriverWait wait;

@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[3]/a")WebElement crteaccnt;
@FindBy(xpath="//*[@id=\"firstname\"]")WebElement firstname;
@FindBy(xpath="//*[@id=\"lastname\"]")WebElement lastname;
@FindBy(xpath="//*[@id=\"email_address\"]")WebElement email;
@FindBy(xpath="//*[@id=\"password\"]")WebElement passwrd;
@FindBy(xpath="//*[@id=\"password-confirmation\"]")WebElement cnfrmpasswrd;
@FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button/span")WebElement createaccntbtn;

public Registrationpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
}

public void createaccount()
{
	crteaccnt.click();
}

public void accntdetails(String fname, String lname, String mail, String psswrd, String cnfrmpsswrd )
{
	firstname.sendKeys(fname);
	lastname.sendKeys(lname);
	email.sendKeys(mail);
	passwrd.sendKeys(psswrd);
	cnfrmpasswrd.sendKeys(cnfrmpsswrd);
}

public void account()
{
	createaccntbtn.click();
}

public void title()
{
	String gttitle = driver.getTitle();
	System.out.println("Page title is "+gttitle);
}
}
//"//*[@id=\"password\"]"
//"//*[@id=\"password-confirmation\"]"