package org.GridAutomationexercise.testObjects;

import java.util.concurrent.TimeUnit;

import org.automationexercise.baseFramework.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class RemoveProductsFromCart extends BaseClass{
	WebDriver driver;
    public RemoveProductsFromCart(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	By Homepage=By.xpath("//a[text()=' Home']");
    
    
	By AddCart1=By.xpath("(//a[text()='Add to cart'])[1]");
    
    
	By AddCart2=By.xpath("(//a[text()='Add to cart'])[3]");
   
	By AddCart3=By.xpath("(//a[text()='Add to cart'])[5]");
	
   
    By AddCart4=By.xpath("(//a[text()='Add to cart'])[7]");
    
    
    By AddCart5=By.xpath("(//a[text()='Add to cart'])[9]");
  
    
    By Continueshopping=By.xpath("//button[text()='Continue Shopping']");
   
    
    By Cart=By.xpath("//a[text()=' Cart']");
  
    
    By X1=By.xpath("(//i[@class='fa fa-times'])[1]");
 
    
    By X2=By.xpath("(//i[@class='fa fa-times'])[1]");
   
    By X3=By.xpath("(//a[@class='cart_quantity_delete'])[1]");
   
    By X4=By.xpath("(//a[@class='cart_quantity_delete'])[1]");
    By X5=By.xpath("//a[@class='cart_quantity_delete']");
   
    By CartEmpty=By.xpath("//b[text()='Cart is empty!']");
   
	
	public void verificationOfremoveProduct() throws InterruptedException {
		
		Assert.assertTrue(driver.findElement(Homepage).isDisplayed());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
	    
	    Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(AddCart1)).click().build().perform();
	    driver.findElement(Continueshopping).click();
	    act.moveToElement(driver.findElement(AddCart2)).click().build().perform();
	    driver.findElement(Continueshopping).click();
	    act.moveToElement(driver.findElement(AddCart3)).click().build().perform();
	    driver.findElement(Continueshopping).click();
	    

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    js2.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
	    
	    act.moveToElement(driver.findElement(AddCart4)).click().build().perform();
	    driver.findElement(Continueshopping).click();
	    act.moveToElement(driver.findElement(AddCart5)).click().build().perform();
	    driver.findElement(Continueshopping).click();
	    

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
	    js3.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
	    
	    driver.findElement(Cart).click();
	    Thread.sleep(2000);
	    driver.findElement(X1).click();
	    Thread.sleep(2000);
	   driver.findElement(X2).click();
	   Thread.sleep(2000);
	   driver.findElement(X3).click();
	   Thread.sleep(2000);
	   driver.findElement(X4).click();
	   Thread.sleep(2000);
	   driver.findElement(X5).click();
	    
	   driver.findElement(CartEmpty).click();
	}

}
