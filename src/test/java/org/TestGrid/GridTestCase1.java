package org.TestGrid;

import java.net.MalformedURLException;

import org.GridAutomationexercise.testObjects.IncorrectCredentials;
import org.automationexercise.baseFramework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GridSource.BaseConfiguration;

public class GridTestCase1 extends BaseConfiguration {
	
	public IncorrectCredentials loginIvcredentialObj;
	WebDriver driver;
	
	@Parameters({"port"})
	@BeforeTest
	public void SetUp(String port) throws MalformedURLException {
		BaseClass.initializeProp("Configuration/config.properties"); 
		
		driver= setUp(port);
		loginIvcredentialObj= new IncorrectCredentials(driver);
	}

	@Test
	public void test2() {
		BaseClass.launchBrowser();
		loginIvcredentialObj.verificationInvalidCredentials();
	}
	

}


