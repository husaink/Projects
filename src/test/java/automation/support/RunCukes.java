package automation.support;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","json:target/cucumber.json"}, features = "src/test/resources/features", 
glue = {"automation"}) //if you're on windows add `monochrome=true` for clean output
public class RunCukes { }
