package com.veevacrm.stepDefinations;

import com.veevacrm.pages.AccountsPage;
import com.veevacrm.pages.HomePage;
import com.veevacrm.pages.LoginVeeva;
import com.veevacrm.utils.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountsPageStepDefination extends TestBase {
	LoginVeeva loginveeva;
	HomePage hp = new HomePage();
	AccountsPage ap = new AccountsPage();

	@Then("^Check if call is associated with the user or not$")
	public void Check_if_call_is_associated_with_the_user_or_not() {
		ap.verifyCalls();
	}

	@Then("^user clicks on my Accounts$")
	public void user_clicks_on_my_Accounts() {
		AccountsPage.acntPage();
	}

	@And("^verifies the Title of the Page$")
	public void verifies_the_Title_of_the_Page() {
		ap.verifyTitle();
	}

	// Need to change the code here
	@Given("^user is in Accounts Page$")
	public void user_is_in_Accounts_Page() {
		// String accountverify=AccountsPage.myAccountsText.getText();
		// System.out.println("accountverify_______________"+accountverify);

	}

	@Then("^Check the view Drop down values against Requirement$")
	public void Check_the_view_Drop_down_values_against_Requirement() {
		AccountsPage.verifyViewDropdown();

	}

	@And("^Select each Drop down value one by one$")
	public void Select_each_Drop_down_value_one_by_one() throws Exception {
		ap.ViewDropdown();
	}

	@When("^view selected is commercial$")
	public void view_selected_is_commercial() {
		ap.click_on_commercial_view();
	}

	@And("^click on one commercial plan$")
	public void click_on_one_plan() {
		AccountsPage.click_on_commercial_plan();
	}

	@Then("^Check the Header$")
	public void Check_the_Header() {
		ap.checkHeader_for_commercial();
	}

	@And("^check the selected items in the particular Account$")
	public void check_the_selected_items_in_the_particular_Account() {
		ap.checkAccounts_items_for_Commercial();
	}

	@And("^check the items in Account Detail$")
	public void check_the_items_in_Account_Detail() {
		ap.checkFiledsinAccountDetails_items();
	}

	@Then("^compare the accountname with the account Details$")
	public void compare_the_accountname_with_the_account_Details() {
		ap.verifyAccountNameAgainstAccountDetails();
	}

	@Then("^check the items in Formulary$")
	public void check_the_items_in_Formulary() {
		ap.verify_Formulary_items();
	}

	@Then("^check the items in CovergePolicy$")
	public void check_the_items_in_CovergePolicy() {
		ap.verify_coverage_policy_items();
	}

	@Then("^check the items in pharmacy Services$")
	public void check_the_items_in_pharmacy_Services() {
		ap.verify_pharmacy_srvices_items();
	}

	@Then("^check the items in Plan Products$")
	public void check_the_items_in_Plan_Products() {
		ap.verify_plan_products_items();
	}

	@Then("^check the items in Specialty Providers$")
	public void check_the_items_in_Specialty_Providers() {
		ap.verify_Specialty_Providers_items();
	}

	@Then("^check the items in Member Of$")
	public void check_the_items_in_Member_Of() {
		ap.verify_Member_Of_items();
	}

	@Then("^check the items in Member$")
	public void check_the_items_in_Member() {
		ap.verify_member_items();
	}

	@Then("^check the items in Address$")
	public void check_the_items_in_Address() {
		ap.verify_address_items();
	}

	@Then("^check the items in Account Plan$")
	public void check_the_items_in_Account_Plan() {
		ap.verify_Account_plan_items();
	}

	@Then("^check the View Hierarchy button$")
	public void check_view_btn() {
		ap.verify_view_Hierarchy_Button();
	}

	@When("^view selected is Employer$")
	public void view_selected_is_Employer() {
		ap.click_on_Employer_view();
	}

	@And("^click on one Employer plan$")
	public void check_Employer_plan() {
		AccountsPage.click_on_Employer_plan();
	}

	@Then("^Check the Header of Employer Plan$")
	public void Check_the_Header_of_Employer_Plan() {
		ap.checkHeader_of_Employer();
	}

	@And("^check the selected items in the particular Account of Employer Plan$")
	public void check_the_selected_items_in_the_particular_Account_of_Employer_Plan() {
		ap.checkAccounts_items_for_Employer();
	}

	@When("^view selected is PBM$")
	public void view_selected_is_PBM() {
		ap.click_on_PBM_view();
	}

	@And("^click on one PBM plan$")
	public void click_on_one_PBM_plan() {
		AccountsPage.click_on_PBM_plan();
	}

	@Then("^Check the Header of PBM Plan$")
	public void Check_the_Header_of_PBM_Plan() {
		ap.checkHeader_of_PBM();
	}

	@And("^check the selected items in the particular Account of PBM Plan$")
	public void check_the_selected_items_in_the_particular_Account_of_PBM_Plan() {
		ap.checkAccounts_items_for_PBM();
	}

	@When("^view selected is Specialty Provider$")
	public void view_selected_is_Specialty_Provider() {
		ap.click_on_Specialty_plan_view();
	}

	@And("^click on one Specialty Provider plan$")
	public void click_on_one_Specialty_Provider_plan() {
		AccountsPage.click_on_Specialty_plan();
	}

	@Then("^Check the Header of Specialty Provider Plan$")
	public void Check_the_Header_of_Specialty_Provider_Plan() {
		ap.checkHeader_of_Specialty();
	}

	@And("^check the selected items in the particular Account of Specialty Provider Plan$")
	public void check_the_selected_items_in_the_particular_Account_of_Specialty_Provider_Plan() {
		ap.checkAccounts_items_for_Specialty_view();
	}

	@When("^view selected is State Medicaid$")
	public void view_selected_is_State_Medicaid() {
		ap.click_on_State_Medicaid_plan_view();
	}

	@And("^click on one State Medicaid plan$")
	public void click_on_one_State_Medicaid_plan() {
		AccountsPage.click_on_State_Medicaid_plan();
	}

	@Then("^Check the Header of State Medicaid Plan$")
	public void Check_the_Header_of_State_Medicaid_Plan() {
		ap.checkHeader_of_State_Medicaid_plan();
	}

	@And("^check the selected items in the particular Account of State Medicaid Plan$")
	public void check_the_selected_items_in_the_particular_Account_of_State_Medicaid_Plan() {
		ap.checkAccounts_items_for_State_Mediacaid_Plan();
	}

	@When("^view selected is Tricare$")
	public void view_selected_is_Tricare() {
		ap.click_on_Tricare_plan_view();
	}

	@And("^click on one Tricare plan$")
	public void click_on_one_Tricare_plan() {
		AccountsPage.click_on_Tricare_plan();
	}

	@Then("^Check the Header of Tricare Plan$")
	public void Check_the_Header_of_Tricare_Plan() {
		ap.checkHeader_of_Tricare_plan();
	}

	@And("^check the selected items in the particular Account of Tricare Plan$")
	public void check_the_selected_items_in_the_particular_Account_of_Tricare_Plan() {
		ap.checkAccounts_items_for_Tricare_Plan();
	}

	@When("^view selected is VA$")
	public void view_selected_is_VA() {
		ap.click_on_VA_plan_view();
	}

	@And("^click on one VA plan$")
	public void click_on_one_VA_plan() {
		AccountsPage.click_on_VA_plan();
	}

	@Then("^Check the Header of VA Plan$")
	public void Check_the_Header_of_VA_Plan() {
		ap.checkHeader_of_VA_plan();
	}

	@And("^check the selected items in the particular Account of VA Plan$")
	public void check_the_selected_items_in_the_particular_Account_of_VA_Plan() {
		ap.checkAccounts_items_for_VA_Plan();
	}

	@When("^view selected is Medicare$")
	public void view_selected_is_Medicare() {
		ap.click_on_Medicare_plan_view();
	}

	@And("^click on Medicare plan$")
	public void click_on_Medicare_plan() {
		AccountsPage.click_on_Medicare_plan();
	}

	@Then("^Check the Header of Medicare Plan$")
	public void Check_the_Header_of_Medicare_Plan() {
		ap.checkHeader_of_Medicare_plan();
	}

	@And("^check the selected items in the particular Account of Medicare Plan$")
	public void check_the_selected_items_in_the_particular_Account_of_Medicare_Plan() {
		ap.checkAccounts_items_for_Commercial();
	}

	@When("^view selected is My Accounts$")
	public void view_selected_is_My_Accounts() {
		ap.click_on_My_Accounts_plan_view();
	}

	@And("^click on My Accounts plan$")
	public void click_on_My_Accounts_plan() {
		AccountsPage.click_on_My_Accounts_plan();
	}

	@Then("^Check the Header of My Accounts Plan$")
	public void Check_the_Header_of_My_Accounts_Plan() {
		ap.checkHeader_of_My_Accounts_plan();
	}

	@And("^check the selected items in the particular Account of My Accounts Plan$")
	public void check_the_selected_items_in_the_particular_Account_of_My_Accounts_Plan() {
		ap.checkAccounts_items_for_Commercial();
	}

	@When("^view selected is Parent Accounts$")
	public void view_selected_is_Parent_Accounts() {
		ap.click_on_Parents_Accounts_plan_view();
	}

	@And("^click on Parent Accounts plan$")
	public void click_on_Parent_Accounts_plan() {
		AccountsPage.click_on_Parents_Accounts_plan();

	}

	@Then("^Check the Header of Parent Accounts Plan$")
	public void Check_the_Header_of_Parent_Accounts_Plan() {
		ap.checkHeader_of_Parents_Accounts_plan();
	}

	@And("^check the selected items in the particular Account of Parent Accounts Plan$")
	public void check_the_selected_items_in_the_particular_Account_of_Parent_Accounts_Plan() {
		ap.checkAccounts_items_for_Commercial();
	}

	@Then("^check the items for Employer View$")
	public void check_the_items_for_Employer_View() {
		ap.select_Employer_channel();
		ap.checkFiledsinAccountDetails_items();
		ap.verify_Formulary_items();
		ap.verify_pharmacy_srvices_items_Employer_channel();

		ap.verify_plan_products_items();
		ap.verify_address_items();
	}

	@Then("^Check whether the Account belong medicare view or not$")
	public void Check_whether_the_Account_belong_medicare_view_or_not() {
		ap.vefrify_selected_Medicare_view();
	}

	@Then("^check the items for Medicare View$")
	public void check_the_items_for_Medicare_View() {
		ap.checkFiledsinAccountDetails_items();
		ap.verify_Formulary_items();
		ap.verify_coverage_policy_items();
		ap.verify_pharmacy_srvices_items();
		ap.verify_plan_products_items();
		// ap.verify_Specialty_Providers_items();
		ap.verify_Member_Of_items();
		// ap.verify_member_items();
		ap.verify_address_items();
	}

	@Then("^Check whether the Account belong Parent Accounts view or not$")
	public void Check_whether_the_Account_belong_Parent_Accounts_view_or_not() {
		ap.vefrify_selected_Parents_Accounts_view();
	}

	@Then("^check the items for Parent Accounts View$")
	public void check_the_items_for_Parent_Accounts_View() {
		ap.checkFiledsinAccountDetails_items();
		ap.verify_Formulary_items();
		ap.verify_coverage_policy_items();
		// ap.verify_pharmacy_srvices_items();
		ap.verify_plan_products_items();
		ap.verify_Specialty_Providers_items();
		ap.verify_Member_Of_items();
		ap.verify_member_items();
		ap.verify_address_items();
	}

	@Then("^Check whether the Account belong My Accounts view or not$")
	public void Check_whether_the_Account_belong_My_Accounts_view_or_not() {
		ap.vefrify_selected_My_Accounts_view();

	}

	@Then("^check the items for My Accounts View$")
	public void check_the_items_for_My_Accounts_View() {
		ap.checkFiledsinAccountDetails_items();
		ap.verify_Formulary_items();
		ap.verify_coverage_policy_items();
		ap.verify_pharmacy_srvices_items();
		ap.verify_plan_products_items();
		ap.verify_Specialty_Providers_items();
		ap.verify_Member_Of_items();
		ap.verify_member_items();
		ap.verify_address_items();

	}

	@Then("^Check whether the Account belong PBM view or not$")
	public void check_whether_the_Account_belong_PBM_view_or_not() {
		ap.vefrify_selected_PBM_view();

	}

	@Then("^check the items for PBM View$")
	public void check_the_items_for_PBM_View() {
		ap.checkFiledsinAccountDetails_items_PBM();
		ap.verify_Formulary_items();
		// ap.verify_coverage_policy_items();
		ap.verify_pharmacy_srvices_items_PBM();
		// ap.verify_plan_products_items();
		// ap.verify_Specialty_Providers_items();
		// ap.verify_Member_Of_items();
		ap.verify_member_items_PBM();
		ap.verify_address_items();

	}

	@Then("^Check whether the Account belong Specialty view or not$")
	public void check_whether_the_Account_belong_Specialty_view_or_not() {
		ap.vefrify_selected_Specialty_view();

	}

	@Then("^check the items for Specialty View$")
	public void check_the_items_for_Specialty_View() {
		ap.checkFiledsinAccountDetails_items_SP();
		ap.verify_Therapeutic_Classes_items_of_SP();
		ap.verify_Accounts_items_of_SP();
		ap.verify_address_items();

	}

	@Then("^Check whether the Account belong State Medicaid view or not$")
	public void check_whether_the_Account_belong_State_Medicaid_view_or_not() {
		ap.vefrify_selected_State_Medicaid_view();

	}

	@Then("^check the items for State Medicaid View$")
	public void check_the_items_for_State_Medicaid_View() {
		ap.checkFiledsinAccountDetails_items();
		ap.verify_Formulary_items();
		ap.verify_coverage_policy_items();
		// ap.verify_pharmacy_srvices_items();
		ap.verify_plan_products_items();
		// ap.verify_Specialty_Providers_items();
		// ap.verify_Member_Of_items();
		ap.verify_member_items();
		ap.verify_address_items();

	}

	@Then("^Check whether the Account belong Tricare view or not$")
	public void check_whether_the_Account_belong_Tricare_view_or_not() {
		ap.vefrify_selected_Tricare_view();
	}

	@Then("^check the items for Tricare View$")
	public void check_the_items_for_Tricare_View() {
		ap.checkFiledsinAccountDetails_items();
		ap.verify_Formulary_items();
		// ap.verify_coverage_policy_items();
		// ap.verify_pharmacy_srvices_items();
		ap.verify_plan_products_items();
		ap.verify_Specialty_Providers_items();
		ap.verify_Member_Of_items();
		ap.verify_member_items();
		ap.verify_address_items();

	}

	@Then("^Check whether the Account belong VA view or not$")
	public void check_whether_the_Account_belong_VA_view_or_not() {
		ap.vefrify_selected_VA_view();

	}

	@Then("^check the items for VA View$")
	public void check_the_items_for_VA_View() {
		ap.checkFiledsinAccountDetails_items();
		ap.verify_Formulary_items();
		// ap.verify_coverage_policy_items();
		// ap.verify_pharmacy_srvices_items();
		ap.verify_plan_products_items();
		ap.verify_Specialty_Providers_items();
		ap.verify_Member_Of_items();
		ap.verify_member_items();
		ap.verify_address_items();

	}

	@Then("^click on next button and Previous button$")
	public void click_on_next_button() throws Exception {
		ap.vefrify_Next_Button();
	}

	@And("^click on each and every letter in the pagination$")
	public void click_on_each_and_every_letter_in_the_pagination() {
		ap.vefrify_pagination();
	}

	@Then("^Select a view$")
	public void Select_a_view() {
		ap.click_on_commercial_view();
		AccountsPage.click_on_commercial_plan();
	}

	@And("^check the hover functionality of the items$")
	public void check_the_hover_functionality_of_the_items() {
		ap.vefrify_Hover();
	}

	@Then("^Select commercial view$")
	public void Select_commercial_view() {
		driver.switchTo().frame("itarget");
		ap.click_on_commercial_view();
		AccountsPage.click_on_commercial_plan();
	}

	@And("^click on New Account Plan button$")
	public void click_on_New_Account_Plan_button() {
		ap.verify_Account_plan_btn();
	}

	@And("^Enter the mandatory fields and clicks on save$")
	public void Enter_the_mandatory_fields(){
		ap.verify_mandatory_fileds_in_Account_plans();
	}
	@Then("^Delete the created plan$")
	public void Delete_the_created_plan() {
		ap.delete_Created_Account_Plan();
	}
	@And("^close the My Accounts browser$")
	public void close_My_Accounts_Browser()  {
		ap.close_Browser();
	}

}
