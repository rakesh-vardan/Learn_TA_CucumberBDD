package io.learn.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "io.learn.steps",
        tags = "@cart",
        plugin = {"pretty", "junit:target/cucumber.xml"}
)
public class CartXMLTestRunner {
}
