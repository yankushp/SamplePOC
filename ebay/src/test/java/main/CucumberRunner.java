package main;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
//import


@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber"},
        features = {"src/test/resources/storyFiles"},
        glue = {"com/auto/test/step/def"},
        tags = {"@Ebay"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true
)
public class CucumberRunner {

}
