package org.AutomationExercieseTestScripts;

import org.automationexercise.baseFramework.BaseClass;
import org.automationexercise.testObjects.VerificationOfSearchProduct;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase5 extends BaseClass{
	
	 public VerificationOfSearchProduct removeProductsObj=new VerificationOfSearchProduct();
	   
		
		@BeforeTest
		public void setUp() {
			BaseClass.initializeProp("Configuration/config.properties");  
		}

		@Test
		public void testscenario() throws InterruptedException {
			launchBrowser();
			removeProductsObj.verificationOfSearchProduct();
		}
		
	@AfterMethod()
		public void closeBrowser(){
			 driver.quit();
	            System.out.println("Browser Closed");
	}

}
