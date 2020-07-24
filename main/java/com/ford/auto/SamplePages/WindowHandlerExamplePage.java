package com.ford.auto.SamplePages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ford.auto.utilities.BaseTest;

/***
 * 
 * @author TSARASWA This class will explain how to hadle the operations if we
 *         have multiple windows
 */
public class WindowHandlerExamplePage extends BaseTest {
	private WebDriver driver;

	@FindBy(xpath = "//*[@id=\"nav-wrap\"]/li[7]/a")
	WebElement atFordLink;

	@FindBy(xpath = "//*[text()='Life@Ford']")
	WebElement lnkLifeAtFord;

	@FindBy(xpath = "//img[@title='ECOSPORT']")
	WebElement lnkEcosport;

	@FindBy(xpath = "//img[@title='ECOSPORT']/parent::div/following-sibling::div/descendant::li/a[text()='Photos']")
	WebElement lnkPhotos;

	@FindBy(xpath = "//img[@title='ECOSPORT']/parent::div/following-sibling::div/descendant::li/a[text()='Photos']/following-sibling::ul/descendant::div/span[text()='Walkaround photos']")
	WebElement lnkImgClick;

	@FindBy(xpath = "//a[@aria-label='_MB_9133 by @Ford News']")
	WebElement lnkFordNews;

	@FindBy(xpath = "//span[@class='download-album-icon']")
	WebElement lnkDownloadPhotos;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement lnkDownloadPhotosCancel;

	public WindowHandlerExamplePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickTheEcospotPhotsLink() {
		lnkEcosport.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(lnkPhotos));
		lnkPhotos.click();

		// 1st window
		String CurrentwindowHandle = driver.getWindowHandle();
		lnkImgClick.click();
		// Getting all windows
		Set<String> allWindows = driver.getWindowHandles();
		try {
			// Now iterating to all windows
			for (String CW : allWindows) {
				System.out.println(CW);
				// 1st iteration
				if (!(CW.equals(CurrentwindowHandle))) {
					driver.switchTo().window(CW);
					Thread.sleep(2000);
					lnkDownloadPhotos.click();
					Thread.sleep(2000);
					lnkDownloadPhotosCancel.click();
					Thread.sleep(2000);
					driver.close(); // Closing the new window
				}
			}
			// Switch back to parent browser
			driver.switchTo().window(CurrentwindowHandle);
			driver.close();

		} catch (Exception e) {
			e.printStackTrace();
			testResult = "fail";

		}

	}
}
