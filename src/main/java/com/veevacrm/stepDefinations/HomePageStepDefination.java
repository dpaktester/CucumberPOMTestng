package com.veevacrm.stepDefinations;

import com.veevacrm.pages.HomePage;
import com.veevacrm.pages.LoginVeeva;
import com.veevacrm.utils.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefination extends TestBase {
	LoginVeeva loginveeva ;
	HomePage hp=new HomePage();
	
	
	
	@Given("^user is in Home page$")
	public void user_is_in_Home_page()  {
		//hp=new HomePage();
	   hp.verifyUserTitle();
	}

	@When("^user hovers on graph One verify the message of graph one$")
	public void user_hovers_on_graph_One1()  {
		//hp = new HomePage();
	   hp.verifyGraphOne();
	    
	}
	@And("^user hovers on graph two verify message of graph two$")
	public void user_hovers_on_graph_two()  {
		//hp = new HomePage();
	   hp.verifyGraphTwo();
	    
	}   
	@And("^user hovers on graph three verify message of graph three$")
	public void user_hovers_on_graph_three()  {
		hp = new HomePage();
	   hp.verifyGraphThree();
	    
	}
/*	@Given("^user is on home page$")
	public void user_is_on_home_page1() {
		hp=new HomePage();
		   hp.verifyHomePageTitle();
	}*/
	@When("^user clicks on Refresh button$")
	public void user_clicks_on_Refresh_button()
	 {
		//hp=new HomePage();
		hp.verifyRefreshButton();
	}
	@Then("^the three graphs refreshed$")
	public void the_three_graphs_refreshed() {
		//hp = new HomePage();
		hp.verifyGraphOne();
		hp.verifyGraphTwo();
		hp.verifyGraphThree();
	}
	@Given("^user clicks on New Event button$")
	public void user_clicks_on_New_Event_button() {
		//hp=new HomePage();
		hp.verifynewEvent();
	}
	@Then ("^Calendar opens$")
	public void Calendar_opens() {
		//hp = new HomePage();
		hp.verifycalendar();
	}
	
	@Then("^Enter the subject as Testing Calander Event$")
	public void  Enter_the_subject_of_Calandervent() {
		//hp= new HomePage();
		hp.verifySubjectField();
	}
	@And("^Enter the location as Bangalore$")
	public void Enter_Location() {
		hp=new HomePage();
		hp.verifyLocationField();
	}
	@And("^Enter the Start Date$")
	public void Enter_Start_Date() {
		//hp= new HomePage();
		hp.verifyStartDate();
	}
	@And("^Enter the Start Time$")
	public void Enter_Start_Time() {
		//hp=new HomePage();
		hp.verifyStartTime();
	}
	@And("^Enter the End Date$")
	public void Enter_End_Date() {
		//hp=new HomePage();
		hp.verifyEndDate();
	}
	@And("^Enter the End Time$")
	public void Enter_End_Time() {
		//hp=new HomePage();
		hp.verifyEndTime();
	}
	@Then("^Click on Save button$")
	public void Click_on_Save_button() {
		//hp=new HomePage();
		hp.verifySaveBtn();
	}
	@Then("^close the home browser$")
	public void close_the_home_browser() {
		hp.close_Home__Broswer();
	}
}
