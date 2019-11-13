package POM;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportClass {

	public void report() throws IOException
	{
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./ExtentReportFolder/SplunkStatusReport.html");
		
		ExtentReports testReport = new ExtentReports();
		testReport.attachReporter(reporter);
		
		
		ExtentTest logger1 = testReport.createTest("SplunkIntegrationServerHealthStatus");
		logger1.log(Status.INFO, "Server Health Check Description");
		logger1.log(Status.PASS,"All Servers are in running status");
		
		
//		ExtentTest logger2 = testReport.createTest("IkeaCreateWorkOrderIntegServer");
//		logger2.log(Status.INFO, "Server Health Check Description");
//		logger2.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger3 = testReport.createTest("IKEAWorkOrderAckIntegServer");
//		logger3.log(Status.INFO, "Server Health Check Description");
//		logger3.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger4 = testReport.createTest("IkeaScheduleOrderAgent");
//		logger4.log(Status.INFO, "Server Health Check Description");
//		logger4.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger5 = testReport.createTest("IkeaReleaseOrderAgent");
//		logger5.log(Status.INFO, "Server Health Check Description");
//		logger5.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger6 = testReport.createTest("IkeaDeliveryReleasedUpdateIntegServer");
//		logger6.log(Status.INFO, "Server Health Check Description");
//		logger6.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger7 = testReport.createTest("IkeaReceivePickingUpdatesIntegServer");
//		logger7.log(Status.INFO, "Server Health Check Description");
//		logger7.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger8 = testReport.createTest("IkeaReadyForLoadUpdateIntegServer");
//		logger8.log(Status.INFO, "Server Health Check Description");
//		logger8.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger9 = testReport.createTest("IkeaCDULoadConfirmationIntegServer");
//		logger9.log(Status.INFO, "Server Health Check Description");
//		logger9.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger10 = testReport.createTest("IkeaCSMDsptchdConfrmtnIntegServer");
//		logger10.log(Status.INFO, "Server Health Check Description");
//		logger10.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger11 = testReport.createTest("IkeaReceivedAtHubIntegServer");
//		logger11.log(Status.INFO, "Server Health Check Description");
//		logger11.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger12 = testReport.createTest("IkeaLoadedOnDeliveryTruckIntegServer");
//		logger12.log(Status.INFO, "Server Health Check Description");
//		logger12.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger13 = testReport.createTest("IkeaDeliveredToCustomerIntegServer");
//		logger13.log(Status.INFO, "Server Health Check Description");
//		logger13.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger14 = testReport.createTest("IKEAPublishMsgForIBISAndOCServer");
//		logger14.log(Status.INFO, "Server Health Check Description");
//		logger14.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger15 = testReport.createTest("IKEAProcessConfirmShipmentIntegServer");
//		logger15.log(Status.INFO, "Server Health Check Description");
//		logger15.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger16 = testReport.createTest("IKEAILTCreateInventoryActyIntegServer");
//		logger16.log(Status.INFO, "Server Health Check Description");
//		logger16.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger17 = testReport.createTest("IKEAConsolidateInventoryAgentServer");
//		logger17.log(Status.INFO, "Server Health Check Description");
//		logger17.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger18 = testReport.createTest("IkeaConsgmntRcptForROAgent");
//		logger18.log(Status.INFO, "Server Health Check Description");
//		logger18.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger19 = testReport.createTest("IKEAReceiveROIntegServer");
//		logger19.log(Status.INFO, "Server Health Check Description");
//		logger19.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger20 = testReport.createTest("IkeaProcessRepOrderIntegServer");
//		logger20.log(Status.INFO, "Server Health Check Description");
//		logger20.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger21 = testReport.createTest("IkeaInventoryAdjustIntegServer	");
//		logger21.log(Status.INFO, "Server Health Check Description");
//		logger21.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger22 = testReport.createTest("IkeaRTAMActivityBroadcast");
//		logger22.log(Status.INFO, "Server Health Check Description");
//		logger22.log(Status.PASS,"All four components are in running status");
//		
//		ExtentTest logger23 = testReport.createTest("IkeaRTAMActivityPrimary");
//		logger23.log(Status.INFO, "Server Health Check Description");
//		logger23.log(Status.PASS,"All four components are in running status");
		
		
		
		
		
		
		testReport.flush();
	}
}
