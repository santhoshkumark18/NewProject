package org.June14.Cucumber.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {".\\src\\main\\java\\org\\June14\\Cucumber\\Feature\\LetCode.feature"},
        dryRun =!true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"org.June14.Cucumber.Steps","org.June14.Cucumber.Hooks"},
        plugin = {"pretty","html:RTM/report.html",
                "json:RTM/report.json",
                "junit:RTM/report.junit"
        }

)
public class Runner extends AbstractTestNGCucumberTests{

}
