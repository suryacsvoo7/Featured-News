package stepdefinations;

import java.io.IOException;
import com.base.com.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import base.objects.Page1;
import base.objects.Page2;
import base.objects.Page3;

public class steps {
    private Driver driver;

    @SuppressWarnings("static-access")
	@Given("User Logs In")
    public void userLogsIn() {
        // Implementation for logging in the user
        driver.setup();
    }

    @Then("Authenticate the user")
    public void authenticateTheUser() {
        // Implementation for user authentication
        Page1 page1 = new Page1();
        try {
            page1.authenticate();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    @Then("Display the news title")
    public void displayTheNewsTitle() throws InterruptedException {
        // Implementation for displaying news titles
        Page2 page2 = new Page2();
        try {
            page2.DisplayNews();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    @Then("Verify the news")
    public void verifyTheNews() {
        // Implementation for verifying news
        Page3 page3 = new Page3();
        try {
            page3.VerifyNews();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        Driver.CloseBrowser();
    }
}


