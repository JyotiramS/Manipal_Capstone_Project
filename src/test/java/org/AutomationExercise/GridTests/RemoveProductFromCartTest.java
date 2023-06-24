package org.AutomationExercise.GridTests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.AutomationExercise.PageObjects.RemoveProductFromCart;
import org.Grid.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RemoveProductFromCartTest  extends BaseClass {
	

	    public RemoveProductFromCart removeProductsObj;
	   
	@Parameters("port")
	@BeforeTest
	public void setUp(String port) throws MalformedURLException {
		BaseClass.initializeProp("Configuration/config.properties"); 
		launchBrowser(port);
		removeProductsObj=new RemoveProductFromCart(driver);
	}

	@Test
	public void removeProductTest() throws IOException, InterruptedException {
		
		removeProductsObj.verificationOfremoveProduct();
	}
	
/*@AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");
}*/

}
