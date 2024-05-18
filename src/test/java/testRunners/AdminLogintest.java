package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Featurefiles/AdminLogin.feature",glue = "stepDefinitions",dryRun = false)
public class AdminLogintest 
{

	
}
