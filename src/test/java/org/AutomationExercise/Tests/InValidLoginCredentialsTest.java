package org.AutomationExercise.Tests;

 import java.io.IOException;

import org.AutomationExercise.Base.BaseConfiguration;
import org.AutomationExercise.PageObjects.InvalidLoginCredentials;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InValidLoginCredentialsTest extends BaseConfiguration{
	
	WebDriver driver;
	 public InvalidLoginCredentials loginIvcredentialObj;
	
	 
	@BeforeTest
	public void setUp() throws InterruptedException{
		BaseConfiguration.initializeProp("Configuration/config.properties");
		driver = launchBrowser();
		loginIvcredentialObj=new InvalidLoginCredentials(driver);
	}

	@Test
	public void invalidLoginCredentialsTest()throws  IOException, InterruptedException  {
		
		loginIvcredentialObj.verificationInvalidCredentials();;
	}
	
@AfterMethod()
	public void closeBrowser(){
		 driver.quit();
           System.out.println("Browser Closed");
}
}


