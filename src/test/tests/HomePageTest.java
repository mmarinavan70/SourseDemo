package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.lang.reflect.Method;

public class HomePageTest extends BaseTest {
    LoginPage logInPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void localSetUp(Method method, ITestResult result){
        setUp(method, result);
        logInPage = new LoginPage(getDriver());
        homePage = new HomePage(getDriver());
    }

    @Test
    public void validatePageHeader(){
        logInPage.logIn("standard");
        Assert.assertEquals(homePage.headerText.getText(), "Products");
    }

}
