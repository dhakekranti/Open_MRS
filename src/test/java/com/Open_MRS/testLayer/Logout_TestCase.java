package com.Open_MRS.testLayer;

import org.testng.annotations.Test;
import com.Open_MRS.pageLayer.Logout;
import com.Open_MRS.testBase.TestBase;

public class Logout_TestCase extends TestBase  {

	@Test
	public void verify_Logout_functinality()
	{
		Logout logout = new Logout() ;
		logout.click_logout().click();	
		logout.closeBrowser();
	}
}
