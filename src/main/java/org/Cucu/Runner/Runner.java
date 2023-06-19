package org.Cucu.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {".\\src\\main\\java\\org\\Cucu\\Feature\\LetcodeIn.feature"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = !true,
        glue = {"org.Cucu.Steps"}
)
public class Runner extends AbstractTestNGCucumberTests {
}
