package TEST;

import BASE.BaseTest;
import page.LoginPage;
import org.junit.Before;
import org.testng.annotations.Test;

public class TestMain extends BaseTest {

    LoginPage loginPage;


    @Before
    public void before() {
       // searchAndAddCartItemProcess = new SearchAndAddCartItemProcess(getWebDriver());
        loginPage = new LoginPage(getWebDriver());
        //cartProcess = new CartProcess(getWebDriver());
    }

    @Test
    public void test() {
        //Login Test
        loginPage
                .moveToLogIn()
                .clickLogIn()
                .sendEmail()
                .sendPassword()
                .submitButton();

}

}


