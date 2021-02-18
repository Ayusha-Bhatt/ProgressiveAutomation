package com.progressive.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContinueWithJustAuto {
	
	WebDriver driver;
	
	public ContinueWithJustAuto(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH,using="//body[1]/app-root[1]/form[1]/main[1]/ng-component[1]/interview-layout-template[1]/div[4]/navigation-container[1]/div[1]/forward-navigation[1]/loading-button[1]/button[1]")
	private WebElement contWithAuto;
	
	public void clickContWithAuto() {
		this.contWithAuto.click();
	}

}
