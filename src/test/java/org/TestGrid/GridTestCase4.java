package org.TestGrid;

import java.net.MalformedURLException;

import org.GridAutomationexercise.testObjects.RemoveProductsFromCart;
import org.GridAutomationexercise.testObjects.ValidCredentials;
import org.automationexercise.baseFramework.BaseClass;
import org.automationexercise.testObjects.VerifyRemoveProductsFromCart;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GridSource.BaseConfiguration;

public class GridTestCase4  extends BaseConfiguration {
	

	public RemoveProductsFromCart removeProductObj;
	WebDriver driver;
	
	@Parameters({"port"})
	@BeforeTest
	public void SetUp(String port) throws MalformedURLException {
		BaseClass.initializeProp("Configuration/config.properties");  
		driver= setUp(port);
		removeProductObj=new RemoveProductsFromCart(driver);
	}

	@Test
	public void test2() throws InterruptedException {
		BaseClass.launchBrowser();
		removeProductObj.verificationOfremoveProduct();
	}

}
