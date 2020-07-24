package com.ford.auto.mobile;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ford.auto.reusablecomponents.GlobalVariables;
import com.ford.auto.reusablecomponents.MobileWrapper;
import com.ford.auto.utilities.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileTester extends BaseTest{

	static AndroidDriver<MobileElement> appdriver;

	@BeforeClass 
	public void setUpClass() throws Exception {
		System.out.println("OurCompany Before class");
		setupClass(this.getClass().getPackage(), this.getClass().toString());
	}	

	@Test
	public void testMobileNativeApp() throws IOException
	{
		String methodName = "testMobileNativeApp";
		try {			

			if(isGridMode){
				methodLevelChildTest = gridParentTest.get().createNode(methodName);
				System.out.println("*****!!!!!****** " + methodName);			
				gridChildTest.set(methodLevelChildTest);
			}	

			appdriver = MobileWrapper.mobileLaunchApp();
			Thread.sleep(10000);			
			appdriver.findElement(By.id("com.ford.oa:id/login_input_username_edittext")).sendKeys("YOU");			
			appdriver.findElement(By.id("com.ford.oa:id/login_input_password_edittext")).sendKeys("PWD");
			MobileWrapper.closeApp();

		} catch (Exception e) {
			e.printStackTrace();
			reportUtils.addInfoOnValidations(methodName, false, "Success_Msg", e.getMessage());
		}
	}

	@Test
	public void testMobileHybridApp() throws IOException
	{
		String methodName = "testMobileHybridApp";
		try {			

			appdriver = MobileWrapper.mobileLaunchApp();			
			appdriver.get(GlobalVariables.configData.get("ApplicationURL").toString());			

			Thread.sleep(3000);
			textBox.setText("mobileSearchBox_xpath", "Ford123");
			Thread.sleep(3000);
			button.click("mobileSearchButton_xpath");
			Thread.sleep(3000);

		} 
		catch (Exception e) {
			e.printStackTrace();
			reportUtils.addInfoOnValidations(methodName, false, "Success_Msg", e.getMessage());
		}
	}
}
