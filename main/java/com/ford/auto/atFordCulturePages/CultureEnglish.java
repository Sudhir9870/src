package com.ford.auto.atFordCulturePages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.ford.auto.pageobjectutils.MouseHandler;
import com.ford.auto.pageobjectutils.POMCommon;
import com.ford.auto.pageobjectutils.WebElementKeys;

public class CultureEnglish {
	private WebDriver driver;
	WebElementKeys webAction = new WebElementKeys();
	@FindBy(xpath="//table[@id='GlobalNavTable']/tbody/tr/td/div/a[text()='Ford Culture']")
	WebElement FordCulture;

	@FindBy(xpath="//table[@id='GlobalNavTable']/tbody/tr/td/div/a[text()='Our Truths']")
	WebElement OurTruths;

	// Constructor
	public CultureEnglish(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void FordCultureLinkCheck() throws IOException {

		try {
			webAction.verifyText(FordCulture, "Ford Culture");
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	public void OurTruthsLinkCheck() throws IOException {

		try {
			webAction.verifyText(OurTruths, "Our Truth");
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	public void clickOurTruthsLink() throws IOException {

		try {
			webAction.clickUsingJavaScript(OurTruths);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
