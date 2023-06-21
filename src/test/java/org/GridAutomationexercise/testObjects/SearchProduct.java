package org.GridAutomationexercise.testObjects;

import java.util.concurrent.TimeUnit;

import org.automationexercise.baseFramework.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchProduct extends BaseClass{
	WebDriver driver;
    public SearchProduct(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
	
	By Homepage=By.xpath( "//a[text()=' Home']");
   
	By Product=By.xpath( "//a[text()=' Products']");
   
    
    By SearchProduct=By.xpath("//input[@id='search_product']");
  
    By SearchButton=By.xpath( "//button[@id='submit_search']");
  
    
  //  By Searchproduct=By.xpath( "//h2[text()='Searched Products']");
   
    
    
    By Addproduct1=By.xpath( "(//a[text()='Add to cart'])[1]");
   

    By Addproduct2=By.xpath( "(//a[text()='Add to cart'])[3]");
  
    
    By Addproduct3=By.xpath( "(//a[text()='Add to cart'])[5]");

    
    By Addproduct4=By.xpath("(//a[text()='Add to cart'])[7]");
   
    By Addproduct5=By.xpath("(//a[text()='Add to cart'])[9]");
  
    By Addproduct6=By.xpath("(//a[text()='Add to cart'])[11]");
   
    
    By Addproduct7=By.xpath("(//a[text()='Add to cart'])[13]");
  
    
    By Addproduct8=By.xpath("(//a[text()='Add to cart'])[15]");
   
    
    By Addproduct9=By.xpath("(//a[text()='Add to cart'])[17]");
   
    
    By Continueshopping=By.xpath("//button[text()='Continue Shopping']");
   
    By Cart=By.xpath("//a[text()=' Cart']");
   
    
    By Signuplogin=By.xpath("//a[text()=' Signup / Login']");
   
    
    By logintoyouraccount=By.xpath("//h2[text()='Login to your account']");
  
    By email=By.xpath("(//input[@name='email'])[1]");
    
    By password=By.xpath("//input[@name='password']");
    
    By loginbutton=By.xpath("//button[text()='Login']");
   
    
    By Cart1=By.xpath("//a[text()=' Cart']");

	public void verificationOfSearchProduct() throws InterruptedException {
		
		Assert.assertTrue(driver.findElement(Homepage).isDisplayed());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	//srollDown
    	
		driver.findElement(Product).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		driver.findElement(SearchProduct).sendKeys("dress");
		driver.findElement(SearchButton).click();
    	//srollDown
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        Actions pc1=new Actions(driver);
        
        pc1.moveToElement(driver.findElement(Addproduct1)).click().build().perform();
        driver.findElement(Continueshopping).click();
        
    	pc1.moveToElement(driver.findElement(Addproduct2)).click().build().perform();
    	driver.findElement(Continueshopping).click();
    	
    	pc1.moveToElement(driver.findElement(Addproduct3)).click().build().perform();
    	driver.findElement(Continueshopping).click();
    	
    	JavascriptExecutor js7 = (JavascriptExecutor) driver;
	    js7.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
    	pc1.moveToElement(driver.findElement(Addproduct4)).click().build().perform();
    	driver.findElement(Continueshopping).click();
    	
    	pc1.moveToElement(driver.findElement(Addproduct5)).click().build().perform();
    	driver.findElement(Continueshopping).click();
    	
    	pc1.moveToElement(driver.findElement(Addproduct6)).click().build().perform();
    	driver.findElement(Continueshopping).click();
    	
    	//srollDown
    	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    js2.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
    	pc1.moveToElement(driver.findElement(Addproduct7)).click().build().perform();
    	driver.findElement(Continueshopping).click();
    	
    	pc1.moveToElement(driver.findElement(Addproduct8)).click().build().perform();
    	driver.findElement(Continueshopping).click();
    	
    	pc1.moveToElement(driver.findElement(Addproduct9)).click().build().perform();
    	driver.findElement(Continueshopping).click();
    	
    	//srollDown
    	JavascriptExecutor js3 = (JavascriptExecutor) driver;
	    js3.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        driver.findElement(Cart).click();
        driver.findElement(Signuplogin).click();
        driver.findElement(email).sendKeys(readProperty("email"));
        driver.findElement(password).sendKeys(readProperty("password"));
    	 driver.findElement(Cart1).click();
	}
	

}
