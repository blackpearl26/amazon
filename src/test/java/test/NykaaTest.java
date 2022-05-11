package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.OpenBrowser;
import pom.Nykaa;
import utilities.Reports;

public class NykaaTest {
	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeClass
	public void configureExtentReports()	{
		reports = Reports.addReport();
	}
	
	@BeforeMethod
	public void launchBrowser()	{
		driver = OpenBrowser.chrome("https://www.nykaa.com/");
		
	}
	
	@Test
	public void MouseHover()	{
		test = reports.createTest("MouseHover");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Buy Cosmetics Products & Beauty Products Online in India at Best Price | Nykaa";
		Assert.assertEquals(actualTitle, expectedTitle);
		Nykaa nykaa = new Nykaa(driver);
		nykaa.moveToNykaaFashion(driver);
		nykaa.moveToBags(driver);
	}

	@AfterMethod
	public void testout(ITestResult result)	{
		if(result.getStatus()==ITestResult.FAILURE)	{
			test.log(Status.FAIL, result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)	{
			test.log(Status.PASS, result.getName());
		}
		else	{
			test.log(Status.SKIP, result.getName());
		}
		
	}
	
	@AfterClass
	public void flushReports()	{
		reports.flush();
	}
	
	
	
	
	
	
	
	
}
