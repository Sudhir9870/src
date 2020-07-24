package com.ford.auto.atFordCulturePages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ford.auto.pageobjectutils.MouseHandler;

public class CultureHomePage {
	private WebDriver driver;
	MouseHandler mousehandler = new MouseHandler();
	
	@FindBy(xpath="//a/p[text()='English']")
	WebElement language;

	// Constructor
	public CultureHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickEnglish() throws IOException {

		try {
			mousehandler.clickUsingActionsMethod(language);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	
}
