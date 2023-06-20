package org.June20.Cucumber.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {".\\src\\main\\java\\org\\June20\\Cucumber\\Feature\\Letcode.feature"},
        dryRun = !true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"org.June20.Cucumber","org.June20.Hooks"},
        plugin = {"pretty",
        "html:nose.html",
        "json:nose.json",
        "junit:nose.xml"}

)
public class Runner extends AbstractTestNGCucumberTests {
}
