package io.learn.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("User is on the login page");
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("User enters valid credentials");
    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        System.out.println("User should be redirected to the dashboard");
//        Assert.assertEquals(1, 2);
    }

    @Given("the user enters {string} as the username and {string} as the password")
    public void userEntersCredentials(String username, String password) {
        // Code to input the username and password
        System.out.println(username +" : "+ password );
    }

    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        System.out.println("the user clicks the login button");
    }

    @Then("the user should be redirected to the {string}")
    public void verifyRedirectPage(String page) {
        // Code to verify the user is redirected to the correct page
        System.out.println("Page is:" +page);
    }

    @When("the user clicks the {string} button")
    public void the_user_clicks_the_button(String button) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user clicks the "+ button +" button");
    }

    @Given("the user is logged in")
    public void the_user_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user is logged in");
    }

    @Then("the user should be redirected to the {string} page")
    public void verifyNavigatingPage(String page) {
        // Code to verify the user is redirected to the correct page
        System.out.println("Page is:" +page);
    }
}
