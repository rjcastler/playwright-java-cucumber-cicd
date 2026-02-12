package step_definitions;

import io.cucumber.java.en.Then;

public class FormAuthenticationPage_Steps {

    @Then("I type username")
    public void i_type_username() {
        System.out.println(" Username Field");
    }
    @Then("I type password")
    public void i_type_password() {
        System.out.println("Password Field");
    }
    @Then("I click on Login")
    public void i_click_on_login() {
        System.out.println("Login button");
    }
    @Then("I should be presented with the Successfull login message")
    public void i_should_be_presented_with_the_successfull_login_message() {
        System.out.println("Successfull Message");
    }


}
