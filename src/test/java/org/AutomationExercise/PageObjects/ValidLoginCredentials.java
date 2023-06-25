package org.AutomationExercise.PageObjects;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.AutomationExercise.Base.BaseConfiguration;

public class ValidLoginCredentials extends BaseConfiguration {

	WebDriver driver;
	public ValidLoginCredentials(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	 @FindBy(xpath = "//a[text()=' Home']")
	  WebElement Homepage;
	  
	  @FindBy(xpath="//a[text()=' Signup / Login']")
	  WebElement SignupLoginpage;
	  
	  @FindBy(xpath="//h2[text()='Login to your account']")
	  WebElement logintoyouraccount;
	  
	  @FindBy(xpath="(//input[@name='email'])[1]")
	  WebElement email;
	  
	  @FindBy(xpath="//input[@name='password']")
	  WebElement password;
	  
	  @FindBy(xpath="//button[text()='Login']")
	  WebElement loginbutton;
	  
	  @FindBy(xpath="//a[text()=' Logout']")
	  WebElement logoutbutton;
	  
	  

	  public void verifyLoginCredentials() throws InterruptedException {
		  
		
	    	SignupLoginpage.click();
	  	Assert.assertTrue(logintoyouraccount.isDisplayed());
	  	 driver.navigate().refresh();
         try {
        	 
        	 email.sendKeys(readProperty("email1"));
 	    	password.sendKeys(readProperty("password1"));
              
         }catch(StaleElementReferenceException e ) {
        	 
        	 email.sendKeys(readProperty("email1"));
 	    	password.sendKeys(readProperty("password1"));  
         }
	    	
	    	loginbutton.click();
	    	Thread.sleep(3000);
	    	logoutbutton.click();
    }
}
