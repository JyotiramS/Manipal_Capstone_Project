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
	 
	@Parameters("port")
	@BeforeTest
	public void setUp(String port) throws MalformedURLException, InterruptedException  {
		BaseClass.initializeProp("Configuration/config.properties");
		launchBrowser(port);
		registeruserOBJ=new RegisterUser(driver);
		
	}

	@Test
	public void registerUserTest()  {
		
		try {
			registeruserOBJ.verifyRegisterSuccess();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");
}

	

}


