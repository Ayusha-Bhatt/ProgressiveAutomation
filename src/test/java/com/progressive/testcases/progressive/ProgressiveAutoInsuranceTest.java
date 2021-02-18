package com.progressive.testcases.progressive;

import java.io.FileNotFoundException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.progressive.pages.AutoInsuranceHistory;
import com.progressive.pages.ContinueWithJustAuto;
import com.progressive.pages.DetailsAndDrivingHistory;
import com.progressive.pages.DriversOnQuote;
import com.progressive.pages.ProgressiveHomePage;
import com.progressive.pages.ProgressivePersonalInfo;
import com.progressive.pages.ProgressiveVehicleDetails;
import com.progressive.pages.SnapshotEnrollment;
import com.progressive.testcases.BaseTest;
import com.progressive.utils.FileUtils;

public class ProgressiveAutoInsuranceTest extends BaseTest {



	@BeforeClass
	public void beforeClass() throws InterruptedException, FileNotFoundException {

		String BROWSER = FileUtils.getValue("browser");
		
		launchBrowser(BROWSER);

		String URL = FileUtils.getValue("progressive_url");
		driver.get(URL);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void progressiveSearchTest() throws InterruptedException {

		ProgressiveHomePage page = PageFactory.initElements(driver, ProgressiveHomePage.class);

		page.clickOnAuto();
		page.enterZipCode("75150");
		page.clickOnGetQuote();

	}

	@Test(priority = 2)
	public void progressiveDetailsTest() {
		ProgressivePersonalInfo page = PageFactory.initElements(driver, ProgressivePersonalInfo.class);
		page.enterFirstName("Ayusha");
		page.enterLastName("Bhatt");
		page.enterDateOfBirth("09/10/1997");
		page.enterMailingAddress("414 Southerland Avenue");
		page.clickStartTheQuote();
		page.addVehicle();
		page.continueToNext();

	}

	@Test(priority = 3)
	public void progressiveVehicleDetails() {
		ProgressiveVehicleDetails page = PageFactory.initElements(driver, ProgressiveVehicleDetails.class);

		selectDDByVisibleText(page.getVehicleDropdown(), "Personal (to/from work or school, errands, pleasure)");
		selectDDByVisibleText(page.getVehicleOwnership(), "Own");
		selectDDByVisibleText(page.getLenOfVehicle(), "1 year - 3 years");

		page.clickOnDone();
		page.clickOnContinue();

	}

	@Test(priority = 4)
	public void detailsAndDrivingHistory() {
		DetailsAndDrivingHistory page = PageFactory.initElements(driver, DetailsAndDrivingHistory.class);
		page.clickOnGender();

		selectDDByVisibleText(page.clickOnMartialStatus(), "Single");
		selectDDByVisibleText(page.selLevelOfEducation(), "Graduate work or graduate degree");
		selectDDByVisibleText(page.selEmploymentStatus(), "Student (full time)");
		selectDDByVisibleText(page.selResidenceStatus(), "Rent");
		selectDDByVisibleText(page.selLenOfResidence(), "No");
		selectDDByVisibleText(page.selLicenseStatus(), "Permit");
		selectDDByVisibleText(page.selAccidentHistory(), "No");
		selectDDByVisibleText(page.selTicketViolation(), "No");
		page.selContinueToNext();

	}

	@Test(priority = 5)
	public void driversOnQuote() {
		DriversOnQuote page = PageFactory.initElements(driver, DriversOnQuote.class);
		page.clickContinue();
	}

	 @Test (priority = 6)

	public void autoInsuranceHistory() throws InterruptedException {
		AutoInsuranceHistory page = PageFactory.initElements(driver, AutoInsuranceHistory.class);
		page.progAutoInsHistory();
		page.enterPolicyStartDate("03/05/2021");
		page.enterPrimaryEmail();
		selectDDByVisibleText(page.selNumOfResidents(),"3");
		page.clickContinueNext();

	}

	 @Test (priority =7)

	public void snapshotEnrollment() {
		SnapshotEnrollment page = PageFactory.initElements(driver, SnapshotEnrollment.class);
		page.clickSnapEnrollment();
		page.clickContinue();
	}

	@Test (priority =8)

	public void continueWithJustAuto() {
		ContinueWithJustAuto page = PageFactory.initElements(driver, ContinueWithJustAuto.class);
		page.clickContWithAuto();
	}

}
