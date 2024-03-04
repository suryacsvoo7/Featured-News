package com.cognizant.test;

import org.testng.annotations.Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.base.com.*;
import base.objects.*;

public class TestCases extends Driver {
	
	
	Page1 hp=new Page1();
	Page2 hn=new Page2();
	Page3 dc=new Page3();
	
	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	ExtentTest test;
	
	
	@BeforeTest
	public void Driversetup() throws InterruptedException
	{
		reports=new ExtentReports();
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"//test-output//ExtentReport.html");
		reports.attachReporter(htmlReporter);
		reports.setSystemInfo("Featured News", "Main Project");
		reports.setSystemInfo("Pushkar Kumar", "Author1");
		reports.setSystemInfo("Alla Teja Sri", "Author2");
		reports.setSystemInfo("Afsha Sultana", "Author3");
		reports.setSystemInfo("Surya Vamsi", "Author4");
		try
		{
			Driver.setup();
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println("Failed Browser");
		}
	}
	
	@Test
	public void Test1() throws InterruptedException
	{
		
		
		try
		{
			hp.authenticate();
			test=reports.createTest("Authenticating the website");
	        test.pass("Authentication Successful");
	        test.pass("Username and email Displayed");
			
		}
		catch(Exception e)
		{
			System.out.println("Test 1 failure");
			test=reports.createTest("Authentication failed");
			test.fail("Test Case 1 Failed");
		}
		
	}
	
	@Test
	public void Test2() throws InterruptedException
	{    	
		
		try
		{
			hn.DisplayNews();
			test=reports.createTest("Featured News");
			test.pass("Featured News Displayed");
			
		}
		catch(Exception e)
		{
			System.out.println("Test 2 failure");
			test=reports.createTest("Displaying the News");
			test.fail("Test Case 2 failed");
		
		}
		
	}
	@Test
	public void Test3() throws InterruptedException
	{
		
		try
		{
			dc.VerifyNews();
			test=reports.createTest("Verfiying and Capturing each News");
	        test.pass("News Verfied");
	        test.pass("Screenshot Captured");
			
			
		}
		catch(Exception e)
		{
			System.out.println("Test 3 failure");
			test=reports.createTest("Verfiying and Capturing each News");
			test.fail("Test Case 3 failed");
				
		}
	}
	
	@AfterTest

	public void Test4() 
	{
		System.out.println("Extent Report published");
		reports.flush();
		driver.quit();
		System.out.println();
	}
	
}
	
	
	
	
	
	
	