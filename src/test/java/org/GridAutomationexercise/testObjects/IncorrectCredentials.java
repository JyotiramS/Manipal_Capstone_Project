package org.GridAutomationexercise.testObjects;

import java.util.concurrent.TimeUnit;

import org.automationexercise.baseFramework.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class IncorrectCredentials extends BaseClass {
	WebDriver driver;
   

	public IncorrectCredentials( WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
        PageFactory.initElements(driver,this);
	}


	public void ValidCredentials(WebDriver driver){
        
    }
	
    By HomeButton=By.xpath("//a[text()=' Home']");
	
	By SignupandLogin=By.xpath("//a[text()=' Signup / Login']");
	
	By loginEmail=By.xpath("//input[@data-qa='login-email']");
	    
	By EnterPassword2=By.xpath("//input[@placeholder='Password']");
	
	By loginbutton=By.xpath("//button[normalize-space()='Login']");


public void verificationInvalidCredentials() {
	
	
		
	    Assert.assertTrue( driver.findElement(HomeButton).isDisplayed());
	    
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(SignupandLogin).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
	    
        driver.findElement(loginEmail).sendKeys(readProperty("email1"));
        driver.findElement(EnterPassword2).sendKeys(readProperty("password1"));
		
		driver.findElement(loginbutton).click();
	
}

}
