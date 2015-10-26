package Tests;

import Pages.MainPage;
import Pages.PopUp;
import Setup.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by olenaostapchuk on 19.10.15.
 */

public class FirstTest {
    static WebDriver driver;

    String rozetkaLogin = "utest4all@gmail.com";
    String rozetkaPasswort = "javaqa0101";
    String myUsername = "javaqa01";

    @BeforeMethod
    public void setUp(){
        driver = Setup.getDriver();

    }

    @AfterMethod
    public void tearDown(){
    driver.quit(); //if more than one test is in class use drive.close(), if one test in one class use quit()

    }

    @Test
    public void test1(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.get("http://rozetka.com.ua");
        MainPage page = PageFactory.initElements(driver, MainPage.class);
        page.loginInput.click();

        PopUp pop = PageFactory.initElements(driver, PopUp.class);
       // pop.login.sendKeys("utest4all@gmail.com");
        //pop.passwort.sendKeys("javaqa0101");
       // pop.submit.click();

        pop.loginUserAs(rozetkaLogin,rozetkaPasswort);
        wait.until(ExpectedConditions.visibilityOf(page.profileName));
        String currentUserName = page.profileName.getText();
        Assert.assertTrue(currentUserName.equalsIgnoreCase(myUsername));

        //page.profileName.click();
        //wait.until(ExpectedConditions.visibilityOf(page.linkExit));
        //page.linkExit.click();

        String smartphoneName = page.smartphones.getText();
        System.out.println("Popular category is " + smartphoneName);

    }


}
