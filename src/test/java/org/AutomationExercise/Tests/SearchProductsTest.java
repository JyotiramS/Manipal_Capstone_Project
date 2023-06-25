package org.AutomationExercise.Tests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.AutomationExercise.Base.BaseConfiguration;
import org.AutomationExercise.PageObjects.SearchProducts;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchProductsTest extends BaseConfiguration{
	
	 public SearchProducts removeProductsObj;
	   
	    
		@BeforeTest
		public void setUp() throws MalformedURLException {
			BaseConfiguration.initializeProp("Configuration/config.properties"); 
			launchBrowser();
			removeProductsObj=new SearchProducts(driver);
		}



		@Test
		public void searchProductTest() throws IOException, InterruptedException {
			removeProductsObj.verificationOfSearchProduct();
		}
		
	 @AfterMethod()
		public void closeBrowser(){
			 driver.quit();
	            System.out.println("Browser Closed");
	}

}
