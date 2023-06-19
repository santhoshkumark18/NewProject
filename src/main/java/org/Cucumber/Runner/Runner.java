package org.Cucumber.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ={".\\src\\main\\java\\org\\Cucumber\\Feature\\addToCart.feature"},
        dryRun = !true,
        tags = "@smoke",
        glue = {"org.Cucumber.Steps","org.Cucumber.Hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true
)
public class Runner extends AbstractTestNGCucumberTests {
}
