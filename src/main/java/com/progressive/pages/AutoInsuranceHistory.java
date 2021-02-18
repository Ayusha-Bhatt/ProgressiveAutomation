package com.progressive.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutoInsuranceHistory {
	
	WebDriver driver;
	
	public AutoInsuranceHistory(WebDriver driver) {
		this.driver = driver;
	}

	
	//Progressive Insurance History
	
	@FindBy(how =How.XPATH,using ="//input[@id='FinalDetailsEdit_embedded_questions_list_OtherPolicies_N']")
	private WebElement progHistory;
	
	public void progAutoInsHistory() {
		this.progHistory.click();
	}
	
	// Start Date of Policy
	
	@FindBy(how = How.XPATH, using ="//input[@id='FinalDetailsEdit_embedded_questions_list_AdvancedShopperPolicyEffectiveDate']")
	private WebElement policyStartDate;
	
	public void enterPolicyStartDate(String StartDate) throws InterruptedException {
    policyStartDate.sendKeys("StartDate");
    Thread.sleep(2000);
	}
	
	
	//Primary Email Address
	
	@FindBy(how = How.XPATH, using ="//input[@id='FinalDetailsEdit_embedded_questions_list_PrimaryEmailAddress']")
	private WebElement primaryEmail;
	
	public void enterPrimaryEmail() {
		primaryEmail.sendKeys("ayushabhatta217@gmail.com");
	}
	
	
	//Number of residents
	
	@FindBy(how = How.XPATH, using = "//select[@id='FinalDetailsEdit_embedded_questions_list_TotalResidents']")
	private WebElement numberOfResidents;
	
	public WebElement selNumOfResidents() {
		return numberOfResidents;
	}
	
	
	//Continue to next page 
	
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Continue')]")
	private WebElement continueNext;
	
	public void clickContinueNext() {
		this.continueNext.click();
	}
	
	
	
}
