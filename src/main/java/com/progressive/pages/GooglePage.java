package com.progressive.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GooglePage {
	
	
	WebDriver driver;
	public GooglePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//searbox clocator
	@FindBy(how = How.ID_OR_NAME, using="q")
	private WebElement googleSearchBox;
	
	
	//GMAIL LINK
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Gmail')]")
	private WebElement gmailLink;
	
	

	
	public void enterSearchText(String searchKeyWord) {
		googleSearchBox.sendKeys(searchKeyWord);
		googleSearchBox.sendKeys(Keys.ENTER);
		
	}
	
	public void clickOnGmail() {
		gmailLink.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
}
