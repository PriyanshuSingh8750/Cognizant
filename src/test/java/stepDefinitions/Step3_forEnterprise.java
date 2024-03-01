package stepDefinitions;
 
import java.io.IOException;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObject.ForEnterprise;
 
public class Step3_forEnterprise {
	ForEnterprise fe;
 
	@Given("the user nagivate to Coursera page")
	public void the_user_nagivate_to_coursera_page() {
 
	}
 
	@When("the user navigates to the Enterprise section")
	public void the_user_navigates_to_the_enterprise_section() throws Exception {
		BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Enterprise Section");
		fe = new ForEnterprise(BaseClass.getDriver());		
		fe.ReachForm();
	}
 
 
	@When("the user fills the Form with invalid email")
	public void the_user_fills_the_form_with_invalid_email() throws Exception, IOException {
		BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Filling Form With incorrect Email");
		fe.fillForm();
	}
 
	@Then("the user should capture and display the error message")
	public void the_user_should_capture_and_display_the_error_message() throws Exception {
		BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Capturing Error message");
		fe.clickSubmit();
		fe.captureError();
	}
	
 
}