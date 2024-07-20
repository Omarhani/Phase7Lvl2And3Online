package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests {

    @Test(groups = "regression")
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature("omar","123");
    }
}
