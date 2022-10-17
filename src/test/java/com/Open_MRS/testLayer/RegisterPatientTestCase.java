package com.Open_MRS.testLayer;

import org.testng.annotations.Test;

import com.Open_MRS.pageLayer.RegisterPatient;

public class RegisterPatientTestCase {

	@Test
	public void registerPateientTestCase() {
		RegisterPatient registerPatient = new RegisterPatient();
		try {
			registerPatient.registerPatient().click();
			//registerPatient.homeIcon().click();
			registerPatient.fillRegisterPatient();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
