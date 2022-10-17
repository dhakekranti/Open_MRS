package com.Open_MRS.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Open_MRS.testBase.TestBase;

public class Logout extends TestBase{

	public Logout(){
		PageFactory.initElements(driver, this);
	}
	
//	Logout Functionality
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement Logout;
	
	public WebElement click_logout() {
		try {
			System.out.println(Logout);
			return Logout;
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public void closeBrowser() {
		driver.close();
	}
	
}
