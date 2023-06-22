package org.AutomationExercise.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseConfiguration {
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

    public static WebDriver launchBrowser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resources//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(readProperty("applicationurl"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, BaseConfiguration.class);
		return driver;
    }
}
