package org.AutomationExercise.Tests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.AutomationExercise.Base.BaseConfiguration;
import org.AutomationExercise.PageObjects.ValidLoginCredentials;
import org.Grid.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidLoginCredentialsTest extends BaseConfiguration{
	public ValidLoginCredentials loginVcredentialObj;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp() throws MalformedURLException {
		BaseConfiguration.initializeProp("Configuration/config.properties"); 
		launchBrowser();
		loginVcredentialObj=new ValidLoginCredentials(driver);
	}

	@Test
	public void testscenario2() throws IOException, InterruptedException {
		
		loginVcredentialObj.verifyLoginCredentials();
	}
	
 /*  @AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");
}*/

}

