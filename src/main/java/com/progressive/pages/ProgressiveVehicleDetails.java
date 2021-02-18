package com.progressive.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProgressiveVehicleDetails  {
	
	WebDriver driver;
	
	
	public ProgressiveVehicleDetails(WebDriver driver){
		this.driver = driver;
		
	}
	
	//Locate Primary Use of Vehicle
	
	@FindBy(how = How.ID, using="VehiclesEditHvdVehicleDetails_embedded_questions_list_VehicleUse")
	private WebElement vehicledd;
	
	
	
	
	//return the Drop_down locator
	public WebElement getVehicleDropdown() {
		return vehicledd;
	}
	
	
	//Locate ownership
	
	@FindBy(how = How.ID, using="VehiclesEditHvdVehicleDetails_embedded_questions_list_OwnOrLease")
	private WebElement vehicleOwnership;
	
	
	public WebElement getVehicleOwnership() {
		return vehicleOwnership;
		
	}
	
	//Locate length of ownership
	
	@FindBy(how = How.ID, using="VehiclesEditHvdVehicleDetails_embedded_questions_list_LengthOfOwnership")
	private WebElement lenOfVehicle;
	
	public WebElement getLenOfVehicle() {
		return lenOfVehicle;
	}
	
	
	//Click on done 
	
	@FindBy(how = How.XPATH, using="//button[contains(text(),'Done')]")
	private WebElement doneBtn;
	
	public void clickOnDone() {
		this.doneBtn.click();
	}
	
	// Click on Continue and proceed to next page
	
	@FindBy(how = How.XPATH, using="//button[contains(text(),'Continue')]")
	private WebElement contBtn;
	
	public void clickOnContinue() {
		this.contBtn.click();
	}
	
	
	
	
	

}
