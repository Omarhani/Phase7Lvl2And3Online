package t;

import base.BaseTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class T extends BaseTests {


    @Test
    public void t1() throws FileNotFoundException {
        System.out.println(dataModel().URL);
    }

    @Test
    public void t2() throws FileNotFoundException {
        System.out.println(dataModel().Login.ValidCredentials.Username);
        System.out.println(dataModel().Login.ValidCredentials.Password);
    }

    @Test
    public void t3() throws FileNotFoundException {
        System.out.println(dataModel().Login.InvalidCredentials.InvalidUsername.Username);
        System.out.println(dataModel().Login.InvalidCredentials.InvalidUsername.Password);
    }

    @Test
    public void t4() throws FileNotFoundException {
        System.out.println(dataModel().Login.InvalidCredentials.InvalidPassword.Username);
        System.out.println(dataModel().Login.InvalidCredentials.InvalidPassword.Password);
    }

    @DataProvider
    public Object[][] t5DataProvider() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        return readDataFromJson.readJsonFile().Login1;
    }

    @Test(dataProvider = "t5DataProvider")
    public void t5(String username, String password) {
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature(username, password);
    }
}
