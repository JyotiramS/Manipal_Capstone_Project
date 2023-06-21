package org.AutomationExercieseTestScripts;

import org.automationexercise.baseFramework.BaseClass;
import org.automationexercise.testObjects.VerifyRemoveProductsFromCart;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase4  extends BaseClass {
	

	    public VerifyRemoveProductsFromCart removeProductsObj=new VerifyRemoveProductsFromCart();
	   
	
	@BeforeTest
	public void setUp() {
		BaseClass.initializeProp("Configuration/config.properties");  
	}

	@Test
	public void testscenario() throws InterruptedException {
		launchBrowser();
		removeProductsObj.verificationOfremoveProduct();
	}
	
@AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");
}

}
