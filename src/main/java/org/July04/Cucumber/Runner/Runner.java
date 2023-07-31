package org.July04.Cucumber.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"C:\\Projects\\SampleSelenium\\src\\main\\java\\org\\July04\\Cucumber\\Feature"},
        dryRun = !true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue={"org.July04.Cucumber.Steps"},
        plugin = {"html:rep.html",
        "json:rep.json",
        "junit:rep.xml"}
        //13.5
        //11.775
        //27.825
        //23.975
)
public class Runner extends AbstractTestNGCucumberTests {

}
