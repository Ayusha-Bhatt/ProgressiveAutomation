package com.progressive.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.progressive.utils.FileUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;

	ExtentReports extent;
	ExtentSparkReporter spark;

	

	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException, FileNotFoundException {

		System.out.println();

	}

	@AfterMethod
	public void getResult(ITestResult result) throws IOException {

		//driver.quit();

	}

	public void launchBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("Firefox")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else {

			// headless browser
			ChromeOptions chromeoptions = new ChromeOptions();
			chromeoptions.addArguments("headless");
			chromeoptions.addArguments("window-size=1200x1600");

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

	}
	public void selectDDByVisibleText(WebElement ele, String dropdownOption) {
		
		Select sel = new Select(ele);
		sel.selectByVisibleText(dropdownOption);
	}
}
