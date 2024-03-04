package com.base.com;

import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {
	public static WebDriver driver;
	public static void setup()
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Choose your Browser");
		System.out.println("1. Chrome Browser");
		System.out.println("2. Edge Browser");
		System.out.print("Enter your choice _: ");
		String c=sc.nextLine();
		sc.close();
		if(c.equalsIgnoreCase("1"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		driver.get("https://be.cognizant.com");
		//driver.get("https://cognizantonline.sharepoint.com/sites/Be.Cognizant/SitePages/Home.aspx");
		driver.manage().window().maximize();
	}
	public static void Scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,150)", "");
	}
	
	public static void CloseBrowser() 
	{
		driver.quit();
		//driver.close();
	}
	

}
