package com.ford.auto.SamplePages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ford.auto.pageobjectutils.DropDown;
import com.ford.auto.pageobjectutils.FrameWindowHandler;
import com.ford.auto.pageobjectutils.MouseHandler;
import com.ford.auto.pageobjectutils.WebElementKeys;
import com.ford.auto.utilities.BaseTest;

public class LetsKodeItHomePage extends BaseTest{
	private WebDriver driver;
	WebElementKeys webAction = new WebElementKeys();
	MouseHandler mouseHandler  = new MouseHandler();
	FrameWindowHandler fwHandler = new FrameWindowHandler();
	DropDown dropDown = new DropDown();
	public LetsKodeItHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="bmwradio")
	public WebElement bmwRadioBtn;

	@FindBy(id = "benzradio")
	public WebElement benzRadioBtn;

	@FindBy(id = "hondaradio")
	public WebElement hondaRadio;

	@FindBy(id = "bmwcheck")
	public WebElement bmwChkBox;

	@FindBy(id = "benzcheck")
	public WebElement benzChkBox;

	@FindBy(id = "hondacheck")
	public WebElement hondaChkBox;

	@FindBy(id = "carselect")
	public WebElement drpdown;
	
	@FindBy(id="name")
	public WebElement nameTxt;
	
	@FindBy(xpath = "//*[@id='radio-btn-example']/fieldset")
	public List< WebElement> bmwRadioBtns;
	
	@FindBy(id="displayed-text")
	public WebElement displayedTextBox;
	
	@FindBy(id="hide-textbox")
	public WebElement hide;
	
	@FindBy(id="show-textbox")
	public WebElement show;
	
	@FindBy(id="name")
	public WebElement textForAlert;
	
	@FindBy(id="alertbtn")
	public WebElement alertBtn;
	
	@FindBy(id="confirmbtn")
	public WebElement alertConfirmBtn;
	
	@FindBy(id="carselect")
	public WebElement carselectdropdown;
	
	@FindBy(id="multiple-select-example")
	public WebElement carselectmultidropdown;
	
	@FindBy(xpath="//*[text()='Mouse Hover Example']")
	public WebElement mouseHoverLabel;
	
	@FindBy(xpath="//*[text()='Try it']")
	public WebElement btnTryIt;
	
	@FindBy(id="mousehover")
	public WebElement mousehover;
	
	@FindBy(xpath="//a[contains(text(),'Top')]")
	public WebElement topMenu;
	
	@FindBy(id="openwindow")
	public WebElement openWindow;
	
	@FindBy(id="opentab")
	public WebElement openTab;	
	
	@FindBy(id="multiple-select-example")
	public WebElement mulselectdrpdwn;
	
	
	public void clickhide() throws Exception {
		webAction.clickUsingJavaScript(hide);
	}
	public void clickshow() throws Exception {
		webAction.clickUsingJavaScript(show);
	}
	public void entertext(String name) throws Exception{
		webAction.setText(displayedTextBox,name);
	}
	public String clickOnAlertBtnAndGetText(String alertText) throws Exception {
		webAction.setText(textForAlert,alertText);
		webAction.clickUsingJavaScript(alertBtn);
		return webAction.alertGettext();
	}
	public void clickAndAcceptAlert(String alertText) throws Exception {
		webAction.setText(textForAlert,alertText);
		webAction.clickUsingJavaScript(alertConfirmBtn);
		Thread.sleep(2000);
		webAction.alertAccept();
	}
	public void clickAndDismissAlert(String alertText) throws Exception {
		webAction.setText(textForAlert,alertText);
		webAction.clickUsingJavaScript(alertConfirmBtn);
		Thread.sleep(2000);
		webAction.alertDismiss();
	}
	public void mouseHoverMethod(int x, int y) {		
		webAction.scrollToPosition(x, y);		
	}
	public void clickTryItBtn() throws Exception {		
		webAction.clickUsingJavaScript(btnTryIt);
	}
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//webAction.alertAccept();
	}
	public void clickbmwRadioBtn() throws Exception {
		webAction.clickUsingJavaScript(bmwRadioBtn);
		bmwRadioBtn.click();
	}
	public void selectDropdown() throws Exception {
		dropDown.selectByIndex(carselectdropdown, 2);		
	}
	public void clickbenzChkBoxBtn() throws Exception {
		webAction.clickUsingJavaScript(hondaChkBox);
	}
	public void clickOnTobMenu() throws Exception {
		//mouseHandler.hoverElement(mousehover);
		//webAction.click(topMenu);
		mouseHandler.hoverAndClick(mousehover, topMenu);
	}
	public void openNewWindow() throws Exception {
		webAction.clickUsingJavaScript(openWindow);
	}
	public void openNewTab() throws Exception {
		webAction.clickUsingJavaScript(openTab);
	}
	public void selectMultepleValues() throws Exception {
		dropDown.selectByIndex(mulselectdrpdwn, 2);
		dropDown.selectByIndex(mulselectdrpdwn, 1);
	}
}
