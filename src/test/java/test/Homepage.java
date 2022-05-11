package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pojo.OpenBrowser;
import pom.AmazonMainPage;

public class Homepage {
	 WebDriver driver;
	 
	@BeforeTest
	public void launchbrowser()	{
		driver = OpenBrowser.chrome("https://www.amazon.in/");
	}
	
	@Test
	public void mouseAction()	{
		AmazonMainPage mainpage = new AmazonMainPage(driver);
		mainpage.moveMouseOnId(driver);
	}
	

}
