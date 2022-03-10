package page;

import BASE.BasePage;
import BASE.BaseTest;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;
import static LOCATORS.Locators.*;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public Logger logger = BaseTest.getInstance();

    public LoginPage moveToLogIn(){
        logger.info("On the login page button");
        hoverElement(MOVE);
        return this;
    }

    public LoginPage clickLogIn(){
        logger.info("Click the login page button");
        click(MOVE);
        return this;
    }

    public LoginPage sendEmail(){
        logger.info("Email value sent");
        sendKeys(TX_MAIL,"testmail2@gmail.com");
        return this;
    }

    public LoginPage sendPassword(){
        logger.info("Password value sent");
        sendKeys(TX_PASSWORD,"test123");
        return this;
    }

    public LoginPage submitButton(){
        logger.info("Click the login button");
        click(BTN_LOGIN);
        return this;
    }

}
