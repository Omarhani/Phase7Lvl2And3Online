package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static utils.UtilsTests.myAssertEquals;

public class LoginTests extends BaseTests {

    @Test(groups = "regression")
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature("omar","123");

        myAssertEquals("test","test");
    }
}
