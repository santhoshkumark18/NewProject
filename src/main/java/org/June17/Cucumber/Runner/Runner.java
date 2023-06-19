package org.June17.Cucumber.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {".\\src\\main\\java\\org\\June17\\Cucumber\\Feature\\Letcode.feature"},
        dryRun = !true,
        glue = {"org.June17.Cucumber.Steps","org.June17.Cucumber.Hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@smoke",
        plugin = {
        "html:report121.html",
        "json:report121.json",
        "junit:report121.xml"}
)
public class Runner extends AbstractTestNGCucumberTests {

}
