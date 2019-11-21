package com.veevacrm.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.veevacrm.utils.TestBase;

public class HomePage extends TestBase {
	Actions builder=new Actions(driver);
	LoginVeeva login = new LoginVeeva();
	//Actions builder;
	
	@FindBy(xpath="//h1[contains(text(),'Deepak Mahapatra at Veeva TechPartner 11')]")
	WebElement userTitle;
	
	@FindBy(id = "db_ref_btn")
	WebElement refreshbutton;

	@FindBy(xpath = "//img[@id='01a3B0000006EeFImg']")
	WebElement tooltip_of_Graph1;

	@FindBy(xpath = "//*[@id=\"01a3B0000006EeGImg\"]")
	WebElement tooltip_of_Graph2;

	@FindBy(xpath = "//img[@id='01a3B0000006EeHImg']")
	WebElement tooltip_of_Graph3;
	
	@FindBy(xpath="//*[@id=\"db_ref_btn\"]")
	WebElement refreshBtn;
	
	@FindBy(name="newEvent")
	WebElement newEvent;
	
	@FindBy(xpath="//*[@id=\"head_1_ep\"]/h3")
	WebElement calandertxt;
	
	@FindBy(xpath="//*[@id=\"evt5\"]")
	WebElement subField;
	
	@FindBy(xpath="//*[@id=\"evt12\"]")
	WebElement locField;
	
	@FindBy(name="StartDateTime")
	WebElement startDate;
	
	@FindBy(name="StartDateTime_time")
	WebElement startTime;
	
	@FindBy(name="EndDateTime")
	WebElement endDate;
	
	@FindBy(name="EndDateTime_time")
	WebElement endTime;
	
	@FindBy(name="save")
	WebElement saveBtn;
	
	@FindBy(xpath="//*[@id=\"homeCalendarSection\"]/div/div[2]/table/tbody/tr/td[1]/div/ul/li[2]/span/a")
	WebElement verifyEvent;
	
	@FindBy(xpath="//*[@id=\"bodyCell\"]/div[1]/div[1]/div[1]/h2")
	WebElement verifyCreatedEvnt;
	
	@FindBy(xpath="//h2[@class='pageDescription']")
	WebElement verifySubjectOfEvent;

	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	 

	public String verifyHomePageTitle() {
		String Homepageurl = driver.getCurrentUrl();
		//System.out.println("Homepageurl12333"+Homepageurl);
		assertTrue(Homepageurl.contains("home.jsp"));
		//System.out.println("Homepageurl:----"+Homepageurl);
		return Homepageurl;
		
	}
	public void verifyUserTitle() {
		//driver.switchTo().frame("sessionserver");
		String title_of_user=userTitle.getText();
		Assert.assertEquals("Deepak Mahapatra at Veeva TechPartner 11", title_of_user);
		
	}
	public void verifyGraphOne() {
		
		//builder=new Actions(driver);
		builder.moveToElement(tooltip_of_Graph1).perform();
		String tooltip_msg_of_graph1=tooltip_of_Graph1.getAttribute("alt");
		System.out.println("Tooltip message for Graph 1 is "+tooltip_msg_of_graph1);
		String msg1="Call Activities by Users - Click to go to full report.";
		Assert.assertEquals(tooltip_msg_of_graph1, msg1);
	}
	public void verifyGraphTwo() {
		//builder=new Actions(driver);
		builder.moveToElement(tooltip_of_Graph2).perform();
		String tooltip_msg_of_graph2=tooltip_of_Graph2.getAttribute("alt");
		System.out.println("Tooltip message for Graph 2 is "+tooltip_msg_of_graph2);
		String msg2="Call Activities by Account - Click to go to full report.";
		Assert.assertEquals(tooltip_msg_of_graph2,msg2);
	}
	public void verifyGraphThree() {
		//builder=new Actions(driver);
		builder.moveToElement(tooltip_of_Graph3).perform();
		String tooltip_msg_of_graph3=tooltip_of_Graph3.getAttribute("alt");
		System.out.println("Tooltip message for Graph 3 is "+tooltip_msg_of_graph3);
		String msg3="Call Activities by Product - Click to go to full report.";
		Assert.assertEquals(tooltip_msg_of_graph3,msg3);
	}
	
	public HomePage verifyRefreshButton() {
		refreshBtn.click();
		return new HomePage();
	}
	public void verifynewEvent() {
		newEvent.click();
	}
	
	public void verifycalendar() {
		String txtClndr =calandertxt.getText();
		Assert.assertEquals(txtClndr, "Calendar Details");
	}
	public void verifySubjectField() {
		subField.sendKeys(prop.getProperty("subField"));
	}
	public void verifyLocationField() {
		locField.sendKeys("Bangalore");
	}
	public void verifyStartDate() {
		startDate.clear();
		TestBase.Date();
		startDate.sendKeys(TestBase.calenderStartDate);
	}
	public void verifyStartTime() {
		startTime.clear();
		startTime.sendKeys(prop.getProperty("startTime"));
	}
	public void verifyEndDate() {
		endDate.clear();
		
		endDate.sendKeys(TestBase.calenderEndDate);
	}
	public void verifyEndTime() {
		endTime.clear();
		endTime.sendKeys(prop.getProperty("endTime"));
	}
	public void verifySaveBtn() {
		saveBtn.click();
		verifyEvent.click();
		String subOfCalanderEvent=verifySubjectOfEvent.getText();
		Assert.assertEquals(subOfCalanderEvent,prop.getProperty("subField"));

	}
	public void close_Home__Broswer()  {
		login.verifyViewloginDropdown();
		driver.close();
	}

	
	   
}

