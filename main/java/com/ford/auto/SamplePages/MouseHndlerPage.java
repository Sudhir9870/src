package com.ford.auto.SamplePages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.ford.auto.pageobjectutils.DropDown;
import com.ford.auto.utilities.BaseTest;
import com.ford.auto.pageobjectutils.WebElementKeys;

public class MouseHndlerPage extends BaseTest {

	@FindBy(xpath = "//input[contains(@id,'bmwradio')]")
	WebElement bmwRadioBtn;

	@FindBy(xpath = "//input[contains(@id,'benzradio')]")
	WebElement bmwRadioBtn1;

	@FindBy(xpath = "//input[contains(@id,'hondaradio')]")
	WebElement bmwRadioBtn2;

	@FindBy(xpath = "//input[contains(@id,'bmwcheck')]")
	WebElement BMWCheckBox1;

	@FindBy(xpath = "//input[contains(@id,'benzcheck')]")
	WebElement BMWCheckBox2;

	@FindBy(xpath = "//input[contains(@id,'hondacheck')]")
	WebElement BMWCheckBox3;

	@FindBy(id = "carselect")
	WebElement drpdown;

	@FindBy(xpath = "//*[@id='radio-btn-example']/fieldset")
	List<WebElement> bmwRadioBtns;

	DropDown drpDwn = new DropDown();
	WebElementKeys webAction = new WebElementKeys();

	public MouseHndlerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickBMWRadiobtn() throws InterruptedException {

		try {
			webAction.selectCheckBox(bmwRadioBtn);
			
			webAction.unSelectCheckBox(bmwRadioBtn);
			webAction.selectCheckBox(bmwRadioBtn1);
			webAction.unSelectCheckBox(bmwRadioBtn1);
			webAction.selectCheckBox(bmwRadioBtn2);
			webAction.unSelectCheckBox(bmwRadioBtn2);

			bmwRadioBtn.click();
			Select dropdown = new Select(drpdown);
			dropdown.selectByVisibleText("BMW");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectTheDropDown() {
		try {
			drpDwn.selectByValue(drpdown, "BMW");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectTheCheckBox() {
		try {
			webAction.selectCheckBox(BMWCheckBox1);
			
			webAction.unSelectCheckBox(BMWCheckBox1);
			webAction.selectCheckBox(BMWCheckBox2);
			webAction.unSelectCheckBox(BMWCheckBox2);
			webAction.selectCheckBox(BMWCheckBox3);
			webAction.unSelectCheckBox(BMWCheckBox3);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// bmwRadioBtn.click();
	}
}
