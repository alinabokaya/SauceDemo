package tests;

import drivermanager.DriverFactory;
import drivermanager.DriverManager;
import drivermanager.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.TestListeners;

@Listeners(TestListeners.class)
public class BaseTest {

    protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public WebDriver driver;
    public DriverManager driverManager;

    @BeforeSuite
    @Parameters({"browserType"})
    public void setUp(@Optional("chrome") String browser) {
        DriverFactory driverFactory = new DriverFactory();
        DriverType type = null;
        if (browser.equals("chrome")) {
            type = DriverType.CHROME;
        } else if (browser.equals("safari")) {
            type = DriverType.SAFARI;
        }
        driverManager = driverFactory.getManager(type);
        driverManager.createDriver();
        driverManager.setTimeout();
        driverManager.startMaximize();
        driverManager.removeTimeout();
        driver = driverManager.getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        driverManager.quitDriver();
    }
}
