package com.ford.auto.SamplePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ford.auto.pageobjectutils.WebElementKeys;

public class DownlodExamplePage {
	private WebDriver driver;

	@FindBy(xpath = "//img[contains(@class,'photo-item__img')][1]")
	WebElement imgLinkClick;

	@FindBy(xpath = "//a/span[text()='Free Download']/parent::a")
	WebElement btnDownload;
	WebElementKeys webAction = new WebElementKeys();

	public DownlodExamplePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickImageLink() throws Exception {
		webAction.click(imgLinkClick);

	}

	public void clickDownloadbtn() throws Exception {
		webAction.click(btnDownload);
	}

}
