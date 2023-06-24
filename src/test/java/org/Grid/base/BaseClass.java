package org.Grid.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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
	    public static void launchBrowser(String port) throws MalformedURLException {
	        if (port.equalsIgnoreCase("5555")) {
	            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	            capabilities.setBrowserName("chrome");
				capabilities.setPlatform(Platform.WINDOWS);
	            driver = new RemoteWebDriver(new URL("http://192.168.232.64:4444/wd/hub"), capabilities);
	        } else if (port.equalsIgnoreCase("6666")) {
	            DesiredCapabilities capabilities1 = DesiredCapabilities.edge();
	            capabilities1.setBrowserName("MicrosoftEdge");
				capabilities1.setPlatform(Platform.WINDOWS);
	            driver = new RemoteWebDriver(new URL("http://192.168.232.64:4444/wd/hub"), capabilities1);
	        }
	        
	        driver.get("https://www.automationexercise.com/");
	        driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	    }
}
