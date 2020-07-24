package com.ford.auto.pageobjects;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class ObjectRepositoryExample1 {
	
	private String appURL;
	private WebDriver driver;
	private FileInputStream fis;
	private File propertyFile;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Utilities\\IEDriverServer.exe");
		appURL="https://wwwqa.servis2.ford.com/servis2Web/index.html";	
		driver = new InternetExplorerDriver();
//		driver = new ChromeDriver();
		driver.manage().window().maximize();				
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}

	@Test
	public void test() throws IOException, InterruptedException  {
		
		System.out.println(System.getProperty("user.dir"));
		propertyFile=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\SERVIS2_objectrepository\\CountrySelection.properties");
		fis=new FileInputStream(propertyFile);
		Properties pro=new Properties();
		pro.load(fis);
		
		driver.get(appURL);
		driver.findElement(By.xpath("//*[contains(text(),'Active Directory')]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(pro.getProperty("Thailand_xpath"))).click();
		Thread.sleep(8000);
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(driver.findElement(By.xpath(pro.getProperty("Transaction_xpath")))).build().perform();
		action1.moveToElement(driver.findElement(By.xpath(pro.getProperty("ClaimEntry_xpath")))).build().perform();
		Thread.sleep(8000);
		action1.moveToElement(driver.findElement(By.xpath(pro.getProperty("FirstSubmission_xpath")))).build().perform();
//		action1.moveToElement(driver.findElement(By.xpath(pro.getProperty("MonthlyClaimCycle_xpath")))).build().perform();
		Thread.sleep(2000);
//		action1.moveToElement(driver.findElement(By.xpath(pro.getProperty("AdjudicatorList_xpath")))).build().perform();
		driver.findElement(By.xpath(pro.getProperty("FirstSubmission_xpath"))).click();
		
		Thread.sleep(2000);
			
		}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
