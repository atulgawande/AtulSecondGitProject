package Step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep 

{
	@Given("user is at home page")
	public void user_is_at_home_page() {
	    System.out.println("user in home page");
	}

	@When("user clicks on add profile button")
	public void user_clicks_on_add_profile_button() {
	    System.out.println("Clicked profile button");
	}

	@When("user enters the information")
	public void user_enters_the_information() {
	   System.out.println("Entered information");
	}

	@Then("profile should get created")
	public void profile_should_get_created() {
	   System.out.println("Profile created");
	}

	@When("user clicks on edit profile button")
	public void user_clicks_on_edit_profile_button() {
	    System.out.println("Profile edited");
	}

	@When("user updates the information")
	public void user_updates_the_information() {
	   System.out.println("uSer get updated information");
	}

	@Then("profile should get updated")
	public void profile_should_get_updated() {
	    System.out.println("Profiile was updated");
	}

	@When("user clicks on delete profile button")
	public void user_clicks_on_delete_profile_button() {
	    System.out.println("Profile was deleated");
	}

	@Then("profile should get")
	public void profile_should_get() {
	    System.out.println("Profile ready to view ");
	}

}
