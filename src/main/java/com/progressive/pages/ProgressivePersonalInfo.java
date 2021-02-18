package com.progressive.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProgressivePersonalInfo {
	
	WebDriver driver;
	
	
	public ProgressivePersonalInfo(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Locate FirstName
	
	@FindBy(how = How.ID_OR_NAME, using="NameAndAddressEdit_embedded_questions_list_FirstName")
	private WebElement firstName;
	
	public void enterFirstName(String FirstName) {
		firstName.sendKeys("FirstName");
	}
	
	
	
	//Locate LastName
	
	@FindBy(how = How.ID_OR_NAME, using="NameAndAddressEdit_embedded_questions_list_LastName")
	private WebElement lastName;
	
	public void enterLastName(String LastName) {
		lastName.sendKeys("LastName");
	}
	
	
	
	//Locate DateOfBirth
	@FindBy(how = How.ID, using="NameAndAddressEdit_embedded_questions_list_DateOfBirth")
	private WebElement dateOfBirth;
	
	public void enterDateOfBirth(String DOB) {
		dateOfBirth.sendKeys("DOB");
	}
	
	
	//Locate MailingAddress
	@FindBy(how = How.ID, using="NameAndAddressEdit_embedded_questions_list_MailingAddress")
	private WebElement mailingAddress;
	
	public void enterMailingAddress(String Address) {
		mailingAddress.sendKeys("Address");
	}
	
	
	
	
	//Locate Start my Quote
	@FindBy(how = How.XPATH, using="//button[contains(text(),'Okay, start my quote.')]")
	private WebElement startQuote;
	
	public void clickStartTheQuote() {
		startQuote.click();
		
		}
	
	
	//Locate AddVehicle
	@FindBy(how = How.ID, using="VehiclesAllEdit_embedded_questions_list_8e1d4acb-c6ef-450f-84ab-c753862466da")
	private WebElement addVehicle;
	
	public void addVehicle() {
		addVehicle.click();
	}
	
	
	
	
	//Locate Continue after selecting a vehicle
	@FindBy(how = How.XPATH, using="//button[contains(text(),'Continue')]")
	private WebElement continueNext;
	
	
public void continueToNext() {
		continueNext.click();
	}

	
}
