package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests3 extends BaseTests {
    @Test(groups = {"regression", "smoke"})
    public void testSuccessfulLogin3(){
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature("omar","123");
    }
    @Test(groups = "regression")
    public void testSuccessfulLogin34(){
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature("omar","123");
    }
    @Test(groups = "regression")
    public void testSuccessfulLogin35(){
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature("omar","123");
    }
}
