package org.TestGrid;

import java.net.MalformedURLException;

import org.GridAutomationexercise.testObjects.RgisterUser;
import org.GridAutomationexercise.testObjects.ValidCredentials;
import org.automationexercise.baseFramework.BaseClass;
import org.automationexercise.testObjects.VerifyLoginIncorrectCredentials;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GridSource.BaseConfiguration;

public class GridTestCase3 extends BaseConfiguration{
	public RgisterUser registerObj;
	WebDriver driver;
	
	@Parameters({"port"})
	@BeforeTest
	public void SetUp(String port) throws MalformedURLException {
		BaseClass.initializeProp("Configuration/config.properties");  
		driver= setUp(port);
		registerObj=new RgisterUser(driver);
	}

	@Test
	public void test2() throws InterruptedException {
		BaseClass.launchBrowser();
		registerObj.verifyRegisterSuccess();
	}
}
