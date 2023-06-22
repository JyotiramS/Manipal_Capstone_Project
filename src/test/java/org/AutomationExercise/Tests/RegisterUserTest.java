package org.AutomationExercise.Tests;

import java.net.MalformedURLException;

import org.AutomationExercise.Base.BaseConfiguration;
import org.AutomationExercise.PageObjects.RegisterUser;
import org.Grid.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterUserTest extends BaseConfiguration {
	
	
	public RegisterUser registeruserOBJ ;
	 
	@Parameters("browser")
	@BeforeTest
	public void setUp() throws MalformedURLException  {
		BaseConfiguration.initializeProp("Configuration/config.properties");
		launchBrowser();
		registeruserOBJ= new RegisterUser(driver);
		
	}

	@Test
	public void testscenario1() throws InterruptedException {
		
		registeruserOBJ.verifyRegisterSuccess();
		
	}
	@AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");
}

	

}


