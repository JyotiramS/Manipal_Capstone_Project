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
	
	@Parameters("port")
	@BeforeTest
	public void setUp(String port) throws MalformedURLException, InterruptedException {
		BaseClass.initializeProp("Configuration/config.properties"); 
		launchBrowser(port);
		loginVcredentialObj=new ValidLoginCredentials(driver);
	}

	@Test
	public void validLoginTest() throws InterruptedException {
		
		loginVcredentialObj.verifyLoginCredentials();
	}
	
    @AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");
}

}

