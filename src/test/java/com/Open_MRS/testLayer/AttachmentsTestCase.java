package com.Open_MRS.testLayer;

import org.testng.annotations.Test;

import com.Open_MRS.pageLayer.Attachment;

public class AttachmentsTestCase {

	@Test
	public void attachmentTestCase() throws Exception {
		Attachment attachment = new Attachment();
		attachment.attachFile();
	}
}
