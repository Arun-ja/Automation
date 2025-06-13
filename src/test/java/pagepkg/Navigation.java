package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Navigation {
	WebDriver driver;
	
	
		@FindBy(xpath="//*[@id=\"ui-id-4\"]/span[2]")WebElement navi;
		@FindBy(xpath="//*[@id=\"ui-id-9\"]")WebElement navi2;
		@FindBy(xpath="//*[@id=\"ui-id-11\"]")WebElement navi3;
		@FindBy(xpath="/html/body/div[2]/header/div[2]/a/img")WebElement lg;
		
		public Navigation(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
	public void hover()
	{
		Actions act=new Actions(driver);
		act.moveToElement(navi).perform();
		act.moveToElement(navi2).perform();
		navi3.click();
		driver.navigate().back();
				
	}
	
	public void logo()
	{
		if(lg.isDisplayed());
		{
		System.out.println("Logo is displayed");
		}
	}

}
