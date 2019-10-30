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
		
		ExtentTest logger = testReport.createTest("SplunkIntegServerHealthCheck");
		logger.log(Status.INFO, "Server Health Check Description");
		logger.log(Status.PASS,"All servers are in running status");
		
		
		
		testReport.flush();
	}
}
