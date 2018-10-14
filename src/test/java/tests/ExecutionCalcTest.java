package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = "src/test/java/features/Calculator.feature", 
				     glue = {"steps","hook"}
				)
public class ExecutionCalcTest {

}
