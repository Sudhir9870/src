package com.ford.auto.business_reusablecomponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class PageObjects_firstSubmission  {
	
	static WebElement element = null;
	static Select select = null;
	static List<WebElement> listElements = null;
	static List<Select> listSelects = null;

//	Elements in FirstSubmission Screen
	public static WebElement dlrCd_fs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("dlrCd_xpath"));
		return element;	
	}

// Page Objects for 'Claim Entry Information' section	
	public static WebElement vinNo_fs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("vinNo_xpath"));
		return element;	
	}
	public static WebElement repaiOrdrNO_fs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("repaiOrdrNO_xpath"));
		return element;	
	}
	public static WebElement roOpenDt_fs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("roOpenDt_xpath"));
		return element;	
	}
	public static WebElement dtOfRepair_fs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("dtOfRepair_xpath"));
		return element;	
	}
	public static WebElement odoEntry_fs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("odoEntry_xpath"));
		return element;	
	}
	public static WebElement lastOdo_fs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("lastOdo_xpath"));
		return element;	
	}
	
//	Page Objects for 'Repair Information' section
	public static WebElement repaiNO_fs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("repaiNO_xpath"));
		return element;	
	}
	public static Select claimTypes_fs(WebDriver driver)
	{
		select = new Select (driver.findElement(By.xpath("claimTypes_xpath")));
		
		return select;
	}
	public static WebElement casualprt_RprInfo_fs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("casualprtRprInfo_xpath"));
		return element;	
	}
	public static WebElement conditionCd_RprInfo_fs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("conditionCdRprInfo_xpath"));
		return element;	
	}
	public static WebElement custConcernCd_RprInfo_fs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("custConcernCdRprInfo_xpath"));
		return element;	
	}
	public static WebElement installDt(WebDriver driver)
	{
		element = driver.findElement(By.xpath("installDt_xpath"));
		return element;	
	}
	public static WebElement invoiceNo(WebDriver driver)
	{
		element = driver.findElement(By.xpath("invoiceNo_xpath"));
		return element;	
	}
	public static WebElement elapsedOdo(WebDriver driver)
	{
		element = driver.findElement(By.xpath("elapsedOdo_xpath"));
		return element;	
	}
	
//	Page Objects for 'Labour Information' section
	public static List<WebElement> hrs_operations_LbrInfo_fs(WebDriver driver)
	{
		listElements = driver.findElements(By.cssSelector("hrsoperationsLbrInfo_cssSelector"));
		return listElements;	
	}
	public static List<WebElement> operations_LbrInfo_fs(WebDriver driver)
	{
		listElements = driver.findElements(By.cssSelector("operationsLbrInfo_cssSelector"));
		return listElements;	
	}
	
//	Page Objects for 'Part Information' section
	public static List<WebElement> qty_partNos_partsInfo_fs(WebDriver driver)
	{
		listElements = driver.findElements(By.cssSelector("qtypartNospartsInfo_cssSelector"));
		return listElements;	
	}
	public static List<WebElement> partNos_partsInfo_fs(WebDriver driver)
	{
		listElements = driver.findElements(By.cssSelector("partNospartsInfo_cssSelector"));
		return listElements;	
	}
	
//	Page Objects for 'Misc' section
	public static Select sublet1_fs(WebDriver driver)
	{
		select = new Select (driver.findElement(By.xpath("sublet1_xpath")));
		return select;	
	}
	public static Select sublet2_fs(WebDriver driver)
	{
		select = new Select (driver.findElement(By.xpath("sublet2_xpath")));
		return select;	
	}
	public static Select sublet3_fs(WebDriver driver)
	{
		select = new Select (driver.findElement(By.xpath("sublet3_xpath")));
		return select;	
	}
	public static List<WebElement>  amtFrSublets_fs(WebDriver driver)
	{
		listElements = driver.findElements(By.cssSelector("amtFrSublets_cssSelector"));
		return listElements;	
	}	
	
//	Page Objects for 'Comments' section
	public static WebElement custComments_fs(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("custComments_cssSelector"));
		return element;	
	}
	public static WebElement TechIDComments_fs(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("TechIDComments_cssSelector"));
		return element;	
	}
	public static WebElement custID_fs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("custID_xpath"));
		return element;	
	}
	public static WebElement TechID_fs(WebDriver driver)
	{
		element = driver.findElement(By.xpath("TechID_xpath"));
		return element;	
	}
	
//	Page Objects for buttons in first Submission page

	public static WebElement btn_nxtRepair_fs(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("btnnxtRepair_cssSelector"));
		return element;	
	}
	public static WebElement btn_vwSubTotals_fs(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("btnvwSubTotals_cssSelector"));
		return element;	
	}
	public static WebElement btn_Submit_fs(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("btnSubmit_cssSelector"));
		return element;	
	}
	public static WebElement btn_Save_fs(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("btnSave_cssSelector"));
		return element;	
	}
	public static WebElement btn_Preval_fs(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("btnPreval_cssSelector"));
		return element;	
	}

//	Page Objects post claim submission
	public static WebElement txt_clmSubConf(WebDriver driver)
	{
		element = driver.findElement(By.xpath("txtclmSubConf_xpath"));
		return element;	
	}
	public static WebElement lnk_chkClmStatus(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("lnkchkClmStatus_cssSelector"));
		return element;	
	}
	
}
