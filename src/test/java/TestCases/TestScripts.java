package TestCases;


import org.baseFramework.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.VerificationOfRgisterUser;

public class TestScripts extends BaseClass {
	
	
	public VerificationOfRgisterUser verifyRegObj= new VerificationOfRgisterUser();
	@BeforeTest
	public void setUp() {
		
		BaseClass.initializeProp("Configuration/config.properties");
	      
	}

	
	@Test
	public void test1() {
		launchBrowser();
		verifyRegObj.verifyRegisterSuccess();
	}
	
@AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");

}
}


