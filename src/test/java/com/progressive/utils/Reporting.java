package com.progressive.utils;

import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import jdk.javadoc.doclet.Reporter;

public class Reporting implements ISuiteListener, ITestListener, IReporter {

	ExtentReports extent;
	ExtentSparkReporter spark;

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extent.createTest(result.getMethod().getMethodName()).log(Status.PASS,
				result.getMethod().getMethodName() + " is PASSED");
		org.testng.Reporter.log("Test Case PASSED "+result.getMethod().getMethodName(),true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extent.createTest(result.getMethod().getMethodName()).log(Status.FAIL,
				result.getMethod().getMethodName() + " is Failed");
		
		//call method to capture result to db
		org.testng.Reporter.log("Test Case Failed "+result.getMethod().getMethodName(),true);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extent.createTest(result.getMethod().getMethodName()).log(Status.SKIP,
				result.getMethod().getMethodName() + " is Skipped");
		org.testng.Reporter.log("Test Case Skipped "+result.getMethod().getMethodName(),true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
       
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ISuite suite) {

		extent = new ExtentReports();

		spark = new ExtentSparkReporter("ExtentReport.html");

		extent.attachReporter(spark);

	}

	@Override
	public void onFinish(ISuite suite) {
		extent.flush();

	}

}
