package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//vashw//Desktop//Selenium//CucumberAutomation//Features//MedopractHRM.feature",glue = "StepDefinitions")

public class TestRunner {

}
