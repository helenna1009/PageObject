package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by olenaostapchuk on 19.10.15.
 */
public class PopUp {
    @FindBy(xpath = "//*[@name=\"login\"]")
    public WebElement login;

    @FindBy(xpath = "//*[@name=\"password\"]")
    public WebElement passwort;

    @FindBy(xpath = "//*[@name=\"auth_submit\"]")
    public WebElement submit;


    public void loginUserAs (String myLogin, String myPasswort){
        login.sendKeys(myLogin);
        passwort.sendKeys(myPasswort);
        submit.click();
    }



}
