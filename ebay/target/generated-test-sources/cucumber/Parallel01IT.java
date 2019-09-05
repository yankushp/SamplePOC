import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/BigW/projects/BigW/src/test/resources/storyFiles/SelectEbayProduct.feature"},
        plugin = {"json:C:/BigW/projects/BigW/target/cucumber-parallel/1.json"},
        monochrome = false,
        tags = {},
        glue = {"main"})
public class Parallel01IT {
}
