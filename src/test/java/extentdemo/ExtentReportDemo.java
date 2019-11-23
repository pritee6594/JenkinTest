package extentdemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter htmlreporter=new ExtentHtmlReporter("E:\\Report\\batch.html");
		ExtentReports report = new ExtentReports();
		
		report.attachReporter(htmlreporter);
		ExtentTest logger= report.createTest("Aut_VerifyLoginToFlightApp","Verify user is able to login successfully in flight app ");
		
		logger.log(Status.PASS, "flight app url is lauched");
		logger.log(Status.PASS, "successfully enter username");
		logger.log(Status.PASS, "successfully enter password");
		logger.log(Status.PASS, "click on login button");
		
		report.flush();
	}

}
