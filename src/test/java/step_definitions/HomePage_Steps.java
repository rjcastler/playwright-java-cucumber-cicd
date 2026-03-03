package step_definitions;

import browser.BrowserManager;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.awt.*;

public class HomePage_Steps {
    public BrowserManager browserManager;
    public HomePage_Steps(BrowserManager browserManager){
        this.browserManager = browserManager;
    }

    @Given("I navigate to internet herokuapp app")
    public void i_navigate_to_internet_herokuapp_app() {
        System.out.println("Home Page");
        browserManager.page.navigate("https://the-internet.herokuapp.com/");

    }
    @When("I click on Form Authentication link")
    public void i_click_on_form_authentication_link() {
        browserManager.page.getByRole(AriaRole.LINK,new Page.GetByRoleOptions().setName("Form Authentication")).click();
    }

}
