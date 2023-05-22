package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@Test
@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = "stepDefinitions")
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
