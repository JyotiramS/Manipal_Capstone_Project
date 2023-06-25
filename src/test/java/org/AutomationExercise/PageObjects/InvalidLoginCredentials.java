package org.AutomationExercise.PageObjects;

import java.util.concurrent.TimeUnit;

import org.AutomationExercise.Base.BaseConfiguration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class InvalidLoginCredentials extends BaseConfiguration {
	
	WebDriver driver;
    public InvalidLoginCredentials(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        
    } 
    @FindBy(xpath = "//a[text()=' Home']")
     WebElement homeButton;
	
	@FindBy(xpath = "//a[text()=' Signup / Login']")
     WebElement signupAndLogin;
	
	@FindBy(xpath = "//input[@data-qa='login-email']")
     WebElement loginEmail;
	    
	@FindBy(xpath = "//input[@placeholder='Password']")
     WebElement enterPassword;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
     WebElement loginButton;

   

    public void verificationInvalidCredentials() {
        Assert.assertTrue(homeButton.isDisplayed());
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        signupAndLogin.click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
	    driver.navigate().refresh();
        try {
       	 
        	 loginEmail.sendKeys(readProperty("email3"));
             enterPassword.sendKeys(readProperty("password3"));
             
        }catch(StaleElementReferenceException e ) {
       	 
        	 loginEmail.sendKeys(readProperty("email3"));
             enterPassword.sendKeys(readProperty("password3")); 
        }
       
        loginButton.click();
    }}