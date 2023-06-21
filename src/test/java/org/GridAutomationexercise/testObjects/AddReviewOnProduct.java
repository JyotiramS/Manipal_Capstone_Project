package org.GridAutomationexercise.testObjects;

import org.automationexercise.baseFramework.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddReviewOnProduct extends BaseClass {
	WebDriver driver;
  
	
	public AddReviewOnProduct(WebDriver driver) {
		 this.driver=driver;
	        PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}


	By ProductButton=By.xpath("//a[@href='/products']");
	
	By viewproductButton=By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]");

	By YourName=By.xpath("//input[@id='name']");
	
	
	By Emailaddress=By.xpath("//input[@id='email']");
	
	
	By addreview=By.xpath("//textarea[@id='review']");

	
	By submitreviewbuttton=By.xpath("//button[@id='button-review']");


	public void verificationOfAddReviewProduct() {
		// TODO Auto-generated method stub
		
		driver.findElement(ProductButton).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		
		driver.findElement(viewproductButton).click();
		
		driver.findElement(YourName).sendKeys(readProperty("name"));
		driver.findElement(Emailaddress).sendKeys(readProperty("email"));
		 driver.findElement(addreview).sendKeys("good");
		
		JavascriptExecutor j2 = (JavascriptExecutor) driver;
	       j2.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
	      
		driver.findElement(submitreviewbuttton).click();
		
	}

}
