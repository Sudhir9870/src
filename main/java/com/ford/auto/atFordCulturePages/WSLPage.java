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

public class WSLPage {
	private WebDriver driver;
	WebElementKeys webAction = new WebElementKeys();
	@FindBy(id="ADloginStrongAuthRef")
	WebElement linkADFS;
	// Constructor
	public WSLPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnADFS() throws IOException {

		try {
			webAction.click(linkADFS);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
