package org.AutomationExercise.GridTests;

 import java.io.IOException;
import java.net.MalformedURLException;

import org.AutomationExercise.PageObjects.InvalidLoginCredentials;
import org.Grid.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InValidLoginCredentialsTest extends BaseClass{
	 public InvalidLoginCredentials loginIvcredentialObj;
	
	@Parameters("port")
	@BeforeTest
	public void setUp(String port) throws MalformedURLException {
		BaseClass.initializeProp("Configuration/config.properties");
		launchBrowser(port);
		loginIvcredentialObj=new InvalidLoginCredentials(driver);
	}

	@Test
	public void loginIvCredentialTest() throws IOException, InterruptedException {
		
		loginIvcredentialObj.verificationInvalidCredentials();;
	}
	
  /*@AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");
}*/
}


