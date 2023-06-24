package org.AutomationExercise.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.AutomationExercise.Base.BaseConfiguration;

public class RemoveProductFromCart extends BaseConfiguration {
	WebDriver driver;
	public RemoveProductFromCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()=' Home']")
     WebElement homeButton;

    @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
     WebElement addCart1;

    @FindBy(xpath = "(//a[text()='Add to cart'])[3]")
     WebElement addCart2;

    @FindBy(xpath = "(//a[text()='Add to cart'])[5]")
     WebElement addCart3;

    @FindBy(xpath = "(//a[text()='Add to cart'])[7]")
     WebElement addCart4;

    @FindBy(xpath = "(//a[text()='Add to cart'])[9]")
     WebElement addCart5;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
     WebElement continueShopping;

    @FindBy(xpath = "//a[text()=' Cart']")
     WebElement cart;

    @FindBy(xpath = "(//i[@class='fa fa-times'])[1]")
     WebElement x1;

    @FindBy(xpath = "(//i[@class='fa fa-times'])[1]")
     WebElement x2;

    @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
     WebElement x3;

    @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
     WebElement x4;

    @FindBy(xpath = "//a[@class='cart_quantity_delete']")
     WebElement x5;

    @FindBy(xpath = "//b[text()='Cart is empty!']")
     WebElement cartEmpty;

    

    public void verificationOfremoveProduct() throws InterruptedException {
        Assert.assertTrue(homeButton.isDisplayed());
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");

        Actions act = new Actions(driver);
        act.moveToElement(addCart1).click().build().perform();
        continueShopping.click();
        act.moveToElement(addCart2).click().build().perform();
        continueShopping.click();
        act.moveToElement(addCart3).click().build().perform();
        continueShopping.click();

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");

        act.moveToElement(addCart4).click().build().perform();
        continueShopping.click();
        act.moveToElement(addCart5).click().build().perform();
        continueShopping.click();

        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");

        cart.click();
        Thread.sleep(3000);
        x1.click();
        Thread.sleep(3000);
        x2.click();
        Thread.sleep(3000);
        x3.click();
        Thread.sleep(3000);
        x4.click();
        Thread.sleep(3000);
        x5.click();
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");

        cartEmpty.click();
    }}