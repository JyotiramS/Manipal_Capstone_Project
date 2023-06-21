package org.AutomationExercieseTestScripts;

import org.automationexercise.baseFramework.BaseClass;
import org.automationexercise.testObjects.VerificationOfRgisterUser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass {
	
	
	public VerificationOfRgisterUser verifyRegObj= new VerificationOfRgisterUser();
	   
	@BeforeTest
	public void setUp()  {
		BaseClass.initializeProp("Configuration/config.properties");
		
	}

	@Test
	public void testscenario() throws InterruptedException {
		launchBrowser();
		verifyRegObj.verifyRegisterSuccess();
	}
	@AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");
}

	

}


