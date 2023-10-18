package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// path of feature file
		features = "src/test/resources/Feature/LoginTest.feature",
		// path of step definition file
		glue = "StepDefinition", 
		//tags = "@smoke",
		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports/Cucumber.html" }, 
		monochrome = true)


public class TestRunner {
}