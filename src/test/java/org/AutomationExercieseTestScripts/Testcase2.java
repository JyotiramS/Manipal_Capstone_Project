package org.AutomationExercieseTestScripts;

import org.automationexercise.baseFramework.BaseClass;
import org.automationexercise.testObjects.VerifyLoginValidCredentials;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase2 extends BaseClass{
	public VerifyLoginValidCredentials loginVcredentialObj=new VerifyLoginValidCredentials();
	
	@BeforeTest
	public void setUp() {
		BaseClass.initializeProp("Configuration/config.properties");  
	}

	@Test
	public void testscenario() throws InterruptedException {
		launchBrowser();
		loginVcredentialObj.verifyLoginCredentials();
	}
	
@AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");
}

}
