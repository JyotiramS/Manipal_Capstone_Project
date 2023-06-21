package org.AutomationExercieseTestScripts;

import org.automationexercise.baseFramework.BaseClass;
import org.automationexercise.testObjects.VerifyLoginIncorrectCredentials;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase3 extends BaseClass{
	 public VerifyLoginIncorrectCredentials loginIvcredentialObj=new VerifyLoginIncorrectCredentials();
	
	@BeforeTest
	public void setUp() {
		BaseClass.initializeProp("Configuration/config.properties");  
	}

	@Test
	public void testscenario() throws InterruptedException {
		launchBrowser();
		loginIvcredentialObj.verificationInvalidCredentials();;
	}
	
@AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");
}
}
