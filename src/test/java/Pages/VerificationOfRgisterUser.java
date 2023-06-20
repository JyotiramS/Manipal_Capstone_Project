package Pages;
import org.baseFramework.BaseClass;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

 
public class VerificationOfRgisterUser extends BaseClass {
	
	
	By HomeButton=By.xpath("//a[normalize-space()='Home']");
	
	By SignupandLogin=By.xpath("//a[normalize-space()='Signup / Login']");
	
    By NewUserSignup=By.xpath("//h2[normalize-space()='New User Signup!']");
    
    By Name=By.xpath("//input[@placeholder='Name']");
    
    By EmailAddress=By.xpath("//input[@data-qa='signup-email']");
    
	By signupButton=By.xpath("//button[normalize-space()='Signup']");
	
	By enterAccountElementInfo=By.xpath("//b[normalize-space()='Enter Account Information']");
	
   	By mTitle=By.xpath("//input[@id='id_gender1']");
   	
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
	
	By createAccount=By.xpath("//button[normalize-space()='Create Account']");
	
	//By AccountCreatedMessage=By.xpath("//b[normalize-space()='Account Created!']");
  
	By continuebutton=By.xpath("//a[@class='btn btn-primary']");
	
	//By LoggedinasUsername=By.xpath("//b[normalize-space()='JYOTIRAM']]");
	
	By DeleteAccountButton=By.xpath("//a[normalize-space()='Delete Account']");
  
	
	//By AccountDeletedMessege=By.xpath ("//b[normalize-space()='Account Deleted!']");
  
	
	By Continue=By.xpath("//a[@class='btn btn-primary']");
   
	

	public void verifyRegisterSuccess() {
		// TODO Auto-generated method stub
		 WebDriverWait wait = new WebDriverWait(driver, 20);
	//	Assert.assertTrue("driver.findElement(HomeButton) 'Homepage is visible'", driver.findElement(HomeButton).isDisplayed());
		driver.findElement(SignupandLogin).click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		driver.findElement(Name).sendKeys(readProperty("name"));
		driver.findElement(EmailAddress).sendKeys(readProperty("email"));
		WebElement signupButtonElement = wait.until(ExpectedConditions.elementToBeClickable(signupButton));
        signupButtonElement.click();
		//driver.findElement(signupButton).click();
		
	//	Assert.assertTrue("enterAccountElementInfo 'New user signup! is visible'", enterAccountElementInfo.isDisplayed());
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
        
        //driver.findElement(createAccount).click();
      // Assert.assertTrue("AccountCreatedMessage 'Account created! is visible'", AccountCreatedMessage.isDisplayed());
       JavascriptExecutor js3 = (JavascriptExecutor) driver;
       js3.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
      
      //  Assert.assertTrue("LoggedinasUsername 'Logged in as username is visible'", LoggedinasUsername.isDisplayed());
        
       // Assert.assertTrue("AccountDeletedMessege 'Account Deleted message is visible'", AccountDeletedMessege.isDisplayed());
        
        
        driver.findElement(continuebutton).click();
       // WebElement continueButtonElement = wait.until(ExpectedConditions.elementToBeClickable(continuebutton));
       // continueButtonElement.click();
        
     
		
	}



}

