package BASE;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Logger;

public class BaseTest {
    static WebDriver driver;

    public static Logger logger;

    public static Logger getInstance() {
        if (logger == null) {
            logger = Logger.getLogger(TestLog.class.getName());
        }

        return logger;
    }

    @Before
    public void setUp() {
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        getInstance().info("Log Başlatıldı");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        getWebDriver().navigate().to("https://www.lcwaikiki.com/tr-TR/TR");
    }

    public static WebDriver getWebDriver() {
        return driver;
    }


    public void tearDown() {
        getWebDriver().close();
    }
}
