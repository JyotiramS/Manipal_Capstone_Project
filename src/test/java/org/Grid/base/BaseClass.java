package org.Grid.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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
    public static void launchBrowser(String browser) throws MalformedURLException {
        if (browser.equalsIgnoreCase("chrome")) {
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            driver = new RemoteWebDriver(new URL("http://192.168.232.64:4444/wd/hub"), capabilities);
        } else if (browser.equalsIgnoreCase("MicrosoftEdge")) {
            DesiredCapabilities capabilities = DesiredCapabilities.edge();
            driver = new RemoteWebDriver(new URL("http://192.168.232.64:4444/wd/hub"), capabilities);
        }
        
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
}
