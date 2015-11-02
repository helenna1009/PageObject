package Setup;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

/**
 * Created by olenaostapchuk on 19.10.15.
 */
public class Setup {
    static WebDriver driver;

   /* public static WebDriver getDriver(){
        if (driver==null){
            System.setProperty("webdriver.chrome.driver", "/Users/olenaostapchuk/Documents/Selenium/chromedriver");
            driver = new ChromeDriver();

        }

        return driver;
    }*/

    public static WebDriver getDriver(){
        //Change system property of webdriver manager to download latest 2.9 version of chromedriver
      //  System.setProperty("wdm.chromeDriverVersion", "2.9");

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.out.println("Getting the driver instance");
        if (driver == null) {
            System.out.println("Starting a service...");
            ChromeDriverService service = new ChromeDriverService.Builder()
                    .withEnvironment(ImmutableMap.of("DISPLAY", ":20"))
                    .usingAnyFreePort()
                    .build();
            try {
                service.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
            driver = new RemoteWebDriver(service.getUrl(),
                    DesiredCapabilities.chrome());
        }
        return driver;
    }
}
