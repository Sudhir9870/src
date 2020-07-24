package com.ford.auto.SamplePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ford.auto.pageobjectutils.FrameWindowHandler;
import com.ford.auto.pageobjectutils.WebElementKeys;
import com.ford.auto.utilities.BaseTest;

public class AlertBoxExamplePage extends BaseTest {

	FrameWindowHandler frameHandler = new FrameWindowHandler();
	WebElementKeys webAction = new WebElementKeys();

	@FindBy(xpath = "//button[text()='Try it']")
	WebElement btnAlert;

	public AlertBoxExamplePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickTheTryBtn() throws Exception {

		
			frameHandler.switchToFrame("iframeResult");
			// button.click(btnAlert);
			System.out.println("Button Text =" + webAction.getText(btnAlert));
			webAction.verifyText(btnAlert, "Try it");
			webAction.clickUsingJavaScript(btnAlert);
		
	}

	public void acceptTheAlert() {
		try {
			popupHandler.alertAccept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dismissTheAlert() {
		try {
			popupHandler.alertDismiss();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void textPopularHandler(String txtValue) {
		try {
			popupHandler.SetPopoupText(txtValue);
			;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
