package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMainPage {
	
	@FindBy(xpath = "//a[@id='nav-link-accountList']") private WebElement account;
	
	public AmazonMainPage(WebDriver driver)	{
		PageFactory.initElements(driver, this);
	}
	
	public void moveMouseOnId(WebDriver driver)	{
		Actions act = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(account));
		act.moveToElement(account).build().perform();
		
				
	}

}
