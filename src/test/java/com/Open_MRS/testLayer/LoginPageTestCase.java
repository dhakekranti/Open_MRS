package com.Open_MRS.testLayer;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Open_MRS.pageLayer.LoginPage;
import com.Open_MRS.testBase.TestBase;

public class LoginPageTestCase extends TestBase {
	
	@Test
	
	public void login() throws IOException
	{
		setup();
		driver.get(prop.getProperty("url"));
		
		LoginPage loginpage = new LoginPage();
		loginpage.enterUsername().sendKeys(prop.getProperty("username"));
		loginpage.enterPassword().sendKeys(prop.getProperty("password"));
		loginpage.click_impatient_ward().click();
		loginpage.clickOnLoginbtn().click();
	}
}
