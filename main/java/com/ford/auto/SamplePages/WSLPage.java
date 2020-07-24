package com.ford.auto.SamplePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ford.auto.pageobjectutils.WebElementKeys;

import org.openqa.selenium.support.FindBy;

public class WSLPage {

	private WebDriver driver;
	WebElementKeys webAction = new WebElementKeys();
	public WSLPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="ADloginUserIdInput")
	public WebElement id;
	@FindBy(id="ADloginPasswordInput")
	public WebElement pwd;
	@FindBy (name="fastLogin")
	public WebElement checkToSimplify;
	@FindBy(id="ADloginHeaderTitle")
	WebElement title;
	@FindBy(xpath="//*[@id='ADloginWSLSubmitButton']/input")
	WebElement submitBtn;
	public void enterid(String text) throws Exception {
		webAction.setText(id, text);
	}
	public void enterpwd(String text) throws Exception {
		webAction.setSecureText(pwd, text);
	}
	public boolean ischecked() {
		return checkToSimplify.isSelected();
		
	}
	public void selectCheckBox() throws Exception {
		webAction.selectCheckBox(checkToSimplify); 
		
	}
	public void unselectCheckBox() throws Exception {
		webAction.unSelectCheckBox(checkToSimplify); 
		
	}
	public String getHeaderText() throws Exception{
		return webAction.getText(title);
	}
	public boolean verifytext() throws Exception{
		return webAction.verifyText(title, "WEB SINGLE LOGIN");
	}
	public void validatetext() throws Exception{
		webAction.validateText(title, "WEB SINGLE LOGIN");
	}
	public void clickSubmitButton_JS() throws Exception{
		webAction.clickUsingJavaScript(submitBtn);
	}
}
