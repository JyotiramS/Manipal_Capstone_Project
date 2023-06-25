package org.AutomationExercise.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.AutomationExercise.Base.BaseConfiguration;

public class SearchProducts extends BaseConfiguration {
	WebDriver driver;
    public SearchProducts(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        
}
    @FindBy(xpath = "//a[text()=' Home']")
    WebElement Homepage;
    
    @FindBy(xpath = "//a[text()=' Products']")
    WebElement Product;
    
    @FindBy(xpath = "//input[@id=\"search_product\"]")
    WebElement SearchProduct;
    
    @FindBy(xpath = "//button[@id='submit_search']")
    WebElement SearchButton;
    
    @FindBy(xpath = "//h2[text()='Searched Products']")
    WebElement Searchproduct;
    
    @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
    WebElement Addproduct1;
    
    @FindBy(xpath = "(//a[text()='Add to cart'])[3]")
    WebElement Addproduct2;
    
    @FindBy(xpath = "(//a[text()='Add to cart'])[5]")
    WebElement Addproduct3;
    
    @FindBy(xpath = "(//a[text()='Add to cart'])[7]")
    WebElement Addproduct4;
    
    @FindBy(xpath = "(//a[text()='Add to cart'])[9]")
    WebElement Addproduct5;
    
    @FindBy(xpath = "(//a[text()='Add to cart'])[11]")
    WebElement Addproduct6;
    
    @FindBy(xpath = "(//a[text()='Add to cart'])[13]")
    WebElement Addproduct7;
    
    @FindBy(xpath = "(//a[text()='Add to cart'])[15]")
    WebElement Addproduct8;
    
    @FindBy(xpath = "(//a[text()='Add to cart'])[17]")
    WebElement Addproduct9;
    
    @FindBy(xpath = "//button[text()='Continue Shopping']")
    WebElement Continueshopping;
    
    @FindBy(xpath = "//a[text()=' Cart']")
    WebElement Cart;
    
    @FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement Signuplogin;
    
    @FindBy(xpath="//h2[text()='Login to your account']")
    WebElement logintoyouraccount;
    
    @FindBy(xpath="(//input[@name='email'])[1]")
    WebElement email;
    
    @FindBy(xpath="//input[@name='password']")
    WebElement password;
    
    @FindBy(xpath="//button[text()='Login']")
    WebElement loginbutton;
    
    @FindBy(xpath = "//a[text()=' Cart']")
    WebElement Cart1;
    
    public void verificationOfSearchProduct() throws InterruptedException {
    	
    	Assert.assertTrue(Homepage.isDisplayed());
    	//srollDown
    	//JavascriptExecutor js1 = (JavascriptExecutor) driver;
        //js1.executeScript("window.scrollBy(0,500)", "");
    	Product.click();
    	//add
    	JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
    	Product.click();
        SearchProduct.sendKeys("dress");
    	SearchButton.click();
    	//srollDown
    	JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,550)", "");
        Actions ac1=new Actions(driver);
        
        ac1.moveToElement(Addproduct1).click().build().perform();
    	Continueshopping.click();
        Thread.sleep(3000);
    	ac1.moveToElement(Addproduct2).click().build().perform();
    	Continueshopping.click();
    	Thread.sleep(3000);
    	ac1.moveToElement(Addproduct3).click().build().perform();
    	Continueshopping.click();
    	Thread.sleep(3000);
    	//srollDown
    	JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollBy(0,600)", "");
    	Thread.sleep(3000);
    	ac1.moveToElement(Addproduct4).click().build().perform();
    	Continueshopping.click();
    	Thread.sleep(3000);
    	ac1.moveToElement(Addproduct5).click().build().perform();
    	Continueshopping.click();
    	Thread.sleep(3000);
    	ac1.moveToElement(Addproduct6).click().build().perform();
    	Continueshopping.click();
    	Thread.sleep(3000);
    	//srollDown
    	JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("window.scrollBy(0,550)", "");
    	ac1.moveToElement(Addproduct7).click().build().perform();
    	Continueshopping.click();
    	Thread.sleep(3000);
    	ac1.moveToElement(Addproduct8).click().build().perform();
    	Continueshopping.click();
    	Thread.sleep(3000);
    	ac1.moveToElement(Addproduct9).click().build().perform();
    	Continueshopping.click();
    	
    	//srollDown
    	JavascriptExecutor js6 = (JavascriptExecutor) driver;
        js6.executeScript("window.scrollBy(0,-1550)", "");
    	Cart.click();
    	 Signuplogin.click();
    	 email.sendKeys(readProperty("email1"));
    	 password.sendKeys(readProperty("password1"));
    	 loginbutton.click();
    	 Cart1.click();
    }
    }

