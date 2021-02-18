package com.progressive.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SnapshotEnrollment {
	
	WebDriver driver;
	
	public SnapshotEnrollment(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID_OR_NAME, using="SnapshotEnrollment40Edit_embedded_questions_list_SnapshotPolicyEnrollment_N")
	private WebElement snapshotEnrollment;
	
	public void clickSnapEnrollment() {
		this.snapshotEnrollment.click();
	}
	
	//Continue to next
	
	@FindBy(how = How.XPATH, using = "//body[1]/app-root[1]/form[1]/main[1]/snapshot-enrollment-40-edit[1]/interview-layout-template[1]/div[1]/div[1]/div[3]/forward-navigation[1]/loading-button[1]/button[1]")
	private WebElement continueToNext;
	
	public void clickContinue() {
		this.continueToNext.click();
	}
	
}
