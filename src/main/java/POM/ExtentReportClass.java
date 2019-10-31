package POM;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportClass {

	public void report()
	{
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./ExtentReportFolder/SplunkStatusReport.html");
		
		ExtentReports testReport = new ExtentReports();
		testReport.attachReporter(reporter);
		
		
		ExtentTest logger1 = testReport.createTest("IkeaOrderCreationIntegServer");
		logger1.log(Status.INFO, "Server Health Check Description");
		logger1.log(Status.PASS,"All four components are in running status");
		
		
		ExtentTest logger2 = testReport.createTest("IkeaCreateWorkOrderIntegServer");
		logger2.log(Status.INFO, "Server Health Check Description");
		logger2.log(Status.PASS,"All four components are in running status");
		
		
		
		
		
		testReport.flush();
	}
}
