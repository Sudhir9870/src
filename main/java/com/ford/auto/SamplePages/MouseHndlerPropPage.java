package com.ford.auto.SamplePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ford.auto.utilities.BaseTest;
import com.ford.auto.webelements.CheckBox;
import com.ford.auto.webelements.DropDown;
import com.ford.auto.webelements.RadioButton;

public class MouseHndlerPropPage extends BaseTest {

	RadioButton radioBtn = new RadioButton();
	DropDown drpDwn = new DropDown();
	CheckBox chkBox = new CheckBox();

	public MouseHndlerPropPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickBMWRadiobtn() throws InterruptedException {

		try {
			radioBtn.selectRadioOption("sample.bmwRadioBtn");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectTheDropDown() {
		try {
			drpDwn.selectByValue("sample.carselect", "BMW");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectTheCheckBox() {
		try {
			chkBox.selectCheckBox("sample.BMWCheckBox");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// bmwRadioBtn.click();
	}
}
