package org.CucumberPractices.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        dryRun = !true,
        features = {".\\src\\main\\java\\org\\CucumberPractices\\features\\login.feature"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"org.CucumberPractices.Steps"},
        plugin = {
                "html:head.html",
                "json:head.json",
                "junit:head.xml",
                "pretty"
        }
)
public class Runner extends AbstractTestNGCucumberTests {
}