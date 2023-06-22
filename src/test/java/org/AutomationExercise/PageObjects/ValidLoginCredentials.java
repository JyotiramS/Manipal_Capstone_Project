package org.AutomationExercise.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import org.AutomationExercise.Base.BaseConfiguration;

public class ValidLoginCredentials extends BaseConfiguration {

	WebDriver driver;
	public ValidLoginCredentials(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()=' Home']")
     WebElement homeButton;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
     WebElement signupLoginButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
     WebElement nameInput;

    @FindBy(xpath = "(//input[@name='email'])[2]")
     WebElement emailAddressInput;

    @FindBy(xpath = "//button[text()='Signup']")
     WebElement signupButton;

    @FindBy(xpath = "//label[text()='Title']")
     WebElement titleLabel;

    @FindBy(xpath = "//input[@id='password']")
     WebElement enterPasswordInput;

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
     WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='last_name']")
     WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='company']")
     WebElement companyInput;

    @FindBy(xpath = "//input[@id='address1']")
     WebElement addressInput;

    @FindBy(xpath = "//input[@id='state']")
     WebElement stateInput;

    @FindBy(xpath = "//input[@id='city']")
     WebElement cityInput;

    @FindBy(xpath = "//input[@id='zipcode']")
     WebElement zipcodeInput;

    @FindBy(xpath = "//input[@id='mobile_number']")
     WebElement mobileNumberInput;

    @FindBy(xpath = "//button[text()='Create Account']")
     WebElement createAccountButton;

    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
     WebElement accountCreatedMessage;

    @FindBy(xpath = "//a[text()='Continue']")
     WebElement continueButton;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
     WebElement logoutButton;

    @FindBy(xpath = "//input[@data-qa='login-email']")
     WebElement loginEmailInput;

    @FindBy(xpath = "//input[@placeholder='Password']")
     WebElement enterPasswordInput2;
    @FindBy(xpath="//button[text()='Login']")
    WebElement loginbutton;

    @FindBy(xpath = "//a[text()=' Delete Account']")
     WebElement deleteAccountButton;

    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
     WebElement accountDeletedMessage;

    

    public void verifyLoginCredentials() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        Assert.assertTrue(homeButton.isDisplayed());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        signupLoginButton.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");

        nameInput.sendKeys(readProperty("name"));
        emailAddressInput.sendKeys(readProperty("email"));
        signupButton.click();

        WebElement titleLabelElement = wait.until(ExpectedConditions.elementToBeClickable(titleLabel));
        titleLabelElement.click();

        enterPasswordInput.sendKeys(readProperty("password"));

        Select daySelect = new Select(this.daySelect);
        daySelect.selectByValue("25");

        Select monthSelect = new Select(this.monthSelect);
        monthSelect.selectByVisibleText("March");

        Select yearSelect = new Select(this.yearSelect);
        yearSelect.selectByValue("2017");

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");

        signupForNewsletterCheckbox.click();
        receiveSpecialOfferCheckbox.click();
        firstNameInput.sendKeys(readProperty("firstname"));
        lastNameInput.sendKeys(readProperty("lastname"));
        companyInput.sendKeys(readProperty("company"));
        addressInput.sendKeys(readProperty("address"));
        stateInput.sendKeys(readProperty("state"));
        cityInput.sendKeys(readProperty("City"));
        zipcodeInput.sendKeys(readProperty("ZipC"));
        mobileNumberInput.sendKeys(readProperty("mobilenumber"));

        WebElement createAccountButtonElement = wait.until(ExpectedConditions.elementToBeClickable(createAccountButton));
        createAccountButtonElement.click();

        Assert.assertTrue(accountCreatedMessage.isDisplayed());
        continueButton.click();

        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        continueButton.click();

        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");

        logoutButton.click();

        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        loginEmailInput.sendKeys(readProperty("email"));
        enterPasswordInput2.sendKeys(readProperty("password"));
        loginbutton.click();
        deleteAccountButton.click();
        Assert.assertTrue(accountDeletedMessage.isDisplayed());
    }
}
