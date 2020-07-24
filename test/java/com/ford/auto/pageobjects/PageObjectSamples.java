package com.ford.auto.pageobjects;

import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ford.auto.SamplePages.LetsKodeItHomePage;
import com.ford.auto.atFordCulturePages.CultureHomePage;
import com.ford.auto.atFordCulturePages.OurTruthsPage;
import com.ford.auto.atFordCulturePages.WSLPage;
import com.ford.auto.atFordCulturePages.CultureEnglish;
import com.ford.auto.atFordCulturePages.AtFordHomePage;
import com.ford.auto.pageobjectutils.FrameWindowHandler;
import com.ford.auto.pageobjectutils.POMCommon;
import com.ford.auto.pageobjectutils.WebElementKeys;
import com.ford.auto.utilities.BaseTest;

public class PageObjectSamples extends BaseTest {
	LetsKodeItHomePage letskodeit;
	CultureHomePage culturehomepage;
	AtFordHomePage atfordhomepage;
	CultureEnglish culture;
	OurTruthsPage ourTruth;
	WSLPage wslPage;
	POMCommon pomCommon;
	WebElementKeys webAction = new WebElementKeys();
	FrameWindowHandler windowHandler = new FrameWindowHandler();

	@Test
	public void alertTesting() throws Exception {
		try {

			setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
			reportUtils.addInfo("Executing Started for Test: " + methodName, methodName);
			reportUtils.addInfo("Executing Started Step 1: ", methodName);

			launchBrowser("https://letskodeit.teachable.com/p/practice");
			letskodeit = PageFactory.initElements(driver, LetsKodeItHomePage.class);
			common.waitForPageLoad(2000);
			letskodeit.clickshow();

			letskodeit.entertext("Enter Text");
			reportUtils.addInfo("POMCommonUtils - alertGettext Method --> Text from Alert Box -->"+ letskodeit.clickOnAlertBtnAndGetText(dataTable.get("Alert Text1")), methodName);
			Thread.sleep(2000);
			letskodeit.acceptAlert();
			
			letskodeit.clickAndAcceptAlert(dataTable.get("Alert Text2"));
			reportUtils.addInfo("POMCommonUtils - alertAccept Method ", methodName);
			letskodeit.clickAndDismissAlert(dataTable.get("Alert Text3"));
			reportUtils.addInfo("POMCommonUtils - alertDismiss Method ", methodName);
			letskodeit.mouseHoverMethod(0, 500);
			reportUtils.addInfo("ScrollToPosition Method", methodName);
			webAction.scrollUp();
			reportUtils.takeScreenShot("ScrollUp Method", "ScrollUp Method Working");
			webAction.scrollDown();
			reportUtils.addInfo("ScrollDown Method Working", methodName);
			// Popup Text

			launchBrowser("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
			driver.switchTo().frame("iframeResult");
			letskodeit.clickTryItBtn();
			webAction.setPopupText(dataTable.get("PopupText"));
			reportUtils.addInfo(
					"POMCommonUtils - SetPopupText Method --> Text from Alert Box -->" + webAction.alertGettext(),
					methodName);
			webAction.alertAccept();
			reportUtils.addInfo("Getting Title" + driver.getTitle(), methodName);

		} catch (Exception e) {
			e.printStackTrace();
			reportUtils.addInfoOnValidations(methodName, false, "Fail_Msg", e.getMessage());
		}
	}

	@Test
	public void webActions() throws Exception {
		try {

			setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
			reportUtils.addInfo("Executing Started for Test: " + methodName, methodName);
			reportUtils.addInfo("Executing Started Step 1: ", methodName);

			launchBrowser("https://letskodeit.teachable.com/p/practice");
			Thread.sleep(5000);
			
			
			letskodeit = PageFactory.initElements(driver, LetsKodeItHomePage.class);
			letskodeit.clickbmwRadioBtn();
			reportUtils.addInfo("click on the radio button", methodName);
			letskodeit.selectDropdown();
			reportUtils.addInfo("select the dropdown value ", methodName);
			letskodeit.clickbenzChkBoxBtn();
			reportUtils.addInfo("click on the checkbox", methodName);
			letskodeit.mouseHoverMethod(0, 400);
			reportUtils.addInfo("ScrollToPosition Method", methodName);
			webAction.scrollDown();
			reportUtils.addInfo("ScrollDown Method Working", methodName);
			webAction.scrollUp();
			reportUtils.addInfo("ScrollUp Method Working", methodName);
			letskodeit.openNewWindow();
			reportUtils.addInfo("open new window ", methodName);

			letskodeit.openNewTab();
			reportUtils.addInfo("Sopen New Tab", methodName);
			Thread.sleep(2000);
			letskodeit.selectMultepleValues();
			reportUtils.addInfo("seleted multiple values in multi dropdown", methodName);
			reportUtils.addInfo("Getting Title" + driver.getTitle(), methodName);

		} catch (Exception e) {
			e.printStackTrace();
			reportUtils.addInfoOnValidations(methodName, false, "Fail_Msg", e.getMessage());
		}

	}

	@Test
	public void culturelinktest() throws Exception {
		try {
			// setupTest(this.getClass().getPackage(), this.getClass().toString(),
			// methodName);
			launchBrowser("https://www.at.ford.com/en/homepage.html");
			atfordhomepage = PageFactory.initElements(driver, AtFordHomePage.class);
			if(configData.get("Browser").equalsIgnoreCase("chrome")) {
			atfordhomepage.clickOnFaq();
			String CurrentwindowHandle = windowHandler.getMainWindowHandle();
			Set<String> allWindows = driver.getWindowHandles();
			System.out.println("common.getMainWindowHandle()----- + " + CurrentwindowHandle);
			for (String CW : allWindows) {
				System.out.println(CW);
				if (!(CW.equals(CurrentwindowHandle))) {
					driver.switchTo().window(CW);
					driver.manage().window().maximize();
					System.out.println("Window Title :" + driver.getTitle());
				}
			}
			}
			atfordhomepage.clickonculture();
			reportUtils.addInfo("Clicked on Culture", methodName);
			wslPage = PageFactory.initElements(driver, WSLPage.class);
			wslPage.clickOnADFS();
			culturehomepage = PageFactory.initElements(driver, CultureHomePage.class);
			Thread.sleep(1000);
			culturehomepage.clickEnglish();
			Thread.sleep(2000);
			reportUtils.addInfo("Clicked on English", methodName);
			culture = PageFactory.initElements(driver, CultureEnglish.class);
			culture.FordCultureLinkCheck();
			culture.OurTruthsLinkCheck();
			ourTruth = PageFactory.initElements(driver, OurTruthsPage.class);
			ourTruth.OurTruthsLinkCheck();
			reportUtils.addInfo("OurTruth page verified", methodName);
		} catch (Exception e) {
			e.printStackTrace();
			reportUtils.failTest(methodName, e.getMessage());
		}
	}
}
