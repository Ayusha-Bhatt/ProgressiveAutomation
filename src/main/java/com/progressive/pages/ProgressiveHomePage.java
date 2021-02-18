package com.progressive.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProgressiveHomePage {
	
	WebDriver driver;
	
	public ProgressiveHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Locate Auto 
	
	
	@FindBy(how = How.XPATH, using="//body/div[@id='site']/main[@id='main']/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement autoInsurance;
	
	
	//Zipcode Locator
	
	@FindBy(how = How.NAME, using="ZipCode") 
	private WebElement zipCode;
	
	//Continue
	
	@FindBy(how = How.XPATH, using="//input[@id='qsButton_overlay']")
	private WebElement continueBtn;
	
	public void clickOnGetQuote() throws InterruptedException {
		this.continueBtn.click();
		Thread.sleep(2000);
	}
	
	
	
	
	public void clickOnAuto() {
		this.autoInsurance.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	public void enterZipCode(String searchZipCode) {
		this.zipCode.sendKeys("75150");
		
	}
	
	
	
	
	
	
	

}
