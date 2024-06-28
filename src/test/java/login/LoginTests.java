package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature("omar","123");
    }
}
