package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CalcPage;

public class CalcSteps extends CalcPage{

	/*CalcPage calcPage = null;
	
	public CalcSteps() {
		calcPage = new CalcPage();
	}
	*/
	@Given("^I'm on the calculator opened$")
	public void i_m_on_the_calculator_opened() throws Throwable {
	    System.out.println("Calculator Opened");
	}

	@When("^I entering the first number$")
	public void i_entering_the_first_number() throws Throwable {
	    clickNumber("5");
	}

	@And("^Sum with the second number$")
	public void sum_with_the_second_number() throws Throwable {
	    clickSum();
		clickNumber("4");
		clickEquals();
	}

	@Then("^I will see the result$")
	public void i_will_see_the_result() throws Throwable {
		
		Assert.assertEquals("9", result.getText());
		
	}
	
	
}
