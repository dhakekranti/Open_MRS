package com.Open_MRS.pageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Open_MRS.testBase.TestBase;

public class Attachment extends TestBase {

	
	public Attachment() {
		PageFactory.initElements(driver, this);
	}
	
	public void attachFile()throws Exception {
		
		try {
			driver.switchTo();
			String strFilePath = System.getProperty("user.dir");
			List<WebElement> lstOfWebElement = driver.findElements(By.xpath("//a[contains(@id,'attachments')]"));
			lstOfWebElement.get(0).click();
			WebElement wbOfChooseFile = driver.findElement(By.xpath("//form[@id='visit-documents-dropzone']"));
			wbOfChooseFile.sendKeys(strFilePath+"\\fileToUpload\\File_To_Upload.txt");
			inputText("//textarea[@placeholder='Enter a caption']", "This document");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
