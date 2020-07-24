package com.ford.auto.atFordCulturePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ford.auto.pageobjectutils.WebElementKeys;

public class OurTruthsPage {
	WebElementKeys webAction = new WebElementKeys();
	
	@FindBy(xpath="//a[text()='Download Our Truths']")
	WebElement txtInourTruth;

	public void OurTruthsLinkCheck() throws Exception{
			webAction.verifyText(txtInourTruth, "Download Our Truths");
		

	}
}
