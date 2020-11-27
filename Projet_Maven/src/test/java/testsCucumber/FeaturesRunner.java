package testsCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

// Default:
@CucumberOptions(
		format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		features ="src/test/resources/features"
)

public class FeaturesRunner {}
