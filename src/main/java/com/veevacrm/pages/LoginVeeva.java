package com.veevacrm.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.veevacrm.utils.TestBase;

public class LoginVeeva extends TestBase {
	
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//span[@id='userNavLabel']")
	
	WebElement logOut_drop_down;
	
	@FindBy(xpath="//div[@class='mbrMenuItems']/a[2]")
	WebElement logout_btn;
	
	
	//Initializing the Page Objects:
	public LoginVeeva(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	 public  HomePage logIn(String un,String pw) {
		 username.isDisplayed();
		 password.isDisplayed();
		 username.sendKeys(un);
		 password.sendKeys(pw);
		 loginBtn.click();
		return new HomePage(); 
	 }
	 public  void verifyViewloginDropdown() {
		 logOut_drop_down.click();
		 logout_btn.click();
		 
		}
	 public void close_Browser() {
		 driver.close();
	 }

}
