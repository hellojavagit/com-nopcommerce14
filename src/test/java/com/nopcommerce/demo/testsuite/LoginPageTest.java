package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
 LoginPage loginPage;
 HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        loginPage = new LoginPage();
        homePage= new HomePage();
    }

    @Test(groups={"sanity","smoke","regression"})
    public void userShouldNavigateToLoginPageSuccessFully(){
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.verifyWelcomeText();
        Assert.assertEquals("Error", expectedMessage, actualMessage);
    }
    @Test(groups={"smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmail("primegmail.com");
        loginPage.enterPassword("abcd123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        org.testng.Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
    }
    @Test(groups={"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmail("prime123@gmail.com");
        loginPage.enterPassword("abcd123");
        loginPage.clickOnLoginButton();

    }

    @Test(groups={"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnLoginLink();
        loginPage.enterEmail("prime123@gmail.com");
        loginPage.enterPassword("abcd123");
        loginPage.clickOnLoginButton();
        homePage.clickLogOutButton();

    }


}
