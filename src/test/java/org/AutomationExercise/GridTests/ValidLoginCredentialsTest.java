package org.AutomationExercise.GridTests;

import java.net.MalformedURLException;

import org.AutomationExercise.PageObjects.ValidLoginCredentials;
import org.Grid.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidLoginCredentialsTest extends BaseClass{
	public ValidLoginCredentials loginVcredentialObj;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) throws MalformedURLException {
		BaseClass.initializeProp("Configuration/config.properties"); 
		launchBrowser(browser);
		loginVcredentialObj=new ValidLoginCredentials(driver);
	}

	@Test
	public void testscenario2() throws InterruptedException {
		
		loginVcredentialObj.verifyLoginCredentials();
	}
	
@AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");
}

}

