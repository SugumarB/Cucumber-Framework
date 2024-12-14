package com.omrbranch.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.object.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@Given("user is on the OMRBranch Hotel Page")
	public void user_is_on_the_omr_branch_hotel_page() {

	}

	@When("user Login {string},{string}")
	public void user_login(String email, String pass) {
		pom.getLoginpage().login(email, pass);
	}

	@Then("user Should verify success message after Login {string}")
	public void user_should_verify_success_message_after_login(String expLoginsuccessMsg) {
		Assert.assertEquals(expLoginsuccessMsg, pom.getSearchHotelPage().welcomeMsg());
	}

	@When("user Login {string},{string} with Enter Key")
	public void user_login_with_enter_key(String email, String pass) throws AWTException {
	   pom.getLoginpage().loginenter(email, pass);
	   
}

	@Then("user Should verify error  message after Login {string}")
	public void user_should_verify_error_message_after_login(String ACTUAL) {
	   pom.getLoginpage().errormessage().contains(ACTUAL);
	}



}
