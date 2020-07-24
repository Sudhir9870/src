//****************************************************************

//* Copyright (c) 2016 Ford Motor Company. All Rights Reserved.

//****************************************************************
package com.ford.auto.winium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ford.auto.reusablecomponents.WiniumWrapper;
import com.ford.auto.utilities.BaseTest; 

public class WiniumTester extends BaseTest {

	@BeforeClass 
	public void setUpClass() throws Exception {
		System.out.println("WiniumTester Before class");
		setupClass(this.getClass().getPackage(), this.getClass().toString());
	}

	@Test
	public void testWindowsAppUsingWinium() throws IOException
	{
		String methodName = "WindowsWiniumApp"; 
		WiniumDriver winiumDriver = null;
		try
		{
			winiumDriver = WiniumWrapper.getWiniumDriver();

			calcAddition(winiumDriver);
			winiumDriver.findElementByName("Clear").click();

			calcSubtraction(winiumDriver);

			winiumDriver.findElementByName("Calculator").findElement(By.name("Close")).click();
			Thread.sleep(3000);

			WiniumWrapper.stopWiniumServer();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			testResult = "fail";
			reportUtils.addInfoOnValidations(methodName, false, "Success_Not_Applicable", e.getMessage());			
		}
	}

	public void calcSubtraction(WiniumDriver driver) throws InterruptedException, IOException
	{
		String methodName = "calcSubtraction";
		try{
			reportUtils.log("Winium calculator subtraction started...", methodName);
			driver.findElementByName("8").click();
			driver.findElementByName("Subtract").click();
			driver.findElementByName("3").click();
			driver.findElementByName("Equals").click();			
			Thread.sleep(1000);
			reportUtils.log("Winium calculator subtraction ended...", methodName);
			reportUtils.passTest("Winium calculator subtraction ended successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			testResult = "fail";
			reportUtils.addInfoOnValidations(methodName, false, "Success_Not_Applicable", e.getMessage());			
		}		
	}

	public void calcAddition(WiniumDriver driver) throws InterruptedException, IOException
	{
		String methodName = "calcAddition";
		try{
			reportUtils.log("Winium calculator addition started...", methodName);
			driver.findElementByName("3").click();
			driver.findElementByName("Add").click();
			driver.findElementByName("8").click();
			driver.findElementByName("Equals").click();
			Thread.sleep(1000);
			reportUtils.log("Winium calculator addition ended...", methodName);
			reportUtils.passTest("Winium calculator addition ended successfully");			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			testResult = "fail";
			reportUtils.addInfoOnValidations(methodName, false, "Success_Not_Applicable", e.getMessage());			
		}		
	}
}