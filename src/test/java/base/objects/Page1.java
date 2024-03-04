package base.objects;

import com.base.com.*;

import java.io.IOException;

import org.openqa.selenium.By;

public class Page1 extends Driver
{
	
	By userbtn=By.xpath("//div[@id='O365_MainLink_MePhoto']");
	By email=By.xpath("//input[@id='i0116']");
	By signinbtn=By.xpath("//input[@id='idSIButton9']");
	By password=By.xpath("//input[@id='i0118']");
	By signin2=By.xpath("//input[@value='Sign in']");
	By username=By.xpath("//div[@id='mectrl_currentAccount_primary']");
	By useremail=By.xpath("//div[@id='mectrl_currentAccount_secondary']");
	
	
	public void authenticate() throws InterruptedException, IOException
	{	
		Reuse.Explicitwait(userbtn, driver);
		Reuse.Implicitwait();
		driver.findElement(userbtn).click();
		//Thread.sleep(3000);
		Reuse.ScreenShot();
		//Thread.sleep(3000);
		
		//Printing user name and email
		System.out.println("====================================================================================================================================");
		System.out.println("                         User Name and E-mail                        ");
		System.out.println("=====================================================================================================================================");
		System.out.println();
		System.out.println("User name : "+driver.findElement(username).getText());
		System.out.println("Email : " +driver.findElement(useremail).getText());
		System.out.println();
		
	}
	
	
	
	
}