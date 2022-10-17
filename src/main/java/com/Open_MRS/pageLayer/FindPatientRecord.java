package com.Open_MRS.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Open_MRS.testBase.TestBase;

public class FindPatientRecord extends TestBase {

	public FindPatientRecord() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(@id,'activeVisitsHomepageLink')][1]")
	private WebElement findPatientRecord;
	
	public WebElement findPatientRecord() throws Exception{
		return findPatientRecord;
	}
	
	public void findRecord()throws Exception {
		
		String strSearch = "TOM Johnny";
		//String strSearch = "jai";
		inputText("//input[@class='form-control']", strSearch);
		assertEquals("//tbody[@aria-live='polite']/tr/td[2]", strSearch);
	}
}
