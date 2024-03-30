package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = {"src\\test\\resources\\Login\\login.feature"},
		glue = {"step"},
		publish = true
		
		)

public class loginrunnerStep extends AbstractTestNGCucumberTests{

}
