package com.veevacrm.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


	@CucumberOptions(
	        features = "src\\main\\java\\com\\veevacrm\\features",
	        glue = {"com.veevacrm.stepDefinations"},
	        tags = {"@SmokeTest"},
	        //tags= {"@RegressionTest"},
	       /* format = {
	                "pretty",
	                "html:target/cucumber-reports/cucumber-pretty",
	                "json:target/CucumberTestReport.json",
	                "rerun:target/cucumber-reports/rerun.txt"
	        },
	        		monochrome = true, //display the console output in a proper readable format
	        		strict = true, //it will check if any step is not defined in step definition file
	        		//dryRun = true ,//to check the mapping is proper between feature file and step def file
	        plugin = "json:target/CucumberTestReport.json"*/
	        
			plugin= {
					"pretty",
					"html:target/cucumber-reports/cucumber-pretty",
	                "json:target/CucumberTestReport.json",
	                "rerun:target/cucumber-reports/rerun.txt"
			}
			)
	

	public class TestRunner extends AbstractTestNGCucumberTests{
	    private TestNGCucumberRunner testNGCucumberRunner;
	 
	    @BeforeClass(alwaysRun = true)
	    public void setUpClass() throws Exception {
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }
	 
	    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	    public void feature(CucumberFeatureWrapper cucumberFeature) {
	        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    }
	 
	    @DataProvider
	    public Object[][] features() {
	        return testNGCucumberRunner.provideFeatures();
	    }
	 
	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() throws Exception {
	        testNGCucumberRunner.finish();
	    }
	}
