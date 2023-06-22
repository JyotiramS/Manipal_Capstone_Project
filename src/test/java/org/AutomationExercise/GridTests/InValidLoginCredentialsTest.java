package org.AutomationExercise.GridTests;

 import java.net.MalformedURLException;

import org.AutomationExercise.PageObjects.InvalidLoginCredentials;
import org.Grid.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InValidLoginCredentialsTest extends BaseClass{
	 public InvalidLoginCredentials loginIvcredentialObj;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) throws MalformedURLException {
		BaseClass.initializeProp("Configuration/config.properties");
		launchBrowser(browser);
		loginIvcredentialObj=new InvalidLoginCredentials(driver);
	}

	@Test
	public void testscenario3() throws InterruptedException {
		
		loginIvcredentialObj.verificationInvalidCredentials();;
	}
	
@AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");
}
}


