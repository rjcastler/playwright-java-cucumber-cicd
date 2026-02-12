package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePage_Steps {

    @Given("I navigate to internet herokuapp app")
    public void i_navigate_to_internet_herokuapp_app() {
        System.out.println("Home Page");
    }
    @When("I click on Form Authentication link")
    public void i_click_on_form_authentication_link() {
        System.out.println("Form Authentication Page");
    }

}
