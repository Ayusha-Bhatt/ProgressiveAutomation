package com.progressive.testcases.google;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.progressive.pages.GooglePage;
import com.progressive.testcases.BaseTest;
import com.progressive.utils.FileUtils;

public class GoogleTest extends BaseTest {


	@BeforeClass
	public void beforeClass() throws InterruptedException, FileNotFoundException {

		String BROWSER = FileUtils.getValue("browser");
		
		launchBrowser(BROWSER);

		String URL = FileUtils.getValue("google_url");
		driver.get(URL);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	

	@Test(priority=1, description = "Google Search Test case 1")
	public void googleSearchTest1() {

		GooglePage page = PageFactory.initElements(driver, GooglePage.class);

		// page.enterSearchText("TestNG");

		page.enterSearchText("TestNG");
		Reporter.log("googleTEST 1",true);
	}
	
	
	
}
