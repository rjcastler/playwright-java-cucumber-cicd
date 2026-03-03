package step_definitions;

import browser.BrowserManager;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePageObjects;

import java.awt.*;

public class HomePage_Steps {
    public BrowserManager browserManager;
    private HomePageObjects homepage;

    public HomePage_Steps(BrowserManager browserManager){
        this.browserManager = browserManager;
        this.homepage = new HomePageObjects(browserManager);
    }

    @Given("I navigate to internet herokuapp app")
    public void i_navigate_to_internet_herokuapp_app() {
        homepage.navigateToHome();

    }
    @When("I click on Form Authentication link")
    public void i_click_on_form_authentication_link() {
        homepage.clickOnFormAuthenticationLink();
    }

}
