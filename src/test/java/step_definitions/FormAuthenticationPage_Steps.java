package step_definitions;

import browser.BrowserManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.FormLoginPageObject;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


public class FormAuthenticationPage_Steps {

    public BrowserManager browserManager;
    public FormLoginPageObject loginPage;

    public FormAuthenticationPage_Steps(BrowserManager browserManager){
        this.browserManager = browserManager;
        this.loginPage = new FormLoginPageObject(browserManager);
    }

    @And("I type username {string}")
    public void i_type_username(String uname) {
        loginPage.enterUname(uname);
    }
    @Then("I type password {string}")
    public void i_type_password(String pwd) {
        loginPage.enterPassword(pwd);
    }
    @Then("I click on Login")
    public void i_click_on_login() {
        loginPage.clickOnLogin();
    }
    @Then("I should be presented with the Successfull login message {string}")
    public void i_should_be_presented_with_the_successfull_login_message(String msg) {
        loginPage.validateLogin(msg);
    }

    @And("I Log out")
    public void i_log_out(){
        loginPage.clickOnLogout();
    }


}
