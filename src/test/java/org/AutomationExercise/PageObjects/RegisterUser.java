package org.AutomationExercise.PageObjects;

import org.AutomationExercise.Base.BaseConfiguration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class RegisterUser extends BaseConfiguration {
	WebDriver driver;
	  public RegisterUser(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	  
	  
    @FindBy(xpath = "//a[text()=' Home']")
     WebElement homeButton;
	
    @FindBy(xpath = "//a[text()=' Signup / Login']")
     WebElement signupAndLogin;
	
    @FindBy(xpath = "//input[@placeholder='Name']")
     WebElement name;
    
    @FindBy(xpath = "(//input[@name='email'])[2]")
     WebElement emailAddress;
    
    @FindBy(xpath = "//button[text()='Signup']")
     WebElement signupButton;
	
    @FindBy(xpath = "//b[text()='Enter Account Information']")
     WebElement enterAccountElementInfo;
	
    @FindBy(xpath = "//label[text()='Title']")
     WebElement mTitle;
	
    @FindBy(xpath = "//input[@id='password']")
     WebElement enterPassword;
	
    @FindBy(xpath = "//select[@id='days']")
     WebElement daySelect;
	
    @FindBy(xpath = "//select[@id='months']")
     WebElement monthSelect;
	
    @FindBy(xpath = "//select[@id='years']")
     WebElement yearSelect;
	
    @FindBy(xpath = "//input[@id='newsletter']")
     WebElement signupForNewsletterCheckbox;
	
    @FindBy(xpath = "//input[@id='optin']")
     WebElement receiveSpecialOfferCheckbox;
	
    @FindBy(xpath = "//input[@id='first_name']")
     WebElement firstName;
	
    @FindBy(xpath = "//input[@id='last_name']")
     WebElement lastName;
	
    @FindBy(xpath = "//input[@id='company']")
     WebElement company;
	
    @FindBy(xpath = "//input[@id='address1']")
     WebElement address;
	
    @FindBy(xpath = "//input[@id='state']")
     WebElement state;
	
    @FindBy(xpath = "//input[@id='city']")
     WebElement city;
	
    @FindBy(xpath = "//input[@id='zipcode']")
     WebElement zipcode;
	
    @FindBy(xpath = "//input[@id='mobile_number']")
     WebElement mobileNumber;
	
    @FindBy(xpath = "//button[text()='Create Account']")
     WebElement createAccount;
	
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
     WebElement accountCreatedMessage;
	
    @FindBy(xpath = "//a[text()='Continue']")
     WebElement continueButton;
	
    @FindBy(xpath = "//b[normalize-space()='JYOTIRAM']]")
     WebElement loggedAsUsername;
	
    @FindBy(xpath = "//a[text()=' Delete Account']")
     WebElement deleteAccountButton;
	
    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
     WebElement accountDeletedMessage;
	
    @FindBy(xpath = "//a[text()='Continue'] ")
     WebElement continueLink;

  

    public void verifyRegisterSuccess() throws InterruptedException {
    	 
    	WebDriverWait wait = new WebDriverWait(driver, 30);
         Assert.assertTrue(homeButton.isDisplayed());
         
         WebElement signupAndLoginElement = wait.until(ExpectedConditions.elementToBeClickable(signupAndLogin));
         signupAndLoginElement.click();
      
         
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
         
         name.sendKeys(readProperty("name"));
         emailAddress.sendKeys(readProperty("email"));
         
         driver.navigate().refresh();
         try {
        	 name.sendKeys(readProperty("name"));
        	 emailAddress.sendKeys(readProperty("email"));
        	 
         }catch(StaleElementReferenceException e){
        	 name.sendKeys(readProperty("name"));
        	 emailAddress.sendKeys(readProperty("email"));
         }
         signupButton.click();
        
         driver.navigate().refresh();
         try {
        	 
              mTitle.click();
              
         }catch(StaleElementReferenceException e ) {
        	 
              mTitle.click();   
         }
         
         enterPassword.sendKeys(readProperty("password"));
         
         Select daySelectDropdown = new Select(daySelect);
         daySelectDropdown.selectByValue("25");
         
         Select monthSelectDropdown = new Select(monthSelect);
         monthSelectDropdown.selectByVisibleText("March");
         
         Select yearSelectDropdown = new Select(yearSelect);
         yearSelectDropdown.selectByValue("2017");
         
         JavascriptExecutor js1 = (JavascriptExecutor) driver;
         js1.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
         
         signupForNewsletterCheckbox.click();
         receiveSpecialOfferCheckbox.click();
         
         firstName.sendKeys(readProperty("firstname"));
         
         lastName.sendKeys(readProperty("lastname"));
         
         company.sendKeys(readProperty("company"));
         
         address.sendKeys(readProperty("address"));
         
         state.sendKeys(readProperty("state"));
         
         city.sendKeys(readProperty("City"));
         
         zipcode.sendKeys(readProperty("ZipC"));
         
         mobileNumber.sendKeys(readProperty("mobilenumber"));
         
         WebElement createAccountElement = wait.until(ExpectedConditions.elementToBeClickable(createAccount));
         createAccountElement.click();
         
         
         Assert.assertTrue(accountCreatedMessage.isDisplayed());
         
       
         WebElement continueButtonElement = wait.until(ExpectedConditions.elementToBeClickable(continueButton));
         continueButtonElement.click();
       
         
         JavascriptExecutor js3 = (JavascriptExecutor) driver;
         js3.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
         try {
        	 continueButton.click();
        	 
         }catch(StaleElementReferenceException e) {
        	 continueButton.click();
         }
         
        
         JavascriptExecutor js4 = (JavascriptExecutor) driver;
         js4.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        
         WebElement deleteAccountButtonElement = wait.until(ExpectedConditions.elementToBeClickable(deleteAccountButton));
         deleteAccountButtonElement.click();
        	
        	 
       
         
         Assert.assertTrue(accountDeletedMessage.isDisplayed());
         WebElement continueLinkElement = wait.until(ExpectedConditions.elementToBeClickable(continueLink));
         continueLinkElement.click();
         
    }
}
