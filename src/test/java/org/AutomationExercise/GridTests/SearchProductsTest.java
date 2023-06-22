package org.AutomationExercise.GridTests;

import java.net.MalformedURLException;

import org.AutomationExercise.PageObjects.SearchProducts;
import org.Grid.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchProductsTest extends BaseClass{
	
	 public SearchProducts removeProductsObj;
	   
	    @Parameters("browser")
		@BeforeTest
		public void setUp(String browser) throws MalformedURLException {
			BaseClass.initializeProp("Configuration/config.properties"); 
			launchBrowser(browser);
			removeProductsObj=new SearchProducts(driver);
		}

		@Test
		public void testscenario() throws InterruptedException {
			removeProductsObj.verificationOfSearchProduct();
		}
		
	@AfterMethod()
		public void closeBrowser(){
			 driver.quit();
	            System.out.println("Browser Closed");
	}

}
