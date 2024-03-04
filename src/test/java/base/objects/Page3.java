package base.objects;

import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import com.base.com.*; 

public class Page3 extends Driver {

	//News1_Xpath
    By News1=By.xpath("(//*[@class='ar_b_91bed31b ac_b_91bed31b'])[1]");
 
    //News2_Xpath
    By News2=By.xpath("(//*[@class='ar_b_91bed31b ac_b_91bed31b'])[2]");
 
    //News3_Xpath
    By News3=By.xpath("(//*[@class='ar_b_91bed31b ac_b_91bed31b'])[3]");
 
    //News4_Xpath
    By News4=By.xpath("(//*[@class='ar_b_91bed31b ac_b_91bed31b'])[4]");
 
    //News5_Xpath
    By News5=By.xpath("(//*[@class='ar_b_91bed31b ac_b_91bed31b'])[5]");

    public void VerifyNews() throws InterruptedException,IOException
    {
        //News1
        Reuse.Explicitwait(News1, driver);
        Reuse.Implicitwait();
        driver.findElement(News1).click();
        Thread.sleep(5000);

        scrollToViewAndCapture("News1", By.xpath("//*[@id='spPageCanvasContent']/div/div/div/div/div"));
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().refresh(); // reload method
        System.out.println();
        System.out.println("News 1 Verified and Captured");
        System.out.println("-----------------------------------------------------");
        System.out.println();
        Thread.sleep(5000);

        //News2
        Reuse.Explicitwait(News2, driver);
        Reuse.Implicitwait();
        driver.findElement(News2).click();
        Thread.sleep(5000);

        scrollToViewAndCapture("News2", By.xpath("//*[@id=\'fa45f946-463e-428f-a84b-0bbbde09c3ba\']/div/div"));
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().refresh(); // reload method
        System.out.println();
        System.out.println("News 2 Verified and Captured");
        System.out.println("-----------------------------------------------------");
        System.out.println();
        Thread.sleep(5000);

        //News3
        Reuse.Explicitwait(News3, driver);
        Reuse.Implicitwait();
        driver.findElement(News3).click();
        Thread.sleep(5000);

        scrollToViewAndCapture("News3", By.xpath("//*[@id=\'fa45f946-463e-428f-a84b-0bbbde09c3ba\']/div/div"));
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().refresh(); // reload method
        System.out.println();
        System.out.println("News 3 Verified and Captured");
        System.out.println("-----------------------------------------------------");
        System.out.println();
        //Thread.sleep(5000);

        //News4
        Reuse.Explicitwait(News4, driver);
        Reuse.Implicitwait();
       // Thread.sleep(5000);
        driver.findElement(News4).click();
       // Thread.sleep(5000);
        scrollToViewAndCapture("News4", By.xpath("//*[@id=\'fa45f946-463e-428f-a84b-0bbbde09c3ba\']/div/div/div"));

        //Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().refresh(); // reload method
        System.out.println();
        System.out.println("News 4 Verified and Captured");
        System.out.println("-----------------------------------------------------");
        System.out.println();
        //Thread.sleep(5000);

        //News5
        Reuse.Explicitwait(News5, driver);
        Reuse.Implicitwait();
        driver.findElement(News5).click();
        //Thread.sleep(5000);
        scrollToViewAndCapture("News5", By.xpath("//*[@id=\'395ed6e9-c338-4e71-b50f-cc25310db33a\']/div/div/div"));
        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println("News 5 Verified and Captured");
        System.out.println("-----------------------------------------------------");
        System.out.println();
        //Thread.sleep(5000);
    }

     private void scrollToViewAndCapture(String newsName, By locator) throws IOException {
            WebElement element = driver.findElement(locator);
            // Scroll to the element using JavaScriptExecutor
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            // Wait for a moment to let the content fully load after scrolling
            Reuse.Implicitwait();
            // Take the screenshot
            Reuse.ScreenShot();
            // Capture and store paragraphs
            captureAndStoreParagraphs(newsName, locator);
        }

 

     private void captureAndStoreParagraphs(String newsName, By locator) throws IOException {
    	    WebElement paragraphDiv = driver.findElement(locator);
    	    String paragraphs = paragraphDiv.getText();
    	    System.out.println(paragraphs);
    	    String filename = "NewsText/" + newsName + ".txt";

    	    // To store newsContent in different text files for all 5 news on homePage
    	    Reuse.writeToFile(filename, paragraphs);

    	    // Alternatively, you can directly write the paragraphs to the file using FileWriter
    	    
    	    try (FileWriter writer = new FileWriter(filename)) {
    	        writer.write(paragraphs);
    	        System.out.println("File created successfully.");
    	    } catch (IOException e) {
    	        System.out.println("An error occurred while creating the file: " + e.getMessage());
    	    }
    	    
    	}


}