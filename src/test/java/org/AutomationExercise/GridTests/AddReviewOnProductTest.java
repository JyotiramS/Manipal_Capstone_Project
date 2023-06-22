package org.AutomationExercise.GridTests;



import java.net.MalformedURLException;

import org.AutomationExercise.PageObjects.AddReviewOnProduct;
import org.Grid.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class AddReviewOnProductTest extends BaseClass {
	
	
	public AddReviewOnProduct addReviewProductObj;

	@Parameters("browser")
    @BeforeTest
    public void setUp(String browser) throws MalformedURLException {
		 
        BaseClass.initializeProp("Configuration/config.properties");
        launchBrowser(browser);
        addReviewProductObj=  new AddReviewOnProduct(driver);
    }

    @Test
    public void testscenario() throws InterruptedException {
    	
        addReviewProductObj.verificationOfAddReviewProduct();
    }

    @AfterMethod()
    public void closeBrowser() {
        driver.quit();
        System.out.println("Browser Closed");
    }
}
