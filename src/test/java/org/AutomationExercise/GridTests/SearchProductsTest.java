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
	   
	    @Parameters("port")
		@BeforeTest
		public void setUp(String port) throws MalformedURLException, InterruptedException {
			BaseClass.initializeProp("Configuration/config.properties"); 
			launchBrowser(port);
			removeProductsObj=new SearchProducts(driver);
		}

		@Test
		public void searchProductTest()   {
			try {
				removeProductsObj.verificationOfSearchProduct();
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
