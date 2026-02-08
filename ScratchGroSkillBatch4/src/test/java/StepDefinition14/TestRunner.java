package StepDefinition14;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features="src/test/java/FeatureFiles/",	
	glue= {"StepDefinition14"},
	tags="@sanity",
	dryRun=false,
	monochrome=false,
	plugin = {"pretty","html:target/htmlReport/index.html",
			
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			
	
	
	}
	
		
		
		
		
		)













public class TestRunner {

}