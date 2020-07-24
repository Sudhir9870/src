package com.ford.auto.SamplePages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.ford.auto.pageobjectutils.POMCommon;
import com.ford.auto.pageobjectutils.WebElementKeys;
import com.ford.auto.utilities.BaseTest;

public class UploadExamplePage extends BaseTest {

	@FindBy(xpath = "//*[@id='file-upload']")
	WebElement btnChooseFile;

	@FindBy(xpath = "//*[@id='file-submit']")
	WebElement btnUpload;

	@FindBy(xpath = "//h3[text()='File Uploaded!']")
	WebElement txtSuccessmessage;

	private WebDriver driver;
	POMCommon pomMethods = new POMCommon();
	WebElementKeys webAction = new WebElementKeys();

	// file upload functionality
	public UploadExamplePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void chooseUploadFileName(String FileName, String EXEFileName) {
		// String fileUpload = EXEFileName +" "+FileName;
		String fileUpload = EXEFileName + "\\" + FileName;

		try {
			// Auto IT script
			/*
			 * button.click(btnChooseFile); // This will invoke AutoIT script here give the
			 * path of the script // Once you will run this program AutoIt script will be
			 * invoked and respective f//ile will be attached
			 * Runtime.getRuntime().exec(fileUpload); Thread.sleep(5000);
			 */
			btnChooseFile.click();
			// pomMethods.upload(btnChooseFile, fileUpload);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void chooseUploadFileName() {

		String filePath = "test\\resources\\file";
		String fileName = "SeleniumWebdriverUploadFile.txt";

		try {
			// Auto IT script
			/*
			 * button.click(btnChooseFile); // This will invoke AutoIT script here give the
			 * path of the script // Once you will run this program AutoIt script will be
			 * invoked and respective f//ile will be attached
			 * Runtime.getRuntime().exec(fileUpload); Thread.sleep(5000);
			 */
			btnChooseFile.click();

			// pomMethods.upload(btnChooseFile, fileUpload);
			// pomMethods.upload(btnChooseFile, filePath, fileName);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickUploadBtn() throws Exception {
		webAction.click(btnUpload);
		Thread.sleep(5000);
	}

	public void uploadsendkeys() throws Exception {
		btnChooseFile.sendKeys(
				"C:\\Git\\selenium_new_version\\selenium-hybrid-application\\Utilities\\SeleniumWebdriverUploadFile.txt");
	}

	// Verifying upload functionality
	public void verifiedFileUploadSuccessMethod() throws IOException {

		try {
			Assert.assertEquals(txtSuccessmessage.getText(), "File Uploaded!", "File Uploaded!");
			Assert.assertTrue(true, "verifiedFileUploadSuccessMethod");
		} catch (Exception e) {
			e.printStackTrace();
			reportUtils.failTest("Exception", e.getMessage());

		}

	}

	public void chooseUplodFileName(String filetobeuploaded, String autoitexepath) {

		String fileupload = autoitexepath + " " + filetobeuploaded;

		try {
			webAction.click(btnChooseFile);
			// This will invoke AutoIT script here give the path of the script
			// Once you will run this program AutoIt script will be invoked and respective
			// f//ile will be attached
			Runtime.getRuntime().exec(fileupload);
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
