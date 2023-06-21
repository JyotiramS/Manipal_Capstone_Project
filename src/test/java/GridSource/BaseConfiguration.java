package GridSource;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseConfiguration {
	 protected WebDriver driver;
     
	    public WebDriver setUp(String Port) throws MalformedURLException {
	        if (Port.equalsIgnoreCase("5555")) {
	            System.out.println("Chrome Browser Initiated");
	            DesiredCapabilities capabilities = new DesiredCapabilities();
	            capabilities.setCapability("browserName", "chrome");
	            URL url = new URL("http://192.168.232.64:4444/wd/hub");
	            driver = new RemoteWebDriver(url, capabilities);
	            driver.get("https://www.automationexercise.com/");
	           
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        } else if (Port.equalsIgnoreCase("6666")) {
	            System.out.println("MicrosoftEdge Browser Initiated");
	            DesiredCapabilities capabilities = new DesiredCapabilities();
	            capabilities.setCapability("browserName", "MicrosoftEdge");
	            URL url = new URL("http://192.168.232.64:4444/wd/hub");
	            driver = new RemoteWebDriver(url, capabilities);
	            driver.get("https://www.automationexercise.com/");
	           
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        }
			return driver;

}
}
