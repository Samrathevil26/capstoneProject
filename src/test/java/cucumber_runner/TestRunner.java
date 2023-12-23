package cucumber_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\91630\\Downloads\\capstone-medicare\\capstone-medicare\\CapstoneProject\\src\\test\\java\\feature\\api_test_endpoints.feature",
glue = { "api_cucumber" }, dryRun = false, plugin = { "pretty", "html:target/cucumberreport.html" })


public class TestRunner {

}
