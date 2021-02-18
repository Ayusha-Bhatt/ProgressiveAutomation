package com.progressive.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DetailsAndDrivingHistory {

WebDriver driver;
	
	
	public DetailsAndDrivingHistory(WebDriver driver){
		this.driver = driver;
		
	}
	
	
	//Click on gender
	
	@FindBy(how = How.XPATH,using="//input[@id='DriversAddPniDetails_embedded_questions_list_Gender_F']")
	private WebElement gender;
	
	public void clickOnGender() {
		this.gender.click();
	}
	
	
	//Martial Status
	
	@FindBy(how = How.XPATH, using="//select[@id='DriversAddPniDetails_embedded_questions_list_MaritalStatus']")
	private WebElement martialStatus;
	
	public WebElement clickOnMartialStatus() {
		return martialStatus;
	}
	
	
	//Level of Education
	
	@FindBy(how = How.NAME, using="DriversAddPniDetails_embedded_questions_list_HighestLevelOfEducation")
	private WebElement levelOfEducation;
	
	public WebElement selLevelOfEducation() {
		return levelOfEducation;
	}
	
	
	//Employment Status
	
	@FindBy(how = How.ID_OR_NAME, using="DriversAddPniDetails_embedded_questions_list_EmploymentStatus")
	private WebElement employmentStatus;
	
	public WebElement selEmploymentStatus() {
		return employmentStatus;
	}
	
	
	//Residence Details
	
	@FindBy(how = How.XPATH, using ="//select[@id='DriversAddPniDetails_embedded_questions_list_PrimaryResidence']")
	private WebElement residenceStatus;
	
	
	public WebElement selResidenceStatus() {
		return residenceStatus;
	}
	
	//Length of residence
	
	@FindBy(how = How.XPATH, using ="//select[@id='DriversAddPniDetails_embedded_questions_list_HasPriorAddress']")
	private WebElement lenOfResidence;
	
	public WebElement selLenOfResidence() {
		return lenOfResidence;
	}
	
	
	// US License Status
	
	@FindBy(how = How.XPATH, using ="//select[@id='DriversAddPniDetails_embedded_questions_list_LicenseStatus']")
	private WebElement licenseStatus;
	
	public WebElement selLicenseStatus() {
		return licenseStatus;
	}
	
	//Accident History 
	
	@FindBy(how =How.XPATH, using = "//input[@id='DriversAddPniDetails_embedded_questions_list_HasAccidentsOrClaims_N']")
	private WebElement accidentHistory;
	
	public WebElement selAccidentHistory() {
		return accidentHistory;
	}
	
	//Tickets or Violation
	
	@FindBy(how = How.XPATH, using ="//input[@id='DriversAddPniDetails_embedded_questions_list_HasTicketsOrViolations_N']")
	private WebElement ticketViolation;
	
	public WebElement selTicketViolation() {
		return ticketViolation;
	}

	
	//Continue to proceed to next page
	
	@FindBy(how = How.XPATH, using="//button[contains(text(),'Continue')]")
	private WebElement continueToNext;
	
	public void selContinueToNext() {
		this.continueToNext.click();
	}
	
}
