package base.objects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.base.com.*;


public class Page2 extends Driver {	
	//Printing count and news title
	public void DisplayNews() throws InterruptedException,IOException
	{
		By Homenews = By.xpath("//div[@class='e_a_37591358 q_a_37591358']");
		Reuse.Explicitwait(Homenews, driver);
		Reuse.Implicitwait();
		Reuse.ScreenShot();
		System.out.println("====================================================================================================================================");
		System.out.println("                         Total News Count And News Headings                        ");
		System.out.println("=====================================================================================================================================");
			List<WebElement> count=driver.findElements(By.xpath("//*[@role='listitem']/div/div/div/div/div/a"));
			System.out.println(	"Total number of news: " +count.size());
			
	//Validating news with tool tip
			SoftAssert sa= new SoftAssert();
			for(int i=0;i<count.size();i++) {
			String str=	count.get(i).getText();//getting tool tip using title attribute using same x-path
			System.out.println(i+1 +"  "+ str);
			//
				//for(WebElement s:count) {
				String b=count.get(i).getAttribute("title");
				System.out.println();	
				sa.assertEquals(str,b,"not-matched");
			}
			sa.assertAll();
			
			List<String> newsLists=new ArrayList<String>();
			int j=0;
			for(WebElement element:count)
			{
				if(j<5)
				{
					String text=element.getText();
					newsLists.add(text);
				}
			}
			
			// To store newsTitles in excel file
			Reuse.store("Sheet1", newsLists);
	}
	
}
	