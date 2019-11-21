package com.veevacrm.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.veevacrm.utils.TestBase;

public class AccountsPage extends TestBase {
	LoginVeeva login = new LoginVeeva();

	static Select viewDropdownSelect;
	static java.util.List<WebElement> options;
	static List<String> drop_down_values = new ArrayList<String>();
	static String acntsHeaderTxt_commercial;
	static String acntsHeaderTxt_Employer;
	static String selected_Employer_Plan;
	static String selected_Pbm_Plan;
	static String selected_Specialty_plan;
	static String selected_State_Medicaid_plan;
	static String selected_Tricare_plan;
	static String selected_Va_Plan;
	static String selected_Medicare_Plan;
	static String selected_My_Accounts_plan;
	static String selected_Parents_Accounts_plan;
	static int xpathnumer = 0;

	@FindBy(xpath = "//*[@class='pbBody']/table/tbody/tr/td/div/ul/li[2][(text()='You have no events scheduled for the next 7 days.')]")
	WebElement calendar_evnt;

	@FindBy(xpath = "//*[@class='pbBody']/table/tbody/tr/td/div/ul/li[2][(text()='You have no events scheduled for the next 7 days.')]")
	List<WebElement> calendar_evnt1;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
	static WebElement accountsBtn;

	@FindBy(xpath = "//body[contains(@class,'sfdcBody brandQuaternaryBgr')]")
	public static WebElement myAccountsText;

	@FindBy(xpath = "/html/body/table/tbody/tr/td/div[2]/div[3]/div/div[1]/form/div/span/span[1]")
	WebElement accntDropDown;

	@FindBy(xpath = "//*[@class = 'bFilterView']/span/span/select[1][@id = 'vwid']")
	static WebElement viewDropdown;

	@FindBy(xpath = "//a[contains(text(),'Aetna Health Inc - Alabama')]")
	static WebElement commercialPlan;

	@FindBy(xpath = "//*[@id='contentWrapper']/div[2]/table/tbody/tr/td[2]/div/div/div/h2")
	WebElement acountVerificationText;

	@FindBy(xpath = "//h2[contains(text(),'Account Detail')]")
	WebElement Account_Detail_txt;

	@FindBy(xpath = "//h3[contains(text(),'Formulary')]")
	WebElement Formulary_txt;

	@FindBy(xpath = "//label[contains(text(),'Dashboard')]")
	WebElement Dashboard_txt;

	@FindBy(xpath = "//label[contains(text(),'Coverage Policy')]")
	WebElement Coverage_Policy_Details_txt;

	@FindBy(xpath = "//label[contains(text(),'Pharmacy Service')]")
	WebElement Pharmacy_Service_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[5]//table/tbody/tr/td[1]//h3")
	WebElement Plan_Products_txt;

	@FindBy(xpath = "//h3[contains(text(),'Specialty Providers')]")
	WebElement Specialty_Providers_txt;

	@FindBy(xpath = "//h3[contains(text(),'Member Of')]")
	WebElement Member_Of_txt;

	@FindBy(xpath = "//h3[contains(text(),'Members')]")
	WebElement Members_txt;

	@FindBy(xpath = "//h3[contains(text(),'Addresses')]")
	WebElement Addresses_txt;

	@FindBy(xpath = "//h3[contains(text(),'Account Plans')]")
	WebElement Account_Plans_txt;

	@FindBy(xpath = "//h3[contains(text(),'Calls (Account)')]")
	WebElement Calls_txt;

	@FindBy(xpath = "//*[@class = 'detailList']/tbody/tr[1]/td[1][contains(text(),'Name')]")
	WebElement name_txt;

	@FindBy(xpath = "//*[@class = 'detailList']/tbody/tr[2]/td[1][contains(text(),'Account Type')]")
	WebElement account_Type_txt;

	@FindBy(xpath = "//*[@class = 'detailList']/tbody/tr[3]/td[1][contains(text(),'Entity Level')]")
	WebElement entity_Level_txt;

	@FindBy(xpath = "//*[@class = 'detailList']/tbody/tr[1]/td[3][contains(text(),'Parent Account')]")
	WebElement parent_Account_Txt;

	@FindBy(xpath = "//*[@class = 'detailList']/tbody/tr[2]/td[3][contains(text(),'Website')]")
	WebElement website_txt;

	@FindBy(xpath = "//*[@class = 'detailList']/tbody/tr[3]/td[3][contains(text(),'Plan Lives Rx')]")
	WebElement plan_LivesRx_txt;;

	@FindBy(xpath = "//*[@class = 'detailList']/tbody/tr[1]/td[2][contains(text(),'Aetna Health Inc - Alabama')]")
	WebElement name_of_slctd_comme_accnt;

	@FindBy(xpath = "//body[1]/div/table/tbody/tr[2]/td[1]/a")
	WebElement view_of_Formulary_txt;

	@FindBy(xpath = "//body[1]/div/table/tbody/tr[2]/td[2][contains(text(),'Benefit Design')]")
	WebElement benifitDesign_of_Formulary_txt;

	@FindBy(xpath = "//body[1]/div/table/tbody/tr[3]/td[contains(text(),'Market')]")
	WebElement market_txt;

	@FindBy(xpath = "//*[@class='coveragepolicy']/tbody/tr/th[contains(text(),'Drug Name')]")
	WebElement drugName_txt_of_cvrg_plc;

	@FindBy(xpath = "//*[@class='coveragepolicy']/tbody/tr/th[(text()='Channel')]")
	WebElement channel_txt_of_cvrg_plc;

	@FindBy(xpath = "//*[@class='coveragepolicy']/tbody/tr/th[(text()='SubChannel')]")
	WebElement subchannel_txt_of_cvrg_plc;

	@FindBy(xpath = "//*[@class='coveragepolicy']/tbody/tr/th[(text()='Score')]")
	WebElement Score_txt_of_cvrg_plc;

	@FindBy(xpath = "//*[@class='coveragepolicy']/tbody/tr/th[(text()='Indication')]")
	WebElement Indication_txt_of_cvrg_plc;

	@FindBy(xpath = "//*[@class='coveragepolicy']/tbody/tr/th[(text()='Sub-Indication')]")
	WebElement Sub_Indication_txt_of_cvrg_plc;

	@FindBy(xpath = "//*[@class='pharmacyService']/tbody/tr/th[1]")
	WebElement service_of_pharmacyServices;

	@FindBy(xpath = "//*[@class='pharmacyService']/tbody/tr/th[(text()='Channel')]")
	WebElement channel_of_pharmacyServices;

	@FindBy(xpath = "//*[@class='pharmacyService']/tbody/tr/th[(text()='SubChannel')]")
	WebElement subChannel_of_pharmacySevices;
	
	@FindBy(xpath="//*[@class='pharmacyService']/tbody/tr/th[(text()='PBM Name')]")
	WebElement pbmName_of_pharmacySevices;

	@FindBy(xpath = "//*[@class='pharmacyService']/tbody/tr/th[(text()='Account Name')]")
	WebElement pbmName_of_pharmacySevices_PBM;
	

	@FindBy(xpath = "//*[@class='pharmacyService']/tbody/tr/th[(text()='Provider Name')]")
	WebElement prvdr_name_of_pharmacySevices;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[5]//table/tbody/tr[@class = 'headerRow']/th[(text()='Action')]")
	WebElement action_txt_of_plan_prods;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[5]//table/tbody/tr[@class = 'headerRow']/th[(text()='Product Name')]")
	WebElement product_Nametxt_of_plan_prods;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[5]//table/tbody/tr[@class = 'headerRow']/th[(text()='Channel')]")
	WebElement channel_txt_of_plan_products;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[5]//table/tbody/tr[@class = 'headerRow']/th[(text()='SubChannel')]")
	WebElement subChannel_txt_of_plan_prods;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[5]//table/tbody/tr[@class = 'headerRow']/th[(text()='Product Type')]")
	WebElement Product_Type_txt_of_plan_prods;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[5]//table/tbody/tr[@class = 'headerRow']/th[(text()='Formulary Type Used')]")
	WebElement Formulary_Used_txt_of_plan_prods;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[6]//table/tbody/tr[@class = 'headerRow']/th[(text()='Action')]")
	WebElement Spc_Prvdr_action_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[6]//table/tbody/tr[@class = 'headerRow']/th[(text()='Specialty Provider')]")
	WebElement Spc_Prvdr_Specialty_Provider_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[6]//table/tbody/tr[@class = 'headerRow']/th[(text()='Website')]")
	WebElement Spc_Prvdr_Website_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[7]//table/tbody/tr[@class = 'headerRow']/th[(text()='Action')]")
	WebElement Member_Of_Action_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[7]//table/tbody/tr[@class = 'headerRow']/th[(text()='Parent Account')]")
	WebElement Member_Of_Parent_Account_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[8]//table/tbody/tr[@class = 'headerRow']/th[(text()='Action')]")
	WebElement Member_Action_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[8]//table/tbody/tr[@class = 'headerRow']/th[(text()='Child Account')]")
	WebElement Member_child_acnt_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[8]//table/tbody/tr[@class = 'headerRow']/th[(text()='Title')]")
	WebElement Member_Title_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[8]//table/tbody/tr[@class = 'headerRow']/th[(text()='Account Type')]")
	WebElement Member_Acnt_type_txt;
	
	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[5]//table/tbody/tr[@class = 'headerRow']/th[1]")
	WebElement Member_Action_txt_PBM;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[5]//table/tbody/tr[@class = 'headerRow']/th[2]")
	WebElement Member_child_acnt_txt_PBM;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[5]//table/tbody/tr[@class = 'headerRow']/th[3]")
	WebElement Member_Title_txt_PBM;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[5]//table/tbody/tr[@class = 'headerRow']/th[4]")
	WebElement Member_Acnt_type_txt_PBM;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[9]//table/tbody/tr[@class = 'headerRow']/th[(text()='Action')]")
	WebElement address_action_txt;
	
	@FindBy(xpath="//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[6]//table/tbody/tr[@class = 'headerRow']/th[(text()='Action')]")
	WebElement address_action_txt_employer;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[9]//table/tbody/tr[@class = 'headerRow']/th[(text()='Address line 1')]")
	WebElement address_Address_line_1_txt;
	
	@FindBy(xpath="//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[6]//table/tbody/tr[@class = 'headerRow']/th[(text()='Address line 1')]")
	WebElement address_Address_line_1_txt_employer;
	
	


	/*@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[9]//table/tbody/tr[@class = 'headerRow']/th[(text()='Address line 2')]")
	WebElement address_Address_line_2_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[9]//table/tbody/tr[@class = 'headerRow']/th[(text()='City')]")
	WebElement address_City_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[9]//table/tbody/tr[@class = 'headerRow']/th[(text()='State')]")
	WebElement address_State_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[9]//table/tbody/tr[@class = 'headerRow']/th[(text()='Zip')]")
	WebElement address_Zip_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[9]//table/tbody/tr[@class = 'headerRow']/th[(text()='Map')]")
	WebElement address_Map_txt;*/

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[10]//table/tbody/tr[@class = 'headerRow']/th[(text()='Action')]")
	WebElement AccountPlans_Action_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[10]//table/tbody/tr[@class = 'headerRow']/th[(text()='Account Plan Name')]")
	WebElement AccountPlans_ac_plan_name_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[10]//table/tbody/tr[@class = 'headerRow']/th[(text()='% Complete')]")
	WebElement AccountPlans_Complt_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[10]//table/tbody/tr[@class = 'headerRow']/th[(text()='Status')]")
	WebElement AccountPlans_Status_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[10]//table/tbody/tr[@class = 'headerRow']/th[(text()='Type')]")
	WebElement AccountPlans_Type_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[10]//table/tbody/tr[@class = 'headerRow']/th[(text()='Created By')]")
	WebElement AccountPlans_Created_By_txt;

	@FindBy(xpath = "//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[10]//table/tbody/tr[@class = 'headerRow']/th[(text()='Last Modified Date')]")
	WebElement AccountPlans_Last_Modified_Date_txt;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/ul[1]/li[2]/span[1]/a[(text()='Testing the Subject Field')]")
	WebElement call_name;

	@FindBy(name = "del")
	WebElement delete_btn;

	@FindBy(name = "view_hierarchy_vod")
	WebElement view_hierarchy_btn;

	@FindBy(name = "view_hierarchy_vod")
	List<WebElement> view_hierarchy_btn_1;

	@FindBy(xpath = "//*[@class='bPageBlock secondaryPalette']/div[2]/table/tbody/tr[2]")
	WebElement first_itration_plan_table;

	@FindBy(xpath = "//*[@class='bPageBlock secondaryPalette']/div[2]/table/tbody/tr[2]/td[2]/a")
	WebElement first_Element_of_oplan_table;

	@FindBy(xpath = "//*[@id='vodResultSet']//tr")
	WebElement verify_table_rows;

	@FindBy(xpath = "//a[contains(text(),'AbbVie')]")
	static WebElement employer_plan;

	@FindBy(xpath = "//a[contains(text(),'OPTUMRx')]")
	static WebElement pbmPlan;

	@FindBy(xpath = "//a[(text()='AcariaHealth')]")
	static WebElement Specialty_plan;

	@FindBy(xpath = "//h3[contains(text(),'Therapeutic Classes')]")
	WebElement Therapeutic_Classes_txt;

	@FindBy(xpath = "//h3[contains(text(),'Accounts')]")
	WebElement Acoounts_txt;

	@FindBy(xpath = "//a[(text()='State Medicaid of Alabama (AL)')]")
	static WebElement State_Medicaid_plan;

	@FindBy(xpath = "//a[(text()='Health Net Federal Services (Company)')]")
	static WebElement Tricare_plan;

	@FindBy(xpath = "//a[(text()='U.S. Department of Veterans Affairs (Corporate)')]")
	static WebElement Va_Plan;

	@FindBy(xpath = "//a[(text()='AgeRight Advantage Health Plan')]")
	static WebElement Medicare_Plan;

	@FindBy(xpath = "//a[(text()='1199SEIU National Benefit Funds')]")
	static WebElement My_Accounts_plan;

	@FindBy(xpath = "//a[(text()='Aetna Inc - (Corporate)')]")
	static WebElement Parents_Accounts_plan;
	
	@FindBy(xpath="//*[@class = 'detailList']/tbody/tr[2]/td[2]")
	static WebElement view_verification_name;
	
	
	@FindBy(xpath="//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[7]//table/tbody/tr[@class = 'headerRow']/th[(text()='Action')]")
	WebElement Action_txt_of_Therapeutic_Classes_sp;
	
	@FindBy(xpath="//*[@class='pbBody']/table/tbody/tr[1]/th[(text()='Thera Name')]")
	WebElement Thera_Name_txt_of_Therapeutic_Classes_sp;
	
	@FindBy(xpath="//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[6]//table/tbody/tr[@class = 'headerRow']/th[(text()='Action')]")
	WebElement Action_txt_of_Accounts_sp;
	
	@FindBy(xpath="//*[@class='pbBody']/table/tbody/tr/th[(text()='Account')]")
	WebElement Account_txt_of_Accounts_sp;
	
	@FindBy(xpath="//div[@id='vodNavLinks']/div[4]//a[(text()='Next>')]")
	WebElement top_next_button;
	
	@FindBy(xpath="//div[@id='vodNavLinks']/div[4]//a[(text()='<Previous')]")
	WebElement top_Previous_button;
	
	@FindBy(xpath="//div[@id='vodNavLinks']/div[4]//a[(text()='Next>')]")
	List<WebElement> top_next_button1;
	
	@FindBy(xpath="//*[@class = 'listHoverLinks']/a/span[(text()='Plan Products')]")
	WebElement plan_products_hover_commercial;
	
	@FindBy(xpath="//*[@class = 'listHoverLinks']/a/span[(text()='Specialty Providers')]")
	WebElement Specialty_Providers_hover_commercial;
	
	@FindBy(xpath="//*[@class = 'listHoverLinks']/a/span[(text()='Member Of')]")
	WebElement Member_Of_hover_Commercial;
	
	@FindBy(xpath="//*[@class = 'listHoverLinks']/a/span[(text()='Members')]")
	WebElement Members_hover_Commercial;
	
	@FindBy(xpath="//*[@class = 'listHoverLinks']/a/span[(text()='Addresses')]")
	WebElement Address_Hover_Commercial;
	
	@FindBy(xpath="//*[@class = 'listHoverLinks']/a/span[(text()='Account Plans')]")
	WebElement Account_Plans_Hover_Commercial;
	
	@FindBy(xpath="//*[@class = 'listHoverLinks']/a/span[(text()='Calls (Account)')]")
	WebElement Calls_Hover_Commercial;
	
	@FindBy(xpath="//*[@class = 'listRelatedObject Custom78Block']/div/div/table/tbody/tr[1]/td[2]/input[@class='btn']")
	WebElement New_Account_plan_button_commercial;
	
	@FindBy(id="Name")
	WebElement Account_name_fld_in_Account_plan;
	
	@FindBy(xpath="//*[@class='detailList']/tbody/tr[2]/td[4]/input")
	WebElement Percentage_Complete_txt_of_Account_plan;
	
	@FindBy(xpath="//*[@class='detailList']/tbody/tr[5]/td[2]/textarea")
	WebElement Description_box_txt;
	
	
	@FindBy(xpath="//*[@class='pbButton']/input[@name= 'save']")
	WebElement save_btn_of_Account_plan;
	
	@FindBy(xpath="//td[@id='topButtonRow']//input[@name='del']")
	WebElement delete_btn_of_Account_plan;
	
	
	/*@FindBy(xpath="//div[@class='rolodex']/a[")
	WebElement before_Pagination;
	
	@FindBy(xpath="//div[@class='rolodex']/a]")
	WebElement after_Pagination;
*/
	public AccountsPage() {
		PageFactory.initElements(driver, this);
	}

	public static void acntPage() {
		accountsBtn.click();
		String accountverify = myAccountsText.getText();

		boolean accountPage_verification = accountverify.contains("My Accounts");
		if (accountPage_verification == true) {
			System.out.println("The user is on Account Page");
		} else {
			System.out.println(
					"The user is on different Page:----:" + "\n" + "The Header is:----------:" + "\n" + accountverify);

		}
	}

	public String verifyTitle() {
		String titleOfAccntPage = driver.getTitle();
		// String text = "My Accounts";
		Assert.assertEquals(titleOfAccntPage, "Salesforce - Enterprise Edition");
		return titleOfAccntPage;

	}

	public void verifyCalls() {
		if (calendar_evnt1.size() > 0) {
			String actaul_clndr_evnt_without_call = calendar_evnt.getText();
			System.out.println("sssssssss" + actaul_clndr_evnt_without_call);
			String expected_clndr_evnt_without_call = "You have no events scheduled for the next 7 days.";
			if (actaul_clndr_evnt_without_call.equals(expected_clndr_evnt_without_call)) {
				accountsBtn.click();
			}
		} else {
			call_name.click();
			delete_btn.click();
		}
	}
	/*
	 * public void verifyCalls1() {
	 * 
	 * if (call_name.isEnabled() == true) { //if (call_name.getText().length()>0) {
	 * call_name.click(); delete_btn.click(); }
	 * 
	 * else { accountsBtn.click(); } }
	 */

	public static boolean verifyViewDropdown() {
		driver.switchTo().frame("itarget");
		viewDropdownSelect = new Select(viewDropdown);
		options = viewDropdownSelect.getOptions();
		String[] exp = { "ACO", "Commercial", "Employer", "Hospital", "IDN", "Inactive Accounts", "Medicare",
				"My Accounts", "Parent Accounts", "PBM", "Specialty Provider", "State Medicaid", "Tricare", "VA" };
		List<String> expected = new ArrayList<String>(Arrays.asList(exp));

		for (int i = 0; i < options.size(); i++) {
			drop_down_values.add(options.get(i).getText());
			System.out.println(drop_down_values);
			// }
		}
		// System.out.println("Expected "+expected.containsAll(drop_down_values));
		boolean returnValue = expected.containsAll(drop_down_values);
		Assert.assertEquals(true, returnValue);

		return true;
	}

	public void ViewDropdown() {
		for (int i = 0; i < options.size(); i++) {
			viewDropdownSelect.selectByIndex(i);
		}

	}

	public void click_on_commercial_view() {
		viewDropdownSelect.selectByVisibleText("Commercial");
	}

	public static void click_on_commercial_plan() {
		xpathnumer = 9;
		acntsHeaderTxt_commercial = commercialPlan.getText();
		commercialPlan.click();

	}

	public void checkHeader_for_commercial() {

		System.out.println("acntsHeaderTxt_commercial  " + acntsHeaderTxt_commercial);
		String expAccountHeaderTxt_commercial = acountVerificationText.getText();
		System.out.println("expAccountHeaderTxt_commercial  " + expAccountHeaderTxt_commercial);
		Assert.assertEquals(acntsHeaderTxt_commercial, expAccountHeaderTxt_commercial);
	}

	public void checkAccounts_items_for_Commercial() {
		List<String> actualAccountslist = new ArrayList<String>();
		actualAccountslist.add(Account_Detail_txt.getText());
		actualAccountslist.add(Formulary_txt.getText());
		driver.switchTo().frame(1);
		actualAccountslist.add(Dashboard_txt.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		actualAccountslist.add(Coverage_Policy_Details_txt.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(4);
		actualAccountslist.add(Pharmacy_Service_txt.getText());

		// driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println("got back to parent frame");
		// driver.navigate().refresh();
		// driver.switchTo().defaultContent();
		actualAccountslist.add(Plan_Products_txt.getText());
		actualAccountslist.add(Specialty_Providers_txt.getText());
		actualAccountslist.add(Member_Of_txt.getText());
		actualAccountslist.add(Members_txt.getText());
		actualAccountslist.add(Addresses_txt.getText());
		actualAccountslist.add(Account_Plans_txt.getText());
		actualAccountslist.add(Calls_txt.getText());
		Collections.sort(actualAccountslist);
		System.out.println("actualAccountslist" + actualAccountslist.toString());
		String[] expectedAccountsDetails = { "Account Detail", "Dashboard", "Formulary", "Coverage Policy",
				"Pharmacy Service", "Plan Products", "Specialty Providers", "Member Of", "Members", "Addresses",
				"Account Plans", "Calls (Account)" };
		List<String> expectedaccountslist = new ArrayList<String>(Arrays.asList(expectedAccountsDetails));
		Collections.sort(expectedaccountslist);
		System.out.println("expectedaccountslist" + expectedaccountslist.toString());

		Assert.assertEquals(true, actualAccountslist.equals(expectedaccountslist));

	}

	public void checkFiledsinAccountDetails_items() {

		List<String> actual_AccountDetails_list = new ArrayList<String>();
		actual_AccountDetails_list.add(name_txt.getText());
		actual_AccountDetails_list.add(account_Type_txt.getText());
		actual_AccountDetails_list.add(entity_Level_txt.getText());
		actual_AccountDetails_list.add(parent_Account_Txt.getText());
		actual_AccountDetails_list.add(website_txt.getText());
		actual_AccountDetails_list.add(plan_LivesRx_txt.getText());

		Collections.sort(actual_AccountDetails_list);

		System.out.println("actual_AccountDetails_list" + actual_AccountDetails_list);

		String[] expected_AccountDetails = { "Name", "Account Type", "Entity Level", "Parent Account", "Website",
				"Plan Lives Rx" };
		List<String> expected_account_Deatail_list = new ArrayList<String>(Arrays.asList(expected_AccountDetails));
		Collections.sort(expected_account_Deatail_list);
		System.out.println("expected_account_Deatail_list" + expected_account_Deatail_list);
		Assert.assertEquals(true, actual_AccountDetails_list.equals(expected_account_Deatail_list));
	}
	
	public void checkFiledsinAccountDetails_items_PBM() {

		List<String> actual_AccountDetails_list = new ArrayList<String>();
		actual_AccountDetails_list.add(name_txt.getText());
		actual_AccountDetails_list.add(account_Type_txt.getText());
		actual_AccountDetails_list.add(entity_Level_txt.getText());
		actual_AccountDetails_list.add(parent_Account_Txt.getText());
		actual_AccountDetails_list.add(website_txt.getText());
	
		Collections.sort(actual_AccountDetails_list);

		System.out.println("actual_AccountDetails_list" + actual_AccountDetails_list);

		String[] expected_AccountDetails = { "Name","Account Type","Entity Level","Parent Account","Website" };
		List<String> expected_account_Deatail_list = new ArrayList<String>(Arrays.asList(expected_AccountDetails));
		Collections.sort(expected_account_Deatail_list);
		System.out.println("expected_account_Deatail_list" + expected_account_Deatail_list);
		Assert.assertEquals(true, actual_AccountDetails_list.equals(expected_account_Deatail_list));
	}
	public void checkFiledsinAccountDetails_items_SP() {

		List<String> actual_AccountDetails_list = new ArrayList<String>();
		actual_AccountDetails_list.add(name_txt.getText());
		actual_AccountDetails_list.add(account_Type_txt.getText());
		actual_AccountDetails_list.add(parent_Account_Txt.getText());
	
	
		Collections.sort(actual_AccountDetails_list);

		System.out.println("actual_AccountDetails_list" + actual_AccountDetails_list);

		String[] expected_AccountDetails = { "Name","Account Type","Parent Account" };
		List<String> expected_account_Deatail_list = new ArrayList<String>(Arrays.asList(expected_AccountDetails));
		Collections.sort(expected_account_Deatail_list);
		System.out.println("expected_account_Deatail_list" + expected_account_Deatail_list);
		Assert.assertEquals(true, actual_AccountDetails_list.equals(expected_account_Deatail_list));
	}

	public void verifyAccountNameAgainstAccountDetails() {
		String accountverify_txt = acountVerificationText.getText();
		String name_verify_txt = name_of_slctd_comme_accnt.getText();
		Assert.assertEquals(accountverify_txt, name_verify_txt);
	}

	public void verify_Formulary_items() {
		List<String> actual_formulary_item_list = new ArrayList<String>();
		driver.switchTo().frame(2);
		//actual_formulary_item_list.add(view_of_Formulary_txt.getText());
		actual_formulary_item_list.add(benifitDesign_of_Formulary_txt.getText());
		actual_formulary_item_list.add(market_txt.getText());
		Collections.sort(actual_formulary_item_list);

		System.out.println("actual_formulary_item_list" + actual_formulary_item_list);

		String[] expected_formulary_item = {"Benefit Design", "Market" };
		List<String> expected_formulary_list = new ArrayList<String>(Arrays.asList(expected_formulary_item));
		Collections.sort(expected_formulary_list);
		System.out.println("expected_formulary_list" + expected_formulary_list);
		Assert.assertEquals(true, actual_formulary_item_list.equals(expected_formulary_list));
	}

	public void verify_coverage_policy_items() {
		List<String> actual_cvrg_plc_item_list = new ArrayList<String>();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);

		actual_cvrg_plc_item_list.add(drugName_txt_of_cvrg_plc.getText());
		actual_cvrg_plc_item_list.add(channel_txt_of_cvrg_plc.getText());
		actual_cvrg_plc_item_list.add(subchannel_txt_of_cvrg_plc.getText());
		actual_cvrg_plc_item_list.add(Score_txt_of_cvrg_plc.getText());
		actual_cvrg_plc_item_list.add(Indication_txt_of_cvrg_plc.getText());
		actual_cvrg_plc_item_list.add(Sub_Indication_txt_of_cvrg_plc.getText());
		Collections.sort(actual_cvrg_plc_item_list);

		System.out.println("actual_cvrg_plc_item_list" + actual_cvrg_plc_item_list);

		String[] expected_cvrg_plc_item = { "Drug Name", "Channel", "SubChannel", "Score", "Indication",
				"Sub-Indication" };
		List<String> expected_cvrg_plc_item_list = new ArrayList<String>(Arrays.asList(expected_cvrg_plc_item));
		Collections.sort(expected_cvrg_plc_item_list);
		System.out.println("expected_cvrg_plc_item_list" + expected_cvrg_plc_item_list);
		Assert.assertEquals(true, actual_cvrg_plc_item_list.equals(expected_cvrg_plc_item_list));

	}

	public void verify_pharmacy_srvices_items() {
		List<String> actual_pharmacy_plc_item_list = new ArrayList<String>();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(4);

		actual_pharmacy_plc_item_list.add(service_of_pharmacyServices.getText());
		actual_pharmacy_plc_item_list.add(channel_of_pharmacyServices.getText());
		actual_pharmacy_plc_item_list.add(subChannel_of_pharmacySevices.getText());
		actual_pharmacy_plc_item_list.add(pbmName_of_pharmacySevices.getText());
		actual_pharmacy_plc_item_list.add(prvdr_name_of_pharmacySevices.getText());
		Collections.sort(actual_pharmacy_plc_item_list);

		System.out.println("actual_pharmacy_plc_item_list" + actual_pharmacy_plc_item_list);

		String[] expected_cvrg_plc_item = { "Service Name", "Channel", "SubChannel", "PBM Name", "Provider Name" };
		List<String> expected_cvrg_plc_item_list = new ArrayList<String>(Arrays.asList(expected_cvrg_plc_item));
		Collections.sort(expected_cvrg_plc_item_list);
		System.out.println("expected_cvrg_plc_item_list" + expected_cvrg_plc_item_list);
		Assert.assertEquals(true, actual_pharmacy_plc_item_list.equals(expected_cvrg_plc_item_list));
	}
	
	public void verify_pharmacy_srvices_items_PBM() {
		List<String> actual_pharmacy_plc_item_list_PBM = new ArrayList<String>();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(4);

		actual_pharmacy_plc_item_list_PBM.add(service_of_pharmacyServices.getText());
		actual_pharmacy_plc_item_list_PBM.add(channel_of_pharmacyServices.getText());
		actual_pharmacy_plc_item_list_PBM.add(subChannel_of_pharmacySevices.getText());
		actual_pharmacy_plc_item_list_PBM.add(pbmName_of_pharmacySevices_PBM.getText());
		actual_pharmacy_plc_item_list_PBM.add(prvdr_name_of_pharmacySevices.getText());
		Collections.sort(actual_pharmacy_plc_item_list_PBM);

		System.out.println("actual_pharmacy_plc_item_list_PBM" + actual_pharmacy_plc_item_list_PBM);

		String[] expected_cvrg_plc_item_PBM = { "Service Name", "Channel", "SubChannel", "Account Name", "Provider Name" };
		List<String> expected_cvrg_plc_item_list_PBM = new ArrayList<String>(Arrays.asList(expected_cvrg_plc_item_PBM));
		Collections.sort(expected_cvrg_plc_item_list_PBM);
		System.out.println("expected_cvrg_plc_item_list" + expected_cvrg_plc_item_list_PBM);
		Assert.assertEquals(true, actual_pharmacy_plc_item_list_PBM.equals(expected_cvrg_plc_item_list_PBM));
	}

	public void verify_plan_products_items() {
		List<String> actual_plan_products_item_list = new ArrayList<String>();
		driver.switchTo().defaultContent();

		actual_plan_products_item_list.add(action_txt_of_plan_prods.getText());
		actual_plan_products_item_list.add(product_Nametxt_of_plan_prods.getText());
		actual_plan_products_item_list.add(channel_txt_of_plan_products.getText());
		actual_plan_products_item_list.add(subChannel_txt_of_plan_prods.getText());
		actual_plan_products_item_list.add(Product_Type_txt_of_plan_prods.getText());
		actual_plan_products_item_list.add(Formulary_Used_txt_of_plan_prods.getText());
		Collections.sort(actual_plan_products_item_list);

		System.out.println("actual_plan_products_item_list" + actual_plan_products_item_list);

		String[] expected_plan_products_item = { "Action", "Product Name", "Channel", "SubChannel", "Product Type",
				"Formulary Type Used" };
		List<String> expected_plan_products_item_list = new ArrayList<String>(
				Arrays.asList(expected_plan_products_item));
		Collections.sort(expected_plan_products_item_list);
		System.out.println("expected_plan_products_item_list" + expected_plan_products_item_list);
		Assert.assertEquals(true, actual_plan_products_item_list.equals(expected_plan_products_item_list));
	}

	public void verify_Specialty_Providers_items() {
		List<String> actual_Specialty_Providers_item_list = new ArrayList<String>();
		actual_Specialty_Providers_item_list.add(Spc_Prvdr_action_txt.getText());
		actual_Specialty_Providers_item_list.add(Spc_Prvdr_Specialty_Provider_txt.getText());
		actual_Specialty_Providers_item_list.add(Spc_Prvdr_Website_txt.getText());
		Collections.sort(actual_Specialty_Providers_item_list);

		System.out.println("actual_Specialty_Providers_item_list" + actual_Specialty_Providers_item_list);

		String[] expected_Specialty_Providers_item = { "Action", "Specialty Provider", "Website" };
		List<String> expected_Specialty_Providers_item_list = new ArrayList<String>(
				Arrays.asList(expected_Specialty_Providers_item));
		Collections.sort(expected_Specialty_Providers_item_list);
		System.out.println("expected_Specialty_Providers_item_list" + expected_Specialty_Providers_item_list);
		Assert.assertEquals(true, actual_Specialty_Providers_item_list.equals(expected_Specialty_Providers_item_list));
	}

	public void verify_Member_Of_items() {
		List<String> actual_MemberOf_item_list = new ArrayList<String>();
		actual_MemberOf_item_list.add(Member_Of_Action_txt.getText());
		actual_MemberOf_item_list.add(Member_Of_Parent_Account_txt.getText());
		Collections.sort(actual_MemberOf_item_list);

		System.out.println("actual_MemberOf_item_list" + actual_MemberOf_item_list);

		String[] expected_MemberOf_item = { "Action", "Parent Account" };
		List<String> expected_MemberOf_item_list = new ArrayList<String>(Arrays.asList(expected_MemberOf_item));
		Collections.sort(expected_MemberOf_item_list);
		System.out.println("expected_MemberOf_item_list" + expected_MemberOf_item_list);
		Assert.assertEquals(true, actual_MemberOf_item_list.equals(expected_MemberOf_item_list));
	}

	public void verify_member_items() {
		List<String> actual_member_item_list = new ArrayList<String>();
		actual_member_item_list.add(Member_Action_txt.getText());
		actual_member_item_list.add(Member_child_acnt_txt.getText());
		actual_member_item_list.add(Member_Title_txt.getText());
		actual_member_item_list.add(Member_Acnt_type_txt.getText());
		Collections.sort(actual_member_item_list);

		System.out.println("actual_member_item_list" + actual_member_item_list);
		String[] expected_member_item = { "Action", "Child Account", "Title", "Account Type" };
		List<String> expected_member_item_list = new ArrayList<String>(Arrays.asList(expected_member_item));
		Collections.sort(expected_member_item_list);
		System.out.println("expected_member_item_list" + expected_member_item_list);
		Assert.assertEquals(actual_member_item_list, expected_member_item_list);
	}
	
	public void verify_member_items_PBM() {
		driver.switchTo().defaultContent();
		List<String> actual_member_item_list_PBM = new ArrayList<String>();
		actual_member_item_list_PBM.add(Member_Action_txt_PBM.getText());
		actual_member_item_list_PBM.add(Member_child_acnt_txt_PBM.getText());
		actual_member_item_list_PBM.add(Member_Title_txt_PBM.getText());
		actual_member_item_list_PBM.add(Member_Acnt_type_txt_PBM.getText());
		Collections.sort(actual_member_item_list_PBM);

		System.out.println("actual_member_item_list_PBM" + actual_member_item_list_PBM);
		String[] expected_member_item_PBM = { "Action", "Child Account", "Title", "Account Type" };
		List<String> expected_member_item_list_PBM = new ArrayList<String>(Arrays.asList(expected_member_item_PBM));
		Collections.sort(expected_member_item_list_PBM);
		System.out.println("expected_member_item_PBM" + expected_member_item_list_PBM);
		Assert.assertEquals(actual_member_item_list_PBM, expected_member_item_list_PBM);
	}

	public void verify_address_items() {
		List<String> actual_address_item_list = new ArrayList<String>();
		
		WebElement address_action_txt = driver.findElement(By.xpath("//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div"
				+ "["+xpathnumer+"]//table/tbody/tr[@class = 'headerRow']/th[(text()='Action')]"));
		actual_address_item_list.add(address_action_txt.getText());
		WebElement address_Address_line_1_txt= driver.findElement(By.xpath("//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div"
				+ "["+xpathnumer+"]//table/tbody/tr[@class = 'headerRow']/th[(text()='Address line 1')]"));
		actual_address_item_list.add(address_Address_line_1_txt.getText());
		WebElement address_Address_line_2_txt=driver.findElement(By.xpath("//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div"
				+ "["+xpathnumer+"]//table/tbody/tr[@class = 'headerRow']/th[(text()='Address line 2')]"));
		actual_address_item_list.add(address_Address_line_2_txt.getText());
		WebElement address_City_txt=driver.findElement(By.xpath("//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div"
				+ "["+xpathnumer+"]//table/tbody/tr[@class = 'headerRow']/th[(text()='City')]"));
		actual_address_item_list.add(address_City_txt.getText());
		WebElement address_State_txt=driver.findElement(By.xpath("//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div"
				+ "["+xpathnumer+"]//table/tbody/tr[@class = 'headerRow']/th[(text()='State')]"));
		actual_address_item_list.add(address_State_txt.getText());
		WebElement address_Zip_txt=driver.findElement(By.xpath("//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div"
				+ "["+xpathnumer+"]//table/tbody/tr[@class = 'headerRow']/th[(text()='Zip')]"));
		actual_address_item_list.add(address_Zip_txt.getText());
		WebElement address_Map_txt=driver.findElement(By.xpath("//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div"
				+ "["+xpathnumer+"]//table/tbody/tr[@class = 'headerRow']/th[(text()='Map')]"));
		actual_address_item_list.add(address_Map_txt.getText());

		Collections.sort(actual_address_item_list);

		System.out.println("actual_address_item_list" + actual_address_item_list);
		String[] expected_address_item = { "Action", "Address line 1", "Address line 2", "City", "State", "Zip",
				"Map" };
		List<String> expected_address_item_list = new ArrayList<String>(Arrays.asList(expected_address_item));
		Collections.sort(expected_address_item_list);
		System.out.println("expected_address_item_list" + expected_address_item_list);
		Assert.assertEquals(actual_address_item_list, expected_address_item_list);
	}

	public void verify_Account_plan_items() {
		List<String> actual_account_plan_item_list = new ArrayList<String>();
		/*WebElement AccountPlans_Action_txt=driver.findElement(By.xpath
				("//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[10]//table/tbody/tr[@class = 'headerRow']/th[(text()='Action')]"));*/
		actual_account_plan_item_list.add(AccountPlans_Action_txt.getText());
		actual_account_plan_item_list.add(AccountPlans_ac_plan_name_txt.getText());
		actual_account_plan_item_list.add(AccountPlans_Complt_txt.getText());
		actual_account_plan_item_list.add(AccountPlans_Status_txt.getText());
		actual_account_plan_item_list.add(AccountPlans_Type_txt.getText());
		actual_account_plan_item_list.add(AccountPlans_Created_By_txt.getText());
		actual_account_plan_item_list.add(AccountPlans_Last_Modified_Date_txt.getText());

		Collections.sort(actual_account_plan_item_list);
		System.out.println("actual_account_plan_item_list" + actual_account_plan_item_list);
		String[] expected_account_plan_item = { "Action", "Account Plan Name", "% Complete", "Status", "Type",
				"Created By", "Last Modified Date" };
		List<String> expected_account_plan_item_list = new ArrayList<String>(Arrays.asList(expected_account_plan_item));
		Collections.sort(expected_account_plan_item_list);
		System.out.println("expected_account_plan_item_list" + expected_account_plan_item_list);
		Assert.assertEquals(actual_account_plan_item_list, expected_account_plan_item_list);
	}
	
	public void verify_Therapeutic_Classes_items_of_SP() {
		List<String> actual_Therapeutic_Classes_list = new ArrayList<String>();
		/*WebElement AccountPlans_Action_txt=driver.findElement(By.xpath
				("//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[10]//table/tbody/tr[@class = 'headerRow']/th[(text()='Action')]"));*/
		actual_Therapeutic_Classes_list.add(Action_txt_of_Therapeutic_Classes_sp.getText());
		actual_Therapeutic_Classes_list.add(Thera_Name_txt_of_Therapeutic_Classes_sp.getText());
	
		Collections.sort(actual_Therapeutic_Classes_list);
		System.out.println("actual_Therapeutic_Classes_list" + actual_Therapeutic_Classes_list);
		String[] expected_Therapeutic_Classes_item = { "Action", "Thera Name" };
		List<String> expected_Therapeutic_Classes_item_list = new ArrayList<String>(Arrays.asList(expected_Therapeutic_Classes_item));
		Collections.sort(expected_Therapeutic_Classes_item_list);
		System.out.println("expected_Therapeutic_Classes_item_list" + expected_Therapeutic_Classes_item_list);
		Assert.assertEquals(actual_Therapeutic_Classes_list, expected_Therapeutic_Classes_item_list);
	}
	
	public void verify_Accounts_items_of_SP() {
		List<String> actual_Accounts_list = new ArrayList<String>();
		/*WebElement AccountPlans_Action_txt=driver.findElement(By.xpath
				("//*[@id = 'contentWrapper']/div[2]/table/tbody/tr[1]/td[2]/div[10]//table/tbody/tr[@class = 'headerRow']/th[(text()='Action')]"));*/
		actual_Accounts_list.add(Action_txt_of_Accounts_sp.getText());
		actual_Accounts_list.add(Account_txt_of_Accounts_sp.getText());
	
		Collections.sort(actual_Accounts_list);
		System.out.println("actual_Accounts_list" + actual_Accounts_list);
		String[] expected_Accounts_item = { "Action", "Account" };
		List<String> expected_Accounts_item_list = new ArrayList<String>(Arrays.asList(expected_Accounts_item));
		Collections.sort(expected_Accounts_item_list);
		System.out.println("expected_Accounts_item_list" + expected_Accounts_item_list);
		Assert.assertEquals(actual_Accounts_list, expected_Accounts_item_list);
	}


	public void verify_view_Hierarchy_Button() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		viewDropdownSelect = new Select(viewDropdown);

		for (int i = 0; i < options.size(); i++) {
			viewDropdownSelect.selectByIndex(i);
			List<WebElement> table_list = driver.findElements(By.xpath("//*[@id='vodResultSet']//tr"));
			if (table_list.size() > 2) {
				System.out.println("Entered into the if clause for " + i);
				first_Element_of_oplan_table.click();
				System.out.println("first Element Clicked");
				if (view_hierarchy_btn_1.size() > 0) {
					view_hierarchy_btn.click();
					System.out.println("View Hierarchy button clicked for " + i);
					accountsBtn.click();
					driver.switchTo().frame("itarget");
				} else {
					System.out.println("View Hierarchy button is not there");
					accountsBtn.click();
					driver.switchTo().frame("itarget");
				}
			}
		}

	}

	public void click_on_Employer_view() {
		viewDropdownSelect.selectByVisibleText("Employer");
	}

	public static void click_on_Employer_plan() {
		selected_Employer_Plan = employer_plan.getText();
		employer_plan.click();
	}

	public void checkHeader_of_Employer() {
		// String acntsHeaderTxt=acountVerificationText.getText();
		System.out.println("selected_Employer_Plan" + selected_Employer_Plan);
		String expAccountHeaderTxt = acountVerificationText.getText();
		System.out.println("expAccountHeaderTxt_____" + expAccountHeaderTxt);
		Assert.assertEquals(selected_Employer_Plan, expAccountHeaderTxt);
	}

	public void checkAccounts_items_for_Employer() {
		List<String> actualAccountslist_Employer = new ArrayList<String>();
		actualAccountslist_Employer.add(Account_Detail_txt.getText());
		actualAccountslist_Employer.add(Formulary_txt.getText());
		driver.switchTo().frame(1);
		actualAccountslist_Employer.add(Dashboard_txt.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		actualAccountslist_Employer.add(Pharmacy_Service_txt.getText());
		// driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println("got back to parent frame");
		// driver.navigate().refresh();
		// driver.switchTo().defaultContent();
		actualAccountslist_Employer.add(Plan_Products_txt.getText());
		actualAccountslist_Employer.add(Addresses_txt.getText());
		actualAccountslist_Employer.add(Account_Plans_txt.getText());
		actualAccountslist_Employer.add(Calls_txt.getText());
		Collections.sort(actualAccountslist_Employer);
		System.out.println("actualAccountslist" + actualAccountslist_Employer.toString());
		String[] expectedAccountsDetails_for_Employer = { "Account Detail", "Dashboard", "Formulary",
				"Pharmacy Service", "Plan Products", "Addresses", "Account Plans", "Calls (Account)" };
		List<String> expectedaccountslist_for_employer = new ArrayList<String>(
				Arrays.asList(expectedAccountsDetails_for_Employer));
		Collections.sort(expectedaccountslist_for_employer);
		System.out.println("expectedaccountslist_for_employer" + expectedaccountslist_for_employer.toString());

		Assert.assertEquals(true, actualAccountslist_Employer.equals(expectedaccountslist_for_employer));
	}
	
	/*public void verify_address_items_Employer() {
		List<String> actual_address_item_list = new ArrayList<String>();
		actual_address_item_list.add(address_action_txt_employer.getText());
		actual_address_item_list.add(address_Address_line_1_txt.getText());
		actual_address_item_list.add(address_Address_line_2_txt.getText());
		actual_address_item_list.add(address_City_txt.getText());
		actual_address_item_list.add(address_State_txt.getText());
		actual_address_item_list.add(address_Zip_txt.getText());
		actual_address_item_list.add(address_Map_txt.getText());

		Collections.sort(actual_address_item_list);

		System.out.println("actual_address_item_list" + actual_address_item_list);
		String[] expected_address_item = { "Action", "Address line 1", "Address line 2", "City", "State", "Zip",
				"Map" };
		List<String> expected_address_item_list = new ArrayList<String>(Arrays.asList(expected_address_item));
		Collections.sort(expected_address_item_list);
		System.out.println("expected_address_item_list" + expected_address_item_list);
		Assert.assertEquals(actual_address_item_list, expected_address_item_list);
	}
*/
	public void click_on_PBM_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		viewDropdownSelect.selectByVisibleText("PBM");
	}

	public static void click_on_PBM_plan() {
		selected_Pbm_Plan = pbmPlan.getText();
		pbmPlan.click();
	}

	public void checkHeader_of_PBM() {

		// String acntsHeaderTxt=acountVerificationText.getText();
		System.out.println("selected_Pbm_Plan" + selected_Pbm_Plan);
		String expAccountHeaderTxt = acountVerificationText.getText();
		System.out.println("expAccountHeaderTxt_____" + expAccountHeaderTxt);
		Assert.assertEquals(selected_Pbm_Plan, expAccountHeaderTxt);
	}

	public void checkAccounts_items_for_PBM() {
		List<String> actualAccountslist_PBM = new ArrayList<String>();
		actualAccountslist_PBM.add(Account_Detail_txt.getText());
		actualAccountslist_PBM.add(Formulary_txt.getText());
		driver.switchTo().frame(1);
		actualAccountslist_PBM.add(Dashboard_txt.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		actualAccountslist_PBM.add(Coverage_Policy_Details_txt.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(4);
		actualAccountslist_PBM.add(Pharmacy_Service_txt.getText());

		// driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println("got back to parent frame");
		// driver.navigate().refresh();
		// driver.switchTo().defaultContent();
		actualAccountslist_PBM.add(Members_txt.getText());
		actualAccountslist_PBM.add(Addresses_txt.getText());
		actualAccountslist_PBM.add(Account_Plans_txt.getText());
		actualAccountslist_PBM.add(Calls_txt.getText());
		Collections.sort(actualAccountslist_PBM);
		System.out.println("actualAccountslist_PBM" + actualAccountslist_PBM.toString());
		System.out.println("actualAccountslist" + actualAccountslist_PBM.toString());
		String[] expectedAccountsDetails_for_PBM = { "Account Detail", "Dashboard", "Formulary", "Coverage Policy",
				"Pharmacy Service", "Members", "Addresses", "Account Plans", "Calls (Account)" };
		List<String> expectedaccountslist_for_PBM = new ArrayList<String>(
				Arrays.asList(expectedAccountsDetails_for_PBM));
		Collections.sort(expectedaccountslist_for_PBM);
		System.out.println("expectedaccountslist_for_PBM" + expectedaccountslist_for_PBM.toString());

		Assert.assertEquals(true, actualAccountslist_PBM.equals(expectedaccountslist_for_PBM));

	}

	public void click_on_Specialty_plan_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		viewDropdownSelect.selectByVisibleText("Specialty Provider");
		
	}

	public static void click_on_Specialty_plan() {
		selected_Specialty_plan = Specialty_plan.getText();
		Specialty_plan.click();
	}

	public void checkHeader_of_Specialty() {

		// String acntsHeaderTxt=acountVerificationText.getText();
		System.out.println("selected_Specialty_plan" + selected_Specialty_plan);
		String expAccountHeaderTxt = acountVerificationText.getText();
		System.out.println("expAccountHeaderTxt_____" + expAccountHeaderTxt);
		Assert.assertEquals(selected_Specialty_plan, expAccountHeaderTxt);
	}

	public void checkAccounts_items_for_Specialty_view() {
		List<String> actualAccountslist_for_Specialty_plan = new ArrayList<String>();
		actualAccountslist_for_Specialty_plan.add(Account_Detail_txt.getText());
		actualAccountslist_for_Specialty_plan.add(Therapeutic_Classes_txt.getText());
		actualAccountslist_for_Specialty_plan.add(Acoounts_txt.getText());
		actualAccountslist_for_Specialty_plan.add(Addresses_txt.getText());

		Collections.sort(actualAccountslist_for_Specialty_plan);

		System.out.println("actualAccountslist" + actualAccountslist_for_Specialty_plan.toString());
		String[] expectedAccountsDetails_for_Specialty_Provider = { "Account Detail", "Therapeutic Classes", "Accounts",
				"Addresses" };
		List<String> expectedaccountslist_for_Specialty_Provider = new ArrayList<String>(
				Arrays.asList(expectedAccountsDetails_for_Specialty_Provider));
		Collections.sort(expectedaccountslist_for_Specialty_Provider);
		System.out.println(
				"expectedaccountslist_for_Specialty_Provider" + expectedaccountslist_for_Specialty_Provider.toString());

		Assert.assertEquals(true,
				actualAccountslist_for_Specialty_plan.equals(expectedaccountslist_for_Specialty_Provider));

	}

	public void click_on_State_Medicaid_plan_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		viewDropdownSelect.selectByVisibleText("State Medicaid");
	}

	public static void click_on_State_Medicaid_plan() {
		selected_State_Medicaid_plan = State_Medicaid_plan.getText();
		State_Medicaid_plan.click();
	}

	public void checkHeader_of_State_Medicaid_plan() {

		// String acntsHeaderTxt=acountVerificationText.getText();
		System.out.println("selected_State_Medicaid_plan" + selected_State_Medicaid_plan);
		String expAccountHeaderTxt = acountVerificationText.getText();
		System.out.println("expAccountHeaderTxt_____" + expAccountHeaderTxt);
		Assert.assertEquals(selected_State_Medicaid_plan, expAccountHeaderTxt);
	}

	public void checkAccounts_items_for_State_Mediacaid_Plan() {
		List<String> actualAccountslist_State_Mediacaid = new ArrayList<String>();
		actualAccountslist_State_Mediacaid.add(Account_Detail_txt.getText());
		actualAccountslist_State_Mediacaid.add(Formulary_txt.getText());
		driver.switchTo().frame(1);
		actualAccountslist_State_Mediacaid.add(Dashboard_txt.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		actualAccountslist_State_Mediacaid.add(Coverage_Policy_Details_txt.getText());
		// driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println("got back to parent frame");
		// driver.navigate().refresh();
		// driver.switchTo().defaultContent();
		actualAccountslist_State_Mediacaid.add(Plan_Products_txt.getText());
		actualAccountslist_State_Mediacaid.add(Specialty_Providers_txt.getText());
		actualAccountslist_State_Mediacaid.add(Member_Of_txt.getText());
		actualAccountslist_State_Mediacaid.add(Members_txt.getText());
		actualAccountslist_State_Mediacaid.add(Addresses_txt.getText());
		actualAccountslist_State_Mediacaid.add(Account_Plans_txt.getText());
		actualAccountslist_State_Mediacaid.add(Calls_txt.getText());
		Collections.sort(actualAccountslist_State_Mediacaid);
		System.out.println("actualAccountslist_State_Mediacaid" + actualAccountslist_State_Mediacaid.toString());
		String[] expectedAccountsDetails_for_State_Medicaid = { "Account Detail", "Dashboard", "Formulary",
				"Coverage Policy", "Plan Products", "Specialty Providers", "Member Of", "Members", "Addresses",
				"Account Plans", "Calls (Account)" };
		List<String> expectedaccountslist_for_State_Medicaid = new ArrayList<String>(
				Arrays.asList(expectedAccountsDetails_for_State_Medicaid));
		Collections.sort(expectedaccountslist_for_State_Medicaid);
		System.out.println(
				"expectedaccountslist_for_State_Medicaid" + expectedaccountslist_for_State_Medicaid.toString());

		Assert.assertEquals(true, actualAccountslist_State_Mediacaid.equals(expectedaccountslist_for_State_Medicaid));

	}

	public void click_on_Tricare_plan_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		viewDropdownSelect.selectByVisibleText("Tricare");
	}

	public static void click_on_Tricare_plan() {
		selected_Tricare_plan = Tricare_plan.getText();
		Tricare_plan.click();
	}

	public void checkHeader_of_Tricare_plan() {

		// String acntsHeaderTxt=acountVerificationText.getText();
		System.out.println("selected_Tricare_plan" + selected_Tricare_plan);
		String expAccountHeaderTxt = acountVerificationText.getText();
		System.out.println("expAccountHeaderTxt_____" + expAccountHeaderTxt);
		Assert.assertEquals(selected_Tricare_plan, expAccountHeaderTxt);
	}

	public void checkAccounts_items_for_Tricare_Plan() {
		List<String> actualAccountslist_Tricare = new ArrayList<String>();
		actualAccountslist_Tricare.add(Account_Detail_txt.getText());
		actualAccountslist_Tricare.add(Formulary_txt.getText());
		driver.switchTo().frame(1);
		actualAccountslist_Tricare.add(Dashboard_txt.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		actualAccountslist_Tricare.add(Pharmacy_Service_txt.getText());
		driver.switchTo().defaultContent();
		System.out.println("got back to parent frame");
		actualAccountslist_Tricare.add(Plan_Products_txt.getText());
		actualAccountslist_Tricare.add(Specialty_Providers_txt.getText());
		actualAccountslist_Tricare.add(Member_Of_txt.getText());
		actualAccountslist_Tricare.add(Members_txt.getText());
		actualAccountslist_Tricare.add(Addresses_txt.getText());
		actualAccountslist_Tricare.add(Account_Plans_txt.getText());
		actualAccountslist_Tricare.add(Calls_txt.getText());
		Collections.sort(actualAccountslist_Tricare);
		System.out.println("actualAccountslist_Tricare" + actualAccountslist_Tricare.toString());
		String[] expectedAccountsDetails_for_Tricare = { "Account Detail", "Dashboard", "Formulary", "Pharmacy Service",
				"Plan Products", "Specialty Providers", "Member Of", "Members", "Addresses", "Account Plans",
				"Calls (Account)" };
		List<String> expectedaccountslist_for_Tricare = new ArrayList<String>(
				Arrays.asList(expectedAccountsDetails_for_Tricare));
		Collections.sort(expectedaccountslist_for_Tricare);
		System.out.println("expectedaccountslist_for_Tricare" + expectedaccountslist_for_Tricare.toString());
		Assert.assertEquals(true, actualAccountslist_Tricare.equals(expectedaccountslist_for_Tricare));

	}

	public void click_on_VA_plan_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		viewDropdownSelect.selectByVisibleText("VA");
	}

	public static void click_on_VA_plan() {
		selected_Va_Plan = Va_Plan.getText();
		Va_Plan.click();
	}

	public void checkHeader_of_VA_plan() {

		// String acntsHeaderTxt=acountVerificationText.getText();
		System.out.println("selected_Va_Plan" + selected_Va_Plan);
		String expAccountHeaderTxt = acountVerificationText.getText();
		System.out.println("expAccountHeaderTxt_____" + expAccountHeaderTxt);
		Assert.assertEquals(selected_Va_Plan, expAccountHeaderTxt);
	}

	public void checkAccounts_items_for_VA_Plan() {
		List<String> actualAccountslist_VA = new ArrayList<String>();
		actualAccountslist_VA.add(Account_Detail_txt.getText());
		actualAccountslist_VA.add(Formulary_txt.getText());
		driver.switchTo().frame(1);
		actualAccountslist_VA.add(Dashboard_txt.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		actualAccountslist_VA.add(Coverage_Policy_Details_txt.getText());
		driver.switchTo().defaultContent();
		System.out.println("got back to parent frame");
		actualAccountslist_VA.add(Plan_Products_txt.getText());
		actualAccountslist_VA.add(Member_Of_txt.getText());
		actualAccountslist_VA.add(Members_txt.getText());
		actualAccountslist_VA.add(Addresses_txt.getText());
		actualAccountslist_VA.add(Account_Plans_txt.getText());
		actualAccountslist_VA.add(Calls_txt.getText());
		Collections.sort(actualAccountslist_VA);
		System.out.println("actualAccountsactualAccountslist_VAlist" + actualAccountslist_VA.toString());
		String[] expectedAccountsDetails_for_VA = { "Account Detail", "Dashboard", "Formulary", "Coverage Policy",
				"Plan Products", "Member Of", "Members", "Addresses", "Account Plans", "Calls (Account)" };
		List<String> expectedaccountslist_for_VA = new ArrayList<String>(Arrays.asList(expectedAccountsDetails_for_VA));
		Collections.sort(expectedaccountslist_for_VA);
		System.out.println("expectedaccountslist_for_VA" + expectedaccountslist_for_VA.toString());
		Assert.assertEquals(true, actualAccountslist_VA.equals(expectedaccountslist_for_VA));

	}

	public void click_on_Medicare_plan_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		viewDropdownSelect.selectByVisibleText("Medicare");
	}

	public static void click_on_Medicare_plan() {
		selected_Medicare_Plan = Medicare_Plan.getText();
		Medicare_Plan.click();
	}

	public void checkHeader_of_Medicare_plan() {

		// String acntsHeaderTxt=acountVerificationText.getText();
		System.out.println("selected_Medicare_Plan" + selected_Medicare_Plan);
		String expAccountHeaderTxt = acountVerificationText.getText();
		System.out.println("expAccountHeaderTxt_____" + expAccountHeaderTxt);
		Assert.assertEquals(selected_Medicare_Plan, expAccountHeaderTxt);
	}

	public void click_on_My_Accounts_plan_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		viewDropdownSelect.selectByVisibleText("My Accounts");
	}

	public static void click_on_My_Accounts_plan() {
		selected_My_Accounts_plan = My_Accounts_plan.getText();
		My_Accounts_plan.click();
	}

	public void checkHeader_of_My_Accounts_plan() {

		// String acntsHeaderTxt=acountVerificationText.getText();
		System.out.println("selected_My_Accounts_plan" + selected_My_Accounts_plan);
		String expAccountHeaderTxt = acountVerificationText.getText();
		System.out.println("expAccountHeaderTxt_____" + expAccountHeaderTxt);
		Assert.assertEquals(selected_My_Accounts_plan, expAccountHeaderTxt);
	}

	public void click_on_Parents_Accounts_plan_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		viewDropdownSelect.selectByVisibleText("Parent Accounts");
	}

	public static void click_on_Parents_Accounts_plan() {
		selected_Parents_Accounts_plan = Parents_Accounts_plan.getText();
		Parents_Accounts_plan.click();
	}

	public void checkHeader_of_Parents_Accounts_plan() {

		// String acntsHeaderTxt=acountVerificationText.getText();
		System.out.println("selected_Parents_Accounts_plan" + selected_Parents_Accounts_plan);
		String expAccountHeaderTxt = acountVerificationText.getText();
		System.out.println("expAccountHeaderTxt_____" + expAccountHeaderTxt);
		Assert.assertEquals(selected_Parents_Accounts_plan, expAccountHeaderTxt);
	}
	
	public void select_Employer_channel() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		viewDropdownSelect.selectByVisibleText("Employer");
		xpathnumer=6;
		first_Element_of_oplan_table.click();
		
	}
	public void verify_pharmacy_srvices_items_Employer_channel() {
		List<String> actual_pharmacy_plc_item_list = new ArrayList<String>();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);

		actual_pharmacy_plc_item_list.add(service_of_pharmacyServices.getText());
		actual_pharmacy_plc_item_list.add(channel_of_pharmacyServices.getText());
		actual_pharmacy_plc_item_list.add(subChannel_of_pharmacySevices.getText());
		actual_pharmacy_plc_item_list.add(pbmName_of_pharmacySevices.getText());
		actual_pharmacy_plc_item_list.add(prvdr_name_of_pharmacySevices.getText());
		Collections.sort(actual_pharmacy_plc_item_list);

		System.out.println("actual_pharmacy_plc_item_list" + actual_pharmacy_plc_item_list);

		String[] expected_pharmacy_plc_item = { "Service Name", "Channel", "SubChannel", "PBM Name", "Provider Name" };
		List<String> expected_pharmacy_plc_item_list = new ArrayList<String>(Arrays.asList(expected_pharmacy_plc_item));
		Collections.sort(expected_pharmacy_plc_item_list);
		System.out.println("expected_pharmacy_plc_item_list" + expected_pharmacy_plc_item_list);
		Assert.assertEquals(true, actual_pharmacy_plc_item_list.equals(expected_pharmacy_plc_item_list));
	}
	
	public void vefrify_selected_Medicare_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		xpathnumer=9;
		viewDropdownSelect.selectByVisibleText("Medicare");
		first_Element_of_oplan_table.click();
		String verify_medicare=view_verification_name.getText();
		System.out.println("verify_medicare::"+verify_medicare);
		boolean view_verification_for_Medicare = verify_medicare.contains("Medicare");
		if (view_verification_for_Medicare == true) {
			System.out.println("The user is Accessing Medicare plan");
		} else {
			System.out.println(
					"The user is accessing a different Page:----:" + "\n" + "The page is:----------:" + "\n" + verify_medicare);

		}
	}
	
	public void vefrify_selected_Parents_Accounts_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		xpathnumer=9;
		viewDropdownSelect.selectByVisibleText("Parent Accounts");
		first_Element_of_oplan_table.click();
		String verify_Parent_Accounts=view_verification_name.getText();
		System.out.println("verify_Parent_Accounts::"+verify_Parent_Accounts);
	}
	
	public void vefrify_selected_My_Accounts_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		xpathnumer=9;
		viewDropdownSelect.selectByVisibleText("My Accounts");
		first_Element_of_oplan_table.click();
		String verify_My_Accounts=view_verification_name.getText();
		System.out.println("verify_My_Accounts::"+verify_My_Accounts);
	}
	
	public void vefrify_selected_PBM_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		xpathnumer=6;
		viewDropdownSelect.selectByVisibleText("PBM");
		first_Element_of_oplan_table.click();
		String verify_PBM_View=view_verification_name.getText();
		System.out.println("verify_PBM_View::"+verify_PBM_View);
	}
	
	public void vefrify_selected_Specialty_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		xpathnumer=7;
		viewDropdownSelect.selectByVisibleText("Specialty Provider");
		first_Element_of_oplan_table.click();
		String verify_Specialty_view=view_verification_name.getText();
		System.out.println("verify_Specialty_view::"+verify_Specialty_view);
	}
	
	public void vefrify_selected_State_Medicaid_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		xpathnumer=9;
		viewDropdownSelect.selectByVisibleText("State Medicaid");
		first_Element_of_oplan_table.click();
		String verify_State_Medicaid_View=view_verification_name.getText();
		System.out.println("verify_State_Medicaid_View::"+verify_State_Medicaid_View);
	}
	
	public void vefrify_selected_Tricare_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		xpathnumer=9;
		viewDropdownSelect.selectByVisibleText("Tricare");
		first_Element_of_oplan_table.click();
		String verify_Tricare_view=view_verification_name.getText();
		System.out.println("verify_Tricare_view::"+verify_Tricare_view);
	}
	
	public void vefrify_selected_VA_view() {
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		xpathnumer=8;
		viewDropdownSelect.selectByVisibleText("VA");
		first_Element_of_oplan_table.click();
		String verify_VA_View=view_verification_name.getText();
		System.out.println("verify_VA_View::"+verify_VA_View);
	}
	public void vefrify_pagination() {
		
		viewDropdownSelect = new Select(viewDropdown);
		viewDropdownSelect.selectByIndex(1);
		String before_xpath_piagnation="//div[@class='rolodex']/a";
	
		for (int i=1;i<28;i++) {
			String pagination =before_xpath_piagnation + "["+i+"]" ;
			
			driver.findElement(By.xpath(pagination)).click();
			System.out.println("Pagination clicked on "+i);
		}
			
	}
	
	public void vefrify_Next_Button() throws Exception{
		accountsBtn.click();
		driver.switchTo().frame("itarget");
		viewDropdownSelect = new Select(viewDropdown);
		
		for (int i = 0; i < 4; i++) {
			viewDropdownSelect.selectByIndex(i);
			
			
			List<WebElement> table_list = driver.findElements(By.xpath("//*[@id='vodResultSet']//tr"));
			if (table_list.size() > 15) {
				System.out.println("Entered into the if clause for " + i);
				Thread.sleep(10000);
				/*if(i==7) {
					//driver.navigate().refresh();
					System.out.println("Entered into My Accounts");
					driver.findElement(By.xpath("//div[@id='vodNavLinks']/div[5]/div/div/div/a[(text()='Next>')]")).click();
				}*/
			
				top_next_button.click();
				System.out.println("Next Button Clicked");
				top_Previous_button.click();
				System.out.println("Previous button clicked");
			}
			else {
				System.out.println("There are below 50 plans for the view "+ i +"   So Next button is not There");
				}
			
	}
		for (int i = 5; i < options.size(); i++) {
			viewDropdownSelect.selectByIndex(i);
			
			
			List<WebElement> table_list = driver.findElements(By.xpath("//*[@id='vodResultSet']//tr"));
			if (table_list.size() > 15) {
				System.out.println("Entered into the if clause for " + i);
				Thread.sleep(10000);
				top_next_button.click();
				System.out.println("Next Button Clicked");
				top_Previous_button.click();
				System.out.println("Previous button clicked");
			}
			else {
				System.out.println("There are below 50 plans for the view "+ i +"   So Next button and previous is not There");
				}
			
	}
	}
	public void vefrify_Hover() {
		
		//WebElement web_Element_To_Be_Hovered =driver.findE(plan_products_hover_commercial.toString()));
		Actions builder = new Actions(driver);
		builder.moveToElement(plan_products_hover_commercial).build().perform();
		builder.moveToElement(Specialty_Providers_hover_commercial).build().perform();
		builder.moveToElement(Member_Of_hover_Commercial).build().perform();
		builder.moveToElement(Members_hover_Commercial).build().perform();
		builder.moveToElement(Address_Hover_Commercial).build().perform();
		builder.moveToElement(Account_Plans_Hover_Commercial).build().perform();
		builder.moveToElement(Calls_Hover_Commercial).build().perform();

	}
	public void verify_Account_plan_btn() {
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");*/
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", New_Account_plan_button_commercial);
		Actions a = new Actions(driver);
		a.moveToElement(New_Account_plan_button_commercial).click().build().perform();;
		//New_Account_plan_button_commercial.click();
	}
	public void verify_mandatory_fileds_in_Account_plans(){
		//Thread.sleep(10000);
		Account_name_fld_in_Account_plan.sendKeys("Testing account Plans Field");
		Percentage_Complete_txt_of_Account_plan.sendKeys("60");
		Description_box_txt.sendKeys("The Automation for Creation of Account Plan is working fine .It's good to go"+ "\n"+"\n"+"\n"+"Deepak Kumar Mahapatra");
		save_btn_of_Account_plan.click();
	}
	public void delete_Created_Account_Plan() {
		delete_btn_of_Account_plan.click();
		driver.switchTo().alert().accept();
	}
	public void close_Browser() {
		login.verifyViewloginDropdown();
		driver.close();
	}
		
	
	public void checkAccounts_items_in_All_View() {
		String[] expectedAccountsDetails_for_Employer = { "Account Detail", "Dashboard", "Formulary",
				"Pharmacy Service", "Plan Products", "Addresses", "Account Plans", "Calls (Account)" };
		List<String> expectedaccountslist_for_employer = new ArrayList<String>(
				Arrays.asList(expectedAccountsDetails_for_Employer));
		Collections.sort(expectedaccountslist_for_employer);
		System.out.println("expectedaccountslist_for_employer" + expectedaccountslist_for_employer.toString());

		// coomercial,Medicare,My Accounts,Parent Accounts

		String[] expectedAccountsDetails_for_All = { "Account Detail", "Dashboard", "Formulary", "Coverage Policy",
				"Pharmacy Service", "Plan Products", "Specialty Providers", "Member Of", "Members", "Addresses",
				"Account Plans", "Calls (Account)" };
		List<String> expectedaccountslist_for_All = new ArrayList<String>(
				Arrays.asList(expectedAccountsDetails_for_All));
		Collections.sort(expectedaccountslist_for_All);
		System.out.println("expectedaccountslist_for_All" + expectedaccountslist_for_All.toString());

		String[] expectedAccountsDetails_for_PBM = { "Account Detail", "Dashboard", "Formulary", "Coverage Policy",
				"Pharmacy Service", "Members", "Addresses", "Account Plans", "Calls (Account)" };
		List<String> expectedaccountslist_for_PBM = new ArrayList<String>(
				Arrays.asList(expectedAccountsDetails_for_PBM));
		Collections.sort(expectedaccountslist_for_PBM);
		System.out.println("expectedaccountslist_for_PBM" + expectedaccountslist_for_PBM.toString());

		String[] expectedAccountsDetails_for_Specialty_Provider = { "Account Detail", "Therapeutic Classes", "Accounts",
				"Addresses" };
		List<String> expectedaccountslist_for_Specialty_Provider = new ArrayList<String>(
				Arrays.asList(expectedAccountsDetails_for_Specialty_Provider));
		Collections.sort(expectedaccountslist_for_Specialty_Provider);
		System.out.println(
				"expectedaccountslist_for_Specialty_Provider" + expectedaccountslist_for_Specialty_Provider.toString());

		String[] expectedAccountsDetails_for_State_Medicaid = { "Account Detail", "Dashboard", "Formulary",
				"Coverage Policy", "Plan Products", "Specialty Providers", "Member Of", "Members", "Addresses",
				"Account Plans", "Calls (Account)" };
		List<String> expectedaccountslist_for_State_Medicaid = new ArrayList<String>(
				Arrays.asList(expectedAccountsDetails_for_State_Medicaid));
		Collections.sort(expectedaccountslist_for_State_Medicaid);
		System.out.println(
				"expectedaccountslist_for_State_Medicaid" + expectedaccountslist_for_State_Medicaid.toString());

		String[] expectedAccountsDetails_for_Tricare = { "Account Detail", "Dashboard", "Formulary", "Pharmacy Service",
				"Plan Products", "Specialty Providers", "Member Of", "Members", "Addresses", "Account Plans",
				"Calls (Account)" };
		List<String> expectedaccountslist_for_Tricare = new ArrayList<String>(
				Arrays.asList(expectedAccountsDetails_for_Tricare));
		Collections.sort(expectedaccountslist_for_Tricare);
		System.out.println("expectedaccountslist_for_Tricare" + expectedaccountslist_for_Tricare.toString());

		String[] expectedAccountsDetails_for_VA = { "Account Detail", "Dashboard", "Formulary", "Coverage Policy",
				"Plan Products", "Member Of", "Members", "Addresses", "Account Plans", "Calls (Account)" };
		List<String> expectedaccountslist_for_VA = new ArrayList<String>(Arrays.asList(expectedAccountsDetails_for_VA));
		Collections.sort(expectedaccountslist_for_VA);
		System.out.println("expectedaccountslist_for_VA" + expectedaccountslist_for_VA.toString());

		accountsBtn.click();
		driver.switchTo().frame("itarget");
		viewDropdownSelect = new Select(viewDropdown);

		for (int i = 0; i < options.size(); i++) {
			viewDropdownSelect.selectByIndex(i);
			List<WebElement> table_list = driver.findElements(By.xpath("//*[@id='vodResultSet']//tr"));
			if (table_list.size() > 2) {
				System.out.println("Entered into the if clause for " + i);
				first_Element_of_oplan_table.click();
				System.out.println("first Element Clicked" + first_Element_of_oplan_table.getText().toString());
			}
		}
	}
}
