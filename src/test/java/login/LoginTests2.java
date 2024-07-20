package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests2 extends BaseTests {
    @Test(groups = "regression")
    public void testSuccessfulLogin2(){
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature("omar","123");
    }
    @Test
    public void testSuccessfulLogin23(){
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature("omar","123");
    }
    @Test(groups = "regression")
    public void testSuccessfulLogin24(){
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature("omar","123");
    }
}
