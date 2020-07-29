package com.oscommercec.stepdef;

import com.oscommercec.common.OSCommerceBase;
import com.oscommercec.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class userregistration extends OSCommerceBase{
	
	HomePage hp;
	
	
	@Given("^I am on oscommerce signup page$")
	public void i_am_on_oscommerce_signup_page() throws Throwable {
	
	launcBrowser();
	driver.get("https://demo.oscommerce.com/create_account.php");
	
		
	}

	@When("^I enter info it auto fills$")
	public void i_enter_info_it_auto_fills() throws Throwable {
	

		
	}

	@Then("^I am able to sign up$")
	public void i_am_able_to_sign_up() throws Throwable {
	}

	

}
