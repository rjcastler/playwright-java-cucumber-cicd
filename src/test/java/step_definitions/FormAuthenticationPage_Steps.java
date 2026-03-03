package step_definitions;

import browser.BrowserManager;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


public class FormAuthenticationPage_Steps {

    public BrowserManager browserManager;

    public FormAuthenticationPage_Steps(BrowserManager browserManager){
        this.browserManager = browserManager;
    }

    @And("I type username")
    public void i_type_username() {
        System.out.println(" Username Field");
        browserManager.page.getByLabel("Username").fill("tomsmith");
    }
    @Then("I type password")
    public void i_type_password() {
        System.out.println("Password Field");
        browserManager.page.getByLabel("Password").fill("SuperSecretPassword!");
    }
    @Then("I click on Login")
    public void i_click_on_login() {
        System.out.println("Login button");
        browserManager.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
    }
    @Then("I should be presented with the Successfull login message")
    public void i_should_be_presented_with_the_successfull_login_message() {
        System.out.println("Successfull Message");
        String actualSuccessMsg = browserManager.page.locator("//h4[@class='subheader']").textContent();
        assertEquals("Welcome to the Secure Area. When you are done click logout below.",actualSuccessMsg);
    }

    @And("I Log out")
    public void i_log_out(){
        System.out.println("Log out");
        browserManager.page.locator("//i[contains(text(),'Logout')]").click();
    }


}
