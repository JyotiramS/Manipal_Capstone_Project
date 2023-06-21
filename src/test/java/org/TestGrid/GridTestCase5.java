package org.TestGrid;

import java.net.MalformedURLException;

import org.GridAutomationexercise.testObjects.SearchProduct;
import org.automationexercise.baseFramework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GridSource.BaseConfiguration;

public class GridTestCase5  extends BaseConfiguration {
	
	public SearchProduct searchProductObj;
	WebDriver driver;
	
	@Parameters({"port"})
	@BeforeTest
	public void SetUp(String port) throws MalformedURLException {
		BaseClass.initializeProp("Configuration/config.properties");  
		driver= setUp(port);
		searchProductObj= new SearchProduct(driver);
	}

	@Test
	public void test2() throws InterruptedException {
		BaseClass.launchBrowser();
		searchProductObj.verificationOfSearchProduct();
	}
}
