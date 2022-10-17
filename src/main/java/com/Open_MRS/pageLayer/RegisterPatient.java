package com.Open_MRS.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Open_MRS.testBase.TestBase;

public class RegisterPatient extends TestBase {
	
	public RegisterPatient(){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[contains(@id,'registerPatient')]")
	private WebElement registerElement;
	
	@FindBy(xpath = "//i[@class='icon-home small']")
	private WebElement home;
	
	public WebElement registerPatient() throws Exception{
		return registerElement;
	}
	
	
	
	public WebElement homeIcon() throws Exception{
		return home;
	}
	
	public void fillRegisterPatient() {
		
		//Insert name and surname
		inputText("//input[@name='givenName']", "TOM");
		inputText("//input[@name='familyName']", "Johnny");
		clickElement("//button[@id='next-button']");
		
		//enter gender
		selectBox("//select[@id='gender-field']", "Female");
		clickElement("//button[@id='next-button']");
		
		//enter birthday
		inputText("//input[@id='birthdateDay-field']", "16");
		selectBox("//select[@id='birthdateMonth-field']", "April");
		inputText("//input[@id='birthdateYear-field']", "1992");
		clickElement("//button[@id='next-button']");
		
		//enter address
		inputText("//input[@id='address1']", "LOS");
		inputText("//input[@id='address2']", "Angel");
		inputText("//input[@id='cityVillage']", "Village4");
		inputText("//input[@id='stateProvince']", "state5");
		inputText("//input[@id='country']", "America");
		inputText("//input[@id='postalCode']", "9534872");
		clickElement("//button[@id='next-button']");
		
		//enter phone number
		inputText("//input[@name='phoneNumber']", "9534872609");
		clickElement("//button[@id='next-button']");
		
		//select relative type
		selectBox("//select[@id='relationship_type']", "Doctor");
		inputText("//input[@placeholder='Person Name']", "TOM JOHNNY");
		clickElement("//button[@id='next-button']");
		
		//confirm
		clickElement("//input[@id='submit']");
	}
}
