package com.veevacrm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.veevacrm.pages.LoginVeeva;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static String calenderStartDate;
	public static String calenderEndDate;
	public static String  sPath=System.getProperty("user.dir");
	
	public TestBase(){
		
		//Logger log = Logger.getLogger("VeevaCRMLogger");
		
		try {
			prop = new Properties();
			//FileInputStream ip = new FileInputStream("E:\\Deepak E Drive\\Selenium\\Selenium Examples\\"+ "com.veevacrm.automation\\src\\main\\java\\com\\veevacrm\\config\\config.properties");
			
			//System.out.println("sPath"+sPath);
			FileInputStream ip = new FileInputStream(sPath+"\\src\\main\\java\\com\\veevacrm\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		System.out.println("browser"+browserName);
		if(browserName.equals("chrome")){
			//System.setProperty("webdriver.chrome.driver","E:\\Deepak E Drive\\Selenium\\Chrome Driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",sPath+"\\src\\main\\java\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dmahapatra\\Desktop\\Form16\\geckodriver-v0.24.0-win64\\geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	public static String Date() {
		        LocalDate startDate = LocalDate.now().plusDays(2);
		        LocalDate endDate = LocalDate.now().plusDays(4);
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		        calenderStartDate=formatter.format(startDate);
		        calenderEndDate=formatter.format(endDate);
		        return "sss";
		    		    
			}  
	
	/*public static void main(String[] args) {
		TestBase tb = new TestBase();
		
}*/
}
