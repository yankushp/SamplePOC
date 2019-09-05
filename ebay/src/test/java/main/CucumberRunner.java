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


//    @AfterClass
//    public static void afterClass() throws Throwable {
//        System.out.println( "this is after class");
//        //BrowserDriverInitializer.closeDriver();
//
//
//       /* //DriverFactory.appiumTearDown();
//        Reporting rt = new Reporting();
//        rt.terminatingReportGeneration();*/
//        Reporter.loadXMLConfig(System.getProperty("user.dir")+"/src/test/resources/config/extent-config.xml");
//        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
//        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
//        Reporter.addScenarioLog("this is Big W test");
//
//        BrowserDriverInitializer.closeDriver();
//
//    }
}
