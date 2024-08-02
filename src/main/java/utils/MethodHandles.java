package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.*;

public class MethodHandles {

    protected WebDriver driver;
    Actions actions;

    WebDriverWait wait;
    static ExtentReports extent;
    static ExtentTest test;

    public MethodHandles(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement webElement(By locator) {
        return driver.findElement(locator);
    }

    protected void explicitWait(By locator, int time) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(webElement(locator)),
                ExpectedConditions.visibilityOfElementLocated(locator),
                ExpectedConditions.elementToBeClickable(locator),
                ExpectedConditions.presenceOfElementLocated(locator)));
    }
    protected void invisibilityOfElement(By locator, int time) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.and(
                ExpectedConditions.invisibilityOf(webElement(locator)),
                ExpectedConditions.invisibilityOfElementLocated(locator)));
    }

    protected void click(By locator, int time) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                webElement(locator).click();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void clear(By locator, int time) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                webElement(locator).clear();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void submit(By locator, int time) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                webElement(locator).submit();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void sendKeys(By locator, int time, String text) {
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                webElement(locator).sendKeys(text);
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected String getText(By locator, int time) {
        String text = null;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                text = webElement(locator).getText();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return text;
    }

    protected boolean isSelected(By locator, int time) {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                flag = webElement(locator).isSelected();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return flag;
    }


    protected boolean isEnabled(By locator, int time) {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                flag = webElement(locator).isEnabled();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return flag;
    }

    protected boolean isDisplayed(By locator, int time) {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                flag = webElement(locator).isDisplayed();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
        return flag;
    }

    protected void clickWithActions(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                actions.click(webElement(locator)).build().perform();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void doubleClick(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                actions.doubleClick(webElement(locator)).build().perform();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void contextClick(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                actions.contextClick(webElement(locator)).build().perform();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void moveToElement(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                actions.moveToElement(webElement(locator)).build().perform();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void release(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                actions.release(webElement(locator)).build().perform();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }
    protected void clickAndHold(By locator, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(locator, time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                actions.clickAndHold(webElement(locator)).build().perform();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }
    protected void clickAndHold() {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                setSteps();
                actions.clickAndHold().build().perform();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void release() {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                setSteps();
                actions.release().build().perform();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void contextClick(By source, By target, int time) {
        actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            try {
                explicitWait(source, time);
                explicitWait(target, time);
                addBorderToElement(driver, webElement(source));
                addBorderToElement(driver, webElement(target));
                setSteps();
                actions.dragAndDrop(webElement(source), webElement(target)).build().perform();
                break;
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    protected void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    protected void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    protected void sendKeysAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    protected String getTextAlert(){
        return driver.switchTo().alert().getText();
    }

    protected void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    protected String getTitle(){
        return driver.getTitle();
    }
    protected String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    protected void switchToFrame(String nameOrID){
        driver.switchTo().frame(nameOrID);
    }
    protected void switchToFrame(WebElement frame){
        driver.switchTo().frame(frame);
    }
    protected void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    private static String getMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length >= 2) {
            if (stackTraceElements.length >= 4)
                return stackTraceElements[4].getMethodName();
            return stackTraceElements[2].getMethodName();
        } else {
            return "Unknown";
        }
    }

    public void setSteps() {
        test.info(getMethodName());
    }

    private static void addBorderToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = '5px solid red'", element);
    }

    protected static void myAssertEquals(Object actual, Object expected){
        test.info(MarkupHelper.createLabel("--------------- ends of Steps ---------------", ExtentColor.TEAL));

        test.info(MarkupHelper.createLabel("--------------- actual Result ---------------", ExtentColor.TEAL));
        test.info(actual.toString());

        test.info(MarkupHelper.createLabel("--------------- expected Result ---------------", ExtentColor.TEAL));
        test.info(expected.toString());

        assertEquals(actual,expected);
    }

    protected static void myAssertTrue(boolean b){
        assertTrue(b);
    }
    protected static void myAssertFalse(boolean b){
        assertFalse(b);
    }


}
