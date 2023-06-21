package org.AutomationExercieseTestScripts;

import org.automationexercise.baseFramework.BaseClass;
import org.automationexercise.testObjects.VerifyAddReviewOnProduct;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase6 extends BaseClass {
	
    
    public VerifyAddReviewOnProduct addReviewProductObj=new VerifyAddReviewOnProduct();

@BeforeTest
public void setUp() {
	BaseClass.initializeProp("Configuration/config.properties");  
}

@Test
public void testscenario() throws InterruptedException {
	launchBrowser();
	addReviewProductObj.verificationOfAddReviewProduct();
}

@AfterMethod()
public void closeBrowser(){
	 driver.quit();
        System.out.println("Browser Closed");
}
}
