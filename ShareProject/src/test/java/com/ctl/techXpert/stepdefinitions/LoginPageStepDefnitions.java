package com.ctl.techXpert.stepdefinitions;

import com.ctl.techXpert.projectpage.LoginPage;
import com.ctl.techXpert.seleniumrepository.AppiumRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPageStepDefnitions {
	
	LoginPage loginPage = new LoginPage();
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		AppiumRepo.isElementPresent(loginPage.getMobileID());
	}

	@Then("^User should see an input field for mobile id$")
	public void user_should_see_an_input_field_for_mobile_id() throws Throwable {

	}

	@Then("^User should be able enter text in the mobile id field$")
	public void user_should_be_able_enter_text_in_the_mobile_id_field() throws Throwable {

	}

	@Then("^User should see an input field for password$")
	public void user_should_see_an_input_field_for_password() throws Throwable {

	}

	@Then("^User should be able enter text in the password field$")
	public void user_should_be_able_enter_text_in_the_password_field() throws Throwable {

	}

	@Then("^Login button also should be displayed$")
	public void login_button_also_should_be_displayed() throws Throwable {

	}

	@Then("^Help text also should be displayed$")
	public void help_text_also_should_be_displayed() throws Throwable {

	}

}
