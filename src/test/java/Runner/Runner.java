package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/resources/Features/AjoutProduct.feature",
		glue="TestSuite",
		plugin= {"pretty","html:target/cucumber-report.html"}
		)
public class Runner {

}