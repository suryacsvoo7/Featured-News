package com.base.com;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Reuse extends Driver{
	
	public static void ScreenShot() throws IOException
	{
	    Date d =new Date();
	    File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File destFile = new File(System.getProperty("user.dir")+"/Screenshots/"+d.toString().replace(":", "_")+".png");
	    Files.copy(srcFile, destFile);
	}
	
	public static void Explicitwait(By object,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(object));
	}
	
	public static void Implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public static void store(String sheetName,List<String> l1) throws IOException
	{
		Excel e1=new Excel();
		e1.putData(sheetName, l1);
	}

	public static void writeToFile(String filename, String paragraphs) {
		// TODO Auto-generated method stub
		
	}
}
