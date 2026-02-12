package step_definitions;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.awt.*;

public class HomePage_Steps {

    private final Page page;
    private final BrowserContext browserContext;

    public HomePage_Steps(){

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(width,height));
        page = browserContext.newPage();

    }

    @Given("I navigate to internet herokuapp app")
    public void i_navigate_to_internet_herokuapp_app() {
        System.out.println("Home Page");
        page.navigate("https://the-internet.herokuapp.com/");

    }
    @When("I click on Form Authentication link")
    public void i_click_on_form_authentication_link() {
        //page.pause();
        //getByRole('link', { name: 'Form Authentication' })
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Form Authentication")).click();
        //page.pause();
    }

}
