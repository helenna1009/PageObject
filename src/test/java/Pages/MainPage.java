package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by olenaostapchuk on 19.10.15.
 */
public class MainPage {

    @FindBy(xpath = "//*[@name=\"signin\"]")
    public WebElement loginInput;

    @FindBy(xpath = "//*[@name=\"profile\"]")
    public WebElement profileName;

  //  @FindBy(xpath = "//*[@name=\"personal_information\"]")
    //public WebElement linkExit;

   // @FindBy(linkText = "Выход")
    //public WebElement linkExit;

    @FindBy(css = "#popular-categories > div > div:nth-child(1) > a:nth-child(2) > span.popular-categories-i-title")
    public WebElement smartphones;
}
