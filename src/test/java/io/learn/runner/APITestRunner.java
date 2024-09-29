package io.learn.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = { "io.learn.steps", "io.learn.hooks" },
        tags = "@api",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class APITestRunner {
}
