package com.veevacrm.stepDefinations;

import org.testng.Assert;

import com.veevacrm.pages.HomePage;
import com.veevacrm.pages.LoginVeeva;
import com.veevacrm.utils.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination extends TestBase {
	// TestBase tb= new TestBase();
	LoginVeeva loginveeva;
	HomePage hp;

	@Given("^user opens browser$")
	public void user_opens_browser() {
		TestBase.initialization();
	}

	@Then("^user entered into the application by using valid login credentials$")
	public void user_enters_username_and_password() {
		loginveeva = new LoginVeeva();
		hp = loginveeva.logIn(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("UserName and password Entered");

	}

	@And("^user is on home page$")
	public void user_is_on_home_page() {                                              
		  hp= new HomePage(); 
		  hp.verifyHomePageTitle();

	}

	@When("^title of login page is Deepak Mahapatra at Veeva TechPartner 11$")
	public void title_of_login_page_is_Deepak_Mahapatra_at_Veeva_TechPartner() {
		hp.verifyUserTitle();

	}

	@Then("^close the browser$")
	public void close_the_browser() {
		loginveeva.verifyViewloginDropdown();
		driver.close();
	}
	
	

}
