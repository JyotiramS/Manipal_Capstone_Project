package org.AutomationExercise.PageObjects;

import org.AutomationExercise.Base.BaseConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddReviewOnProduct extends BaseConfiguration {
	
	WebDriver driver;
    public AddReviewOnProduct(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        
    }    
    @FindBy(xpath = "//a[text()=' Products']")
    WebElement Product;
    
    @FindBy(xpath = "(//a[text()='View Product'])[1]")
    WebElement ViewProduct;
    
  
    
   // @FindBy(xpath = "//a[text()='Write Your Review']")
   // WebElement WriteYourReview;
    
    @FindBy(xpath = "//input[@id=\"name\"]")
    WebElement YourName;
    
    @FindBy(xpath = "//input[@id=\"email\"]")
    WebElement Emailaddress;
    
    @FindBy(xpath = "//textarea[@id=\"review\"]")
    WebElement addreview;
    
    @FindBy(xpath = "//button[@id='button-review']")
    WebElement submit;
    
  //  @FindBy(xpath = "//span[text()='Thank you for your review.']")
  //  WebElement success;
	

	public void verificationOfAddReviewProduct() {
		// TODO Auto-generated method stub

		Product.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		
	    ViewProduct.click();
		
		YourName.sendKeys(readProperty("name"));
		Emailaddress.sendKeys(readProperty("email"));
		addreview.sendKeys("good");
		
		JavascriptExecutor j2 = (JavascriptExecutor) driver;
	    j2.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
	      
	    submit.click();
	}

}
