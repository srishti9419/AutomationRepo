package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(
		features={"D:/AutomationRepo/CucumberProject/FeatureFiles/Feature2.feature"},
		glue={"stepDefination"},
	plugin={"pretty","html:test_output","junit:junit-output/cumcumber.xml"},
		dryRun=false,
		
		monochrome=false
		)



public class Runner {

}
