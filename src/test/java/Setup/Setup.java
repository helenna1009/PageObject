package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by olenaostapchuk on 19.10.15.
 */
public class Setup {
    static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null){
            System.setProperty("webdriver.chrome.driver", "/Users/olenaostapchuk/Documents/Selenium/chromedriver");
            driver = new ChromeDriver();

        }

        return driver;
    }
}
