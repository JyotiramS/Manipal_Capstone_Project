package org.AutomationExercise.GridTests;

import java.net.MalformedURLException;

import org.AutomationExercise.PageObjects.RegisterUser;
import org.Grid.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterUserTest extends BaseClass {
	
	
	public RegisterUser registeruserOBJ ;
	 
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) throws MalformedURLException  {
		BaseClass.initializeProp("Configuration/config.properties");
		launchBrowser(browser);
		registeruserOBJ=new RegisterUser(driver);
		
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


