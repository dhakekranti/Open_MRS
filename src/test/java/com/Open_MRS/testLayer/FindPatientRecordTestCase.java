package com.Open_MRS.testLayer;

import org.testng.annotations.Test;

import com.Open_MRS.pageLayer.FindPatientRecord;

public class FindPatientRecordTestCase {

	@Test
	public void findPatientRecord() throws Exception {
		FindPatientRecord fndPatRecTestCase = new FindPatientRecord();
		fndPatRecTestCase.findPatientRecord().click();
		fndPatRecTestCase.findRecord();
	}
}
