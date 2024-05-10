package base;

import framework.config.ConfigLoader;
import framework.driver.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        boolean headless = ConfigLoader.getBool("headless", true);
        DriverFactory.initDriver(headless);
        driver = DriverFactory.getDriver();
    }

    @AfterEach
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
