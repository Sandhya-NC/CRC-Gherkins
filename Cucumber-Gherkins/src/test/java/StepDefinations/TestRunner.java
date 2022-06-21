package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinations"},
//plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json" },
plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
//tags= "@loginpage or @affiliatePage")
)
public class TestRunner 
{

}

