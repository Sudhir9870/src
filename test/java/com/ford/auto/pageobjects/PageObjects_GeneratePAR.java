package com.ford.auto.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageObjects_GeneratePAR  {
	
	static WebElement element = null;
	static Select select = null;
	static List<WebElement> listElements = null;
	static List<Select> listSelects = null;
	
//	Page Objects for 'Estimated Cost of Repair' section
	public static WebElement dealerlabourper (WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("dealerlabourper_xpath"));
			return element;	
		}
	public static WebElement dealermaterialper(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("dealermaterialper_xpath"));
			return element;	
		}
	public static WebElement dealermiscper(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("dealermiscper_xpath"));
			return element;	
		}
	public static WebElement dealerphaper(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("dealerphaper_xpath"));
			return element;	
		}
	public static WebElement dealerlabour(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("dealerlabour_xpath"));
			return element;	
		}
	public static WebElement dealermaterial(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("dealermaterial_xpath"));
			return element;	
		}
	public static WebElement dealermisc(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("dealermisc_xpath"));
			return element;	
		}
	public static WebElement dealerpha(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("dealerpha_xpath"));
			return element;	
		}
	public static WebElement custlabourper(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("custlabourper_xpath"));
			return element;	
		}
	public static WebElement custmaterialper(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("custmaterialper_xpath"));
			return element;	
		}
	public static WebElement custmiscper(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("custmiscper_xpath"));
			return element;	
		}
	public static WebElement custphaper(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("custphaper_xpath"));
			return element;	
		}
	public static WebElement custlabour(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("custlabour_xpath"));
			return element;	
		}
	public static WebElement custmaterial(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("custmaterial_xpath"));
			return element;	
		}
	public static WebElement custmisc(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("custmisc_xpath"));
			return element;	
		}
	public static WebElement custpha(WebDriver driver)
		{
			
			element = driver.findElement(By.xpath("custpha_xpath"));
			return element;	
		}
	public static List<WebElement>  totals_EstimateCost_PAR(WebDriver driver)
		{
			listElements = driver.findElements(By.xpath("totals_EstimateCost_xpath"));
			return listElements;	
		}	
	public static List<WebElement>  fordPerc_EstimateCost_PAR(WebDriver driver)
		{
			listElements = driver.findElements(By.xpath("fordPerc_EstimateCost_PAR_xpath"));
			return listElements;	
		}
		
}