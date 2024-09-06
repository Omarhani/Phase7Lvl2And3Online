package base;

import data.DataModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import reader.ReadDataFromJson;
import utils.ScreenRecorderUtil;
import utils.UtilsTests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseTests {

    WebDriver driver;

    ChromeOptions chromeOptions;
    FirefoxOptions firefoxOptions;

    protected HomePage homePage;
    protected ReadDataFromJson readDataFromJson;

    UtilsTests utilsTests;

    @Parameters("browser")
    @BeforeClass(groups = {"regression", "smoke"})
    public void setUp(@Optional("chrome") String browser) {
        setUpBrowser(browser);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @Parameters("browser")
    public void setUpBrowser(@Optional("firefox") String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("headlessChrome")) {
            chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else if (browser.equalsIgnoreCase("headlessFirefox")) {
            firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--headless");
            driver = new FirefoxDriver(firefoxOptions);
        }
    }

    @BeforeMethod(groups = {"regression", "smoke"})
    public void goHome(Method method) throws Exception {
        readDataFromJson = new ReadDataFromJson();
        utilsTests = new UtilsTests(driver);
        driver.get(dataModel().URL);
        ScreenRecorderUtil.startRecord(method.getName());
        utilsTests.createTestCaseInReport(method);

    }

    @AfterMethod(groups = {"regression", "smoke"})
    public void afterMethod(Method method, ITestResult result) throws Exception {
        utilsTests = new UtilsTests(driver);
        utilsTests.takeScreenShot(method);
        ScreenRecorderUtil.stopRecord();
        utilsTests.setStatus(method,result);
    }

    @AfterClass(groups = {"regression", "smoke"})
    public void tearDown() {
        driver.quit();
    }

    @BeforeSuite
    public void beforeSuite(){
        utilsTests = new UtilsTests(driver);
        utilsTests.createReport();
    }

    @AfterSuite
    public void afterSuite(){
        utilsTests = new UtilsTests(driver);
        utilsTests.flushReport();
    }


    public DataModel dataModel() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        return readDataFromJson.readJsonFile();
    }
}
