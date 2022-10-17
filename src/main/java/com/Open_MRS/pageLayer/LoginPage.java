package com.Open_MRS.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Open_MRS.testBase.TestBase;

public class LoginPage extends TestBase {

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
//	Email
	@FindBy(xpath = "//input[@name='username']")
	private WebElement email_box;
	
	public WebElement enterUsername() {
		return email_box;
	}
	
	//Password
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password_box;
	
	public WebElement enterPassword() {
		return password_box;
	}
	
	//Impatient ward (Unordered List)
	
	@FindBy(xpath = "//li[@id = 'Inpatient Ward']")
	private WebElement impatient_ward;
	
	public WebElement click_impatient_ward() {
		return impatient_ward;	
	}
	
	
	//Login Button
 
	@FindBy(xpath= "//input[@id='loginButton']")
	private WebElement login_btn;
	
	public WebElement clickOnLoginbtn() {
		return login_btn;
	}
}
