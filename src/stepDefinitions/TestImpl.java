package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestImpl {
	@Given("I am on customer login page")
	public void i_am_on_customer_login_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("######### I am on customer login page ########");
	}

	@When("I enter valid login credentials")
	public void i_enter_valid_login_credentials() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("######### I enter valid login credentials ########");

	}

	@When("I clicked on login button")
	public void i_clicked_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("######### I clicked on login button ########");
	}

	@Then("I verified that i am successfully redirected to the homepage")
	public void i_verified_that_i_am_successfully_redirected_to_the_homepage() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("######### I verified that i am successfully redirected to the homepage ########");
	}

}
