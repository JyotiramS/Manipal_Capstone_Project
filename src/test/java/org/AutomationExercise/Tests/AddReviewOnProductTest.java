package org.AutomationExercise.Tests;

import java.io.IOException;

import org.AutomationExercise.Base.BaseConfiguration;
import org.AutomationExercise.PageObjects.AddReviewOnProduct;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddReviewOnProductTest extends BaseConfiguration {
	WebDriver driver;
    public AddReviewOnProduct addReviewProductObj;

    @BeforeTest
    public void setUp() throws IOException {
        initializeProp("Configuration/config.properties");
        driver = launchBrowser();
        addReviewProductObj = new AddReviewOnProduct(driver);
    }


    @Test
    public void addReviewTest() throws  IOException, InterruptedException{
    	
        addReviewProductObj.verificationOfAddReviewProduct();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
        System.out.println("Browser Closed");
    }
}
