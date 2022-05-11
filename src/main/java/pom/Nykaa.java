package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nykaa {
	@FindBy(xpath="//li[@id=\"popups\"]") private WebElement nykaaFashion;
	@FindBy(linkText="Bags & Footwear") private WebElement bags;
	
	
	
	public Nykaa(WebDriver driver)	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void moveToNykaaFashion(WebDriver driver)	{
		Actions act = new Actions(driver);
		act.moveToElement(nykaaFashion).build().perform();
	}
	
	public void moveToBags(WebDriver driver)	{
		Actions act = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(bags));
		act.moveToElement(bags).build().perform();
	}

}
