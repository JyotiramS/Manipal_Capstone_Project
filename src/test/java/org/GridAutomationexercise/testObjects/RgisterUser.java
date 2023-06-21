package org.GridAutomationexercise.testObjects;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.automationexercise.baseFramework.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

 
public class RgisterUser extends BaseClass {
	WebDriver driver;
    public RgisterUser(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
	
	
	By HomeButton=By.xpath("//a[text()=' Home']");
	
	By SignupandLogin=By.xpath("//a[text()=' Signup / Login']");
	
  //  By NewUserSignup=By.xpath("//h2[normalize-space()='New User Signup!']");
    
    By Name=By.xpath("//input[@placeholder='Name']");
    
    By EmailAddress=By.xpath("(//input[@name='email'])[2]");
    
	By signupButton=By.xpath("//button[text()='Signup']");
	
	By enterAccountElementInfo=By.xpath("//b[text()='Enter Account Information']");
	
   	By mTitle=By.xpath("//label[text()='Title']");
   	
	By EnterPassword=By.xpath("//input[@id='password']");
	
	By DaySelect=By.xpath("//select[@id='days']");
	
	By MonthSelect=By.xpath("//select[@id='months']");
	
	By YearSelect=By.xpath("//select[@id='years']");
	
	By Signupfornewslettercheckbox=By.xpath("//input[@id='newsletter']");
	
	By Receivespecialoffercheckbox=By.xpath("//input[@id='optin']");
	
	By FirstName=By.xpath("//input[@id='first_name']");
	
	By Lastname=By.xpath("//input[@id='last_name']");
	
	By Company=By.xpath("//input[@id='company']");
	
	By Address=By.xpath("//input[@id='address1']");
	
	By State=By.xpath("//input[@id='state']");
	
	By city=By.xpath("//input[@id='city']");
	
	By zipcode=By.xpath("//input[@id='zipcode']");
	
	By Mobilenumber=By.xpath("//input[@id='mobile_number']");
	
	By createAccount=By.xpath("//button[text()='Create Account']");
	
	By AccountCreatedMessage=By.xpath("//b[normalize-space()='Account Created!']");
  
	By continuebutton=By.xpath("//a[text()='Continue']");
	
	By LoggedinasUsername=By.xpath("//b[normalize-space()='JYOTIRAM']]");
	
	By DeleteAccountButton=By.xpath("//a[text()=' Delete Account']");
  
	
	By AccountDeletedMessege=By.xpath ("//b[normalize-space()='Account Deleted!']");
  
	
	By Continue=By.xpath("//a[text()='Continue'] ");
   
	

	public void verifyRegisterSuccess() throws InterruptedException {
		
	  WebDriverWait wait = new WebDriverWait(driver, 20);
		
	    Assert.assertTrue( driver.findElement(HomeButton).isDisplayed());
	    
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(SignupandLogin).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		driver.findElement(Name).sendKeys(readProperty("name"));
		
		
		driver.findElement(EmailAddress).sendKeys(readProperty("email"));
	//	WebElement signupButtonElement = wait.until(ExpectedConditions.elementToBeClickable(signupButton));
      //  signupButtonElement.click();
		driver.findElement(signupButton).click();
		
	  //  Assert.assertTrue(driver.findElement(NewUserSignup).isDisplayed());
      WebElement mTitleElement = wait.until(ExpectedConditions.elementToBeClickable(mTitle));
      mTitleElement.click();
		//driver.findElement(mTitle).click();
		
		driver.findElement(EnterPassword).sendKeys(readProperty("password"));
		
		Select daySelect = new Select(driver.findElement(DaySelect));
        daySelect.selectByValue("25");

        Select monthSelect = new Select(driver.findElement(MonthSelect));
        monthSelect.selectByVisibleText("March");

        Select yearSelect = new Select(driver.findElement(YearSelect));
        yearSelect.selectByValue("2017");
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
       js1.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
      
        driver.findElement(Signupfornewslettercheckbox).click();
       
        driver.findElement(Receivespecialoffercheckbox).click();
       
        driver.findElement(FirstName).sendKeys(readProperty("firstname"));
       
        driver.findElement(Lastname).sendKeys(readProperty("lastname"));
       
        driver.findElement(Company).sendKeys(readProperty("company"));
      
        driver.findElement(Address).sendKeys(readProperty("address"));
        
        driver.findElement(State).sendKeys(readProperty("state"));
       
        driver.findElement(city).sendKeys(readProperty("City"));
        
        driver.findElement(zipcode).sendKeys(readProperty("ZipC"));
      
        driver.findElement(Mobilenumber).sendKeys(readProperty("mobilenumber"));
      WebElement createAccountElement = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(createAccount)));
      createAccountElement.click();
        
      // driver.findElement(createAccount).click();
        
        Assert.assertTrue(driver.findElement(AccountCreatedMessage).isDisplayed());
        
        driver.findElement(continuebutton).click();
   
     //Thread.sleep(2000);
       
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        driver.findElement(continuebutton).click();
       JavascriptExecutor js4 = (JavascriptExecutor) driver;
      js4.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
     // WebElement DeleteAccountButtonElement = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(DeleteAccountButton)));
     //  DeleteAccountButtonElement.click();
        driver.findElement(DeleteAccountButton).click();
        Assert.assertTrue(driver.findElement(AccountDeletedMessege).isDisplayed());
        driver.findElement(Continue).click();
        
     
		
	}



}

