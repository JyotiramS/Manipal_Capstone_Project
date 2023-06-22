package org.AutomationExercise.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import org.AutomationExercise.Base.BaseConfiguration;

public class SearchProducts extends BaseConfiguration {
	WebDriver driver;
	public SearchProducts(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
 
	@FindBy(xpath = "//a[text()=' Home']")
     WebElement homeButton;

    @FindBy(xpath = "//a[text()=' Products']")
     WebElement productButton;

    @FindBy(xpath = "//input[@id='search_product']")
     WebElement searchProductInput;

    @FindBy(xpath = "//button[@id='submit_search']")
     WebElement searchButton;

    @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
     WebElement addProduct1;

    @FindBy(xpath = "(//a[text()='Add to cart'])[3]")
     WebElement addProduct2;

    @FindBy(xpath = "(//a[text()='Add to cart'])[5]")
     WebElement addProduct3;

    @FindBy(xpath = "(//a[text()='Add to cart'])[7]")
     WebElement addProduct4;

    @FindBy(xpath = "(//a[text()='Add to cart'])[9]")
     WebElement addProduct5;

    @FindBy(xpath = "(//a[text()='Add to cart'])[11]")
     WebElement addProduct6;

    @FindBy(xpath = "(//a[text()='Add to cart'])[13]")
     WebElement addProduct7;

    @FindBy(xpath = "(//a[text()='Add to cart'])[15]")
     WebElement addProduct8;

    @FindBy(xpath = "(//a[text()='Add to cart'])[17]")
     WebElement addProduct9;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
     WebElement continueShoppingButton;

    @FindBy(xpath = "//a[text()=' Cart']")
     WebElement cartButton;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
     WebElement signupLoginButton;

    @FindBy(xpath = "//h2[text()='Login to your account']")
     WebElement loginTitle;

    @FindBy(xpath = "(//input[@name='email'])[1]")
     WebElement emailInput;

    @FindBy(xpath = "//input[@name='password']")
     WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Login']")
     WebElement loginButton;

    @FindBy(xpath = "//a[text()=' Cart']")
     WebElement cartButton2;

    

    public void verificationOfSearchProduct() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        Assert.assertTrue(homeButton.isDisplayed());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        productButton.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");

        WebElement searchProductElement = wait.until(ExpectedConditions.elementToBeClickable(searchProductInput));
        searchProductElement.sendKeys("dress");
        searchButton.click();

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        Actions pc1 = new Actions(driver);

        pc1.moveToElement(addProduct1).click().build().perform();
        continueShoppingButton.click();

        pc1.moveToElement(addProduct2).click().build().perform();
        continueShoppingButton.click();

        pc1.moveToElement(addProduct3).click().build().perform();
        continueShoppingButton.click();

        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        pc1.moveToElement(addProduct4).click().build().perform();
        continueShoppingButton.click();

        pc1.moveToElement(addProduct5).click().build().perform();
        continueShoppingButton.click();

        pc1.moveToElement(addProduct6).click().build().perform();
        continueShoppingButton.click();

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        pc1.moveToElement(addProduct7).click().build().perform();
        continueShoppingButton.click();

        pc1.moveToElement(addProduct8).click().build().perform();
        continueShoppingButton.click();

        pc1.moveToElement(addProduct9).click().build().perform();
        continueShoppingButton.click();

        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        cartButton.click();
        signupLoginButton.click();
        emailInput.sendKeys(readProperty("email"));
        passwordInput.sendKeys(readProperty("password"));
        loginButton.click();
        cartButton2.click();
    }
}
