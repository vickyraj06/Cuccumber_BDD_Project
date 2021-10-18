package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature\\Login.feature",glue = {"StepDefinitions"},monochrome =true,
plugin = {"pretty","html:target/HTMLreports/report.html","json:target/cucumber.json",
		"junit:target/XMLreports/report.xml"},dryRun = false,publish = true)
public class TestRunnerLogin {

}
