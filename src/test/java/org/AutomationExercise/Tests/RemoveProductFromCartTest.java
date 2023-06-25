package org.AutomationExercise.Tests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.AutomationExercise.Base.BaseConfiguration;
import org.AutomationExercise.PageObjects.RemoveProductFromCart;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RemoveProductFromCartTest  extends BaseConfiguration {
	

	    public RemoveProductFromCart removeProductsObj;
	   
	
	@BeforeTest
	public void setUp() throws MalformedURLException {
		BaseConfiguration.initializeProp("Configuration/config.properties"); 
		launchBrowser();
		removeProductsObj=new RemoveProductFromCart(driver);
	}

	@Test
	public void removeProductTest() throws  IOException, InterruptedException {
		
		removeProductsObj.verificationOfremoveProduct();
	}
	
   @AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");
}

}
