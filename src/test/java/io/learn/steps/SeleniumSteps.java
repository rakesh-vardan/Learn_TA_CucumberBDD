package io.learn.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumSteps {

    WebDriver driver;

//    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

//    @After
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

    @Given("the user is on the sauce-demo login page")
    public void the_user_is_on_the_sauce_demo_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("the user enters the valid credentials")
    public void the_user_enters_the_valid_credentials() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Then("the user should be navigated to the dashboard")
    public void the_user_should_be_navigated_to_the_dashboard() {
        WebElement element = driver.findElement(By.xpath("//span[@data-test='title']"));
        String title = element.getText();
        Assert.assertEquals("Products", title);
    }
}
