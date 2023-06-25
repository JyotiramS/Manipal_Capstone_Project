package org.Grid.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.AutomationExercise.Base.BaseConfiguration;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import java.net.MalformedURLException;
import java.net.URL;

  public class BaseClass {
	    public static WebDriver driver;
	    public static Properties prop;

	    public static void initializeProp(String filepath) {
	        File file = new File(filepath);
	        try {
	            FileInputStream fip = new FileInputStream(file);
	            prop = new Properties();
	            prop.load(fip);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static String readProperty(String property) {
	        if (prop == null) {
	            initializeProp("Configuration/config.properties");
	        }
	        return prop.getProperty(property);
	    }
	    public static void launchBrowser(String port) throws MalformedURLException, InterruptedException {
	        if (port.equalsIgnoreCase("5555")) {
	        	System.out.println("Chrome Browser Initiated");
	            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	            capabilities.setBrowserName("chrome");
				capabilities.setPlatform(Platform.WINDOWS);
	            driver = new RemoteWebDriver(new URL("http://192.168.232.64:4444/wd/hub"), capabilities);
	        } else if (port.equalsIgnoreCase("7777")) {
	        	System.out.println("MicrosoftEdge Browser Initiated");
	            DesiredCapabilities capabilities1 = DesiredCapabilities.edge();
	            capabilities1.setBrowserName("MicrosoftEdge");
				capabilities1.setPlatform(Platform.WINDOWS);
	            driver = new RemoteWebDriver(new URL("http://192.168.232.64:4444/wd/hub"), capabilities1);
	        }
	        
	        driver.get(readProperty("applicationurl")); 
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	       PageFactory.initElements(driver, BaseConfiguration.class);
	    }
}
