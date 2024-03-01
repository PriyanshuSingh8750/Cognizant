package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
    features = {".//FeatureFiles/"},
//    features = {".//FeatureFiles/langLearnPage.feature"},
 
    glue = "stepDefinitions",
    plugin= {"pretty", "html:reports/myreport.html", 
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			}
//    plugin = {"io.cucumber.core.plugin.OrderExecutor"}
)
public class TestRun {
}
