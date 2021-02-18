package com.progressive.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DriversOnQuote {
	
WebDriver driver;
	
	
	public DriversOnQuote (WebDriver driver){
		this.driver = driver;
	
		}
	
	
	//Continue with Drivers on Quote 
	
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Continue')]")
	private WebElement continueNext;
	
	public void clickContinue() {
		this.continueNext.click();
	}
	

}
