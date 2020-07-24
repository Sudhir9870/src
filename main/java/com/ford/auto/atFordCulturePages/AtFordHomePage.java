package com.ford.auto.atFordCulturePages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ford.auto.pageobjectutils.MouseHandler;

public class AtFordHomePage {
	private WebDriver driver;
	MouseHandler mousehandler = new MouseHandler();
	@FindBy(xpath="//*[@id='nav-wrap']/li/a[contains(text(),'Culture')]")
	WebElement culture;

	@FindBy(xpath="//*[@id='nav-wrap']/li[9]/ul/div/div/ul/li/a[contains(text(),'Culture Site')]")
	WebElement CultureSite;
	@FindBy(xpath="//div[@class='header-icons']/a[3]")
	WebElement faq;
	// Constructor
	public AtFordHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonculture() throws IOException {

		try {
			mousehandler.hoverAndClick(culture, CultureSite);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	public void clickOnFaq() throws Exception {
		mousehandler.clickUsingActionsMethod(faq);
	}
}
