//****************************************************************

//* Copyright (c) 2016 Ford Motor Company. All Rights Reserved.

//****************************************************************
package com.ford.auto.insideford;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ford.auto.business_reusablecomponents.ReusableComponents;
import com.ford.auto.reusablecomponents.Browser;
import com.ford.auto.utilities.BaseTest; 

public class OurCompany extends BaseTest {
	static String strBrowserChoice;
	
	

	/*@BeforeClass 
	public void setUpClass() throws Exception {
		System.out.println("OurCompany Before class");
		setupClass(this.getClass().getPackage(), this.getClass().toString());
	}*/

	


	
	
	@Test
	public void validateOurCompanyPageIsDisplayed() throws Exception {

		//String methodName = "validateOurCompanyPageIsDisplayed";

		try{
			/*WebDriver driver = Browser.getInstance().getDriver();
			System.out.println(methodName + " - driver instance => "+driver+"");

			if(isGridMode){
				methodLevelChildTest = gridParentTest.get().createNode(methodName);
				System.out.println("*****!!!!!****** " + methodName);			
				gridChildTest.set(methodLevelChildTest);
			}		
*/
			setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);

			reportUtils.addInfo("1_OLD_LOG_AS_ADDINFO - Executing Started for Test: " + methodName, methodName);
			reportUtils.log("1_NEW_LOG_AS_LOG - Executing Started for Test: " + methodName, methodName);

			reportUtils.addStepDetails("2_OLD_PASS_AS_ADDSTEPDETAILS");
			reportUtils.passTest("2_NEW_PASS_AS_PASSTEST");		

			reportUtils.addInfoOnValidations(methodName, true, "5_OLD_ADDINFOONVALIDATIONS_PASS", "5_OLD_ADDINFOONVALIDATIONS_FAIL");
			reportUtils.reportLogStatus(methodName, true, "5_NEW_REPORTLOGSTATUS_PASS", "5_NEW_REPORTLOGSTATUS_FAIL");
			Assert.assertTrue(true);

			ReusableComponents.getMachineDetails();
			String actualTest = textBox.getText("insideford.insidefordtitle_xpath");
			@SuppressWarnings("deprecation")
			boolean result = textBox.verrifyText("insideford.insidefordtitle_xpath", "INSIDE FORD");

			testVerificationObj.verifyEquals("INSIDE FORD", actualTest);		
			testVerificationObj.verifyTrue("VerifyTrue", actualTest.equalsIgnoreCase("INSIDE FORD"));
			testVerificationObj.verifyFalse("VerifyFalse", actualTest.equalsIgnoreCase("FALSE EXPECTED INSIDE FORD"));
			testVerificationObj.clearVerificationErrors();

			Assert.assertEquals(driver.getTitle(), "@FordOnline");
			Assert.assertTrue(true, "validateOurCompanyPageIsDisplayed");
			reportUtils.log("4_Extent V3_LOG_Check_FINAL - Executing Ends for Test: " + methodName, methodName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			testResult = "fail";
			reportUtils.addInfoOnValidations(methodName, false, "Success_Msg", e.getMessage());
		}		
	}

	@Test
	public void ClickFordOnlineLink() throws Exception
	{
		//String methodName = "ClickFordOnlineLink";

		try{

			/*System.out.println("I am inside test : "+methodName+"");
			WebDriver driver = Browser.getInstance().getDriver();
			System.out.println(methodName + " - driver instance => "+driver+"");

			if(isGridMode){
				methodLevelChildTest = gridParentTest.get().createNode(methodName);
				System.out.println("*****!!!!!****** " + methodName);			
				gridChildTest.set(methodLevelChildTest);
			}		*/

			setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);

			reportUtils.addInfo("Executing Started for Test: " + methodName, methodName);
			reportUtils.addInfo("Executing Started Step 1: " , methodName );


			try
			{
				Thread.sleep(4000);
				Assert.assertTrue(true, "Success - ClickFordOnlineLink");
				Assert.assertEquals(driver.getTitle(), "@FordOnline", "@FordOnline");			
				reportUtils.addInfo("Executing Started for Test: " + methodName, methodName);
				Thread.sleep(1000);	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			testResult = "fail";
			reportUtils.addInfoOnValidations(methodName, false, "Success_Msg", e.getMessage());
		}		
	}
	//  Jenkins
	@Test
	public void ClickCuriousMindsdLink() throws IOException
	{
		//String methodName = "ClickCuriousMindsdLink";
		try{
			/*	WebDriver driver = Browser.getInstance().getDriver();
			System.out.println(methodName + " - driver instance => "+driver+"");

			if(isGridMode){
				methodLevelChildTest = gridParentTest.get().createNode(methodName);
				System.out.println("*****!!!!!****** " + methodName);			
				gridChildTest.set(methodLevelChildTest);
			}	*/		

			setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);

			Assert.assertEquals(driver.getTitle(), "@FordOnline", "@FordOnline");
			//Assert.assertTrue(true, "ClickCuriousMindsdLink");

			reportUtils.addInfo("Executing Started for Test: " + methodName, methodName);
			reportUtils.addInfo("Executing Started for Test: " , methodName );

			Thread.sleep(1000);
			mouseHandler.clickUsingJavaScript("insideford.clture_xpath");
			Thread.sleep(5000);
			
			//common.clickUsingJavaScript("insideford.curiousMinds_xpath");
			//driver.findElement(By.xpath("(//a[contains(text(),'Curious Minds')])[1]")).click();			
			//link.click("insideford.FAQLink_Xpath", d);
			//reportUtils.addStepDetails("Click on Curious Minds link");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			//Assert.fail(e.toString());
			e.printStackTrace();
			testResult = "fail";
			reportUtils.addInfoOnValidations(methodName, false, "Success_Msg", e.getMessage());
		}			
	}





	
	

	@Test
	public void ClickSearchLink() throws Exception
	{
		//String methodName = "ClickSearchLink";
		try{
			/*WebDriver driver = Browser.getInstance().getDriver();
			System.out.println("I am inside test : "+methodName+"");
			System.out.println(methodName + " - driver instance => "+driver+"");

			if(isGridMode){
				methodLevelChildTest = gridParentTest.get().createNode(methodName);
				System.out.println("*****!!!!!****** " + methodName);			
				gridChildTest.set(methodLevelChildTest);
			}
*/
			setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
			reportUtils.addInfo("Executing Started for Test: " + methodName, methodName);
			waitObj.waitUntilElementIsVisible("searchButton_id");
			waitObj.waitUntilElementIsClickable("searchButton_id");
			common.clickUsingJavaScript("searchButton_id");
			Assert.assertEquals(driver.getTitle(), "@FordOnline", "@FordOnline");
			Assert.assertTrue(true, "ClickSearchLink");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			testResult = "fail";
			reportUtils.addInfoOnValidations(methodName, false, "Success_Msg", e.getMessage());
		}	
	}	

	@Test
	public void ClickKeyLinksLink() throws Exception
	{
//		String methodName = "ClickKeyLinksLink";

		try{
			/*WebDriver driver = Browser.getInstance().getDriver();
			System.out.println("driver instance for test "+methodName+" is :"+driver+"");

			if(isGridMode){
				methodLevelChildTest = gridParentTest.get().createNode(methodName);
				System.out.println("*****!!!!!****** " + methodName);			
				gridChildTest.set(methodLevelChildTest);
			}*/

			setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);

			reportUtils.addInfo("Executing Started for Test: " + methodName, methodName);
			reportUtils.addInfo("Executing Started for Test: " , methodName );
			common.waitUntilElementIsVisible("insideford.clickKeysLink_xpath");
			
			common.clickUsingJavaScript("insideford.clickKeysLink_xpath");
			//driver.findElement(By.xpath("(//a[contains(text(),'KEY LINKS')])[1]")).click();	
			reportUtils.addInfo("Executing Started for Test: " + methodName, methodName);
			Thread.sleep(3000);

			Assert.assertEquals(driver.getTitle(), "@FordOnline", "@FordOnline");
			Assert.assertTrue(true, "ClickKeyLinksLink");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			testResult = "fail";
			reportUtils.addInfoOnValidations(methodName, false, "Success_Msg", e.getMessage());
		}	
	}
	//Mouse handle testcase
	@SuppressWarnings("deprecation")
	@Test
	public void VerifyMouseHandlers() throws Exception
	{
		//String methodName = "VerifyMouseHandlers";

		try{
			/*System.out.println("I am inside test : "+methodName+"");
			WebDriver driver = Browser.getInstance().getDriver();
			System.out.println("driver instance for test "+methodName+" is :"+driver+"");

			if(isGridMode){
				methodLevelChildTest = gridParentTest.get().createNode(methodName);
				System.out.println("*****!!!!!****** " + methodName);			
				gridChildTest.set(methodLevelChildTest);
			}*/

			setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);	

			reportUtils.addInfo("Executing Started for Test: " + methodName, methodName);
			reportUtils.addInfo("Executing Started for Test: " , methodName );

			driver.navigate().to("https://letskodeit.teachable.com/p/practice");
			Thread.sleep(10000);
			common.clickUsingJavaScript("insideford.BMWRadio_xpath");
			common.clickUsingJavaScript("isnideford.BMWCheckBox_xpath");
			mouseHandler.clickUsingActionsMethod("isnideford.BMWCheckBox_xpath");
			
			driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

			System.out.println("*** OurCompany - SwitchToFrame - Driver Instance: " + driver);
			common.SwtichToFrame("iframeResult");
			
			WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
			
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", tryIt);
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
			common.SwtichToFrame("iframeResult");
			WebElement TryIt4 = driver.findElement(By.xpath("//button[text()='Try it']"));
			JavascriptExecutor executo1r4 = (JavascriptExecutor)driver;
			executo1r4.executeScript("arguments[0].click();", TryIt4);
			Thread.sleep(2000);
			alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();

			driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
			common.SwtichToFrame("iframeResult");
			WebElement TryIt5 = driver.findElement(By.xpath("//button[text()='Try it']"));
			JavascriptExecutor executo1r5 = (JavascriptExecutor)driver;
			executo1r5.executeScript("arguments[0].click();", TryIt5);
			Thread.sleep(3000);
			popupHandler.SetPopoupText("Hello");
			Thread.sleep(2000);
			alert = driver.switchTo().alert();
			alert.dismiss();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();

			driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert2");
			common.SwtichToFrame("iframeResult");
			WebElement TryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
			JavascriptExecutor executo1r3 = (JavascriptExecutor)driver;
			executo1r3.executeScript("arguments[0].click();", TryIt);
			Thread.sleep(3000);
			String  text =  popupHandler.alertGettext();
			System.out.println(text);
			Thread.sleep(2000);
			alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(1000);	

			Assert.assertEquals(driver.getTitle(), "Tryit Editor v3.6", "@FordOnline");
			Assert.assertTrue(true, "VerifyMouseHandlers");			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			testResult = "fail";
			reportUtils.addInfoOnValidations(methodName, false, "Success_Msg", e.getMessage());
		}	
	}

	@SuppressWarnings("deprecation")
	@Test
	public void ValidationOutCompanyCDSID() throws Exception 
	{
		//String methodName ="ValidationOutCompanyCDSID";
		System.out.println("I am inside test 1 : ValidationOutCompanyCDSID");
		Browser browser = new Browser();
		WebDriver d = browser.getDriver();
		System.out.println("driver instance for test 1 is :"+d+"");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), methodName);
		try
		{
			reportUtils.addInfo("Executing Started for Test" + methodName, methodName);
			reportUtils.addInfo("Executing Started Step 1" , methodName );
			common.clickUsingJavaScript("insideford.cdsLink_xpath");
			Thread.sleep(2000);
			reportUtils.addStepDetails("Click on CDS link");

			String CurrentwindowHandle = d.getWindowHandle();	
			Set<String> allWindows = Browser.getInstance().getDriver().getWindowHandles();

			for(String CW : allWindows)
			{
				if(! (CW.equals(CurrentwindowHandle)))
				{
					d.switchTo().window(CW);
					if(d.findElements(By.xpath("//a[contains(text(),'ADFS')]")).size()>0)
					{
						common.clickUsingJavaScript("insideford.ADFS_xpath");	
					}
				}
			}
			reportUtils.addStepDetails("Click on ADFS link");
			System.out.println(dataTable.get("DataItem1"));
			textBox.setText("insideford.SearchBox_xpath", dataTable.get("DataItem1"));
			Thread.sleep(2000);
			reportUtils.addStepDetails("Entering the mvesangi value in search box");
			button.click("insideford.Search_xpath");
			reportUtils.addStepDetails("clicking the search box");
			common.clickUsingJavaScript("insideford.mvesangi_xpath");
			Thread.sleep(2000);
			String[] elements = {"Full Name","Display Name","User ID","Global ID","E-mail Address"};
			String[] values = {dataTable.get("DataItem2"),dataTable.get("DataItem3"),dataTable.get("DataItem4"),dataTable.get("DataItem5"),dataTable.get("DataItem6")};
			int p = 0;
			for(String s : elements)
			{
				common.veriftTextOnApplication("//th[text()='"+s+"']/following-sibling::td",values[p]);

				reportUtils.addStepDetails("Validating the value "+values[p]+" for the heading "+s+"");
				reportUtils.takeScreenShot(methodName, s+"_"+values[p]);
				p++;
			}
			System.out.println("done");
			d.close();
			d.quit();
		}
		catch(Exception e)
		{
			Assert.fail(e.toString());
			d.close();
			d.quit();
		}		
	}

	@SuppressWarnings("deprecation")
	@Test
	public void ValidationOurCompanyTest() throws Exception 
	{
		String method="ValidationOurCompanyTest";
		System.out.println("I am inside test 1 : validateOurCompanyPageIsDisplayed");
		Browser browser = new Browser();

		WebDriver d = browser.getDriver();
		System.out.println("driver instance for test 1 is :"+d+"");
		setupTest(this.getClass().getPackage(), this.getClass().toString(), "ValidationOurCompanyTest");


		try
		{
			reportUtils.addInfo("Executing Started for Test" + "ValidationOurCompanyTest", "ValidationOurCompanyTest");
			reportUtils.addInfo("Executing Started Step 1" , "ValidationOurCompanyTest" );
			common.clickUsingJavaScript("insideford.cdsLink_xpath");
			Thread.sleep(2000);
			reportUtils.addStepDetails("Click on CDS link");


			String CurrentwindowHandle = d.getWindowHandle();	
			Set<String> allWindows = Browser.getInstance().getDriver().getWindowHandles();

			for(String CW : allWindows)
			{
				if(! (CW.equals(CurrentwindowHandle)))
				{
					d.switchTo().window(CW);
					if(d.findElements(By.xpath("//a[contains(text(),'ADFS')]")).size()>0)
					{
						common.clickUsingJavaScript("insideford.ADFS_xpath");	
					}
				}
			}
			reportUtils.addStepDetails("Click on ADFS link");
			//reportUtils.takeScreenShot(method,"Entering_test");
			textBox.setText("insideford.SearchBox_xpath", dataTable.get("DataItem1"));

			Thread.sleep(2000);
			reportUtils.addStepDetails("Entering the mvesangi value in search box");
			reportUtils.takeScreenShot(method,"Clicking_Search");
			button.click("insideford.Search_xpath");

			reportUtils.addStepDetails("clicking the search box");
			common.clickUsingJavaScript("insideford.Test_xpath");
			Thread.sleep(2000);
			String[] elements = {"Full Name","Display Name","User ID","Global ID","City"};
			String[] values = {dataTable.get("DataItem2"),dataTable.get("DataItem3"),dataTable.get("DataItem4"),dataTable.get("DataItem5"),dataTable.get("DataItem6")};
			int p = 0;
			for(String s : elements)
			{
				reportUtils.takeScreenShot(method, s+"_"+values[p]);
				common.veriftTextOnApplication("//th[text()='"+s+"']/following-sibling::td",values[p]);
				reportUtils.addStepDetails("Validating the value "+values[p]+" for the heading "+s+"");
				p++;
			}
			System.out.println("done");
			d.close();
			d.quit();
		}
		catch(Exception e)
		{ 
			d.close();
			d.quit();
		}		
	}

	
}


