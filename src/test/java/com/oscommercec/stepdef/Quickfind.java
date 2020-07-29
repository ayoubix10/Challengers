package com.oscommercec.stepdef;

import com.oscommercec.common.OSCommerceBase;
import com.oscommercec.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Quickfind extends OSCommerceBase {
	
	HomePage hp;

	@Given("^I am on the oscommerce homepage$")
	public void i_am_on_the_oscommerce_homepage() throws Throwable {

		launcBrowser();

	}

	@When("^I enter samsung quick find$")
	public void i_enter_samsung_quick_find() throws Throwable {
		
	hp = new HomePage(driver);
	hp.enterQuickFind();
	
	hp.clickQuickSearch();	

	
	}

	@Then("^I see the list of the associated products$")
	public void i_see_the_list_of_the_associated_products() throws Throwable {
		
	
	Thread.sleep(10000);
	closebrowser();
	
	}
	
	

}
