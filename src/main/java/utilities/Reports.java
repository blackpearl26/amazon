package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	public static ExtentReports addReport()	{
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("ExtentReport.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(htmlReport);
		reports.setSystemInfo("Project", "Nykaa");
		reports.setSystemInfo("Test", "Regression");
		reports.setSystemInfo("Sprint","Second");
		return reports;
	}

}
