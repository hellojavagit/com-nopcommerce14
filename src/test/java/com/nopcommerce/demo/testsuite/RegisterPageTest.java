package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt(){
        loginPage = new LoginPage();
        homePage= new HomePage();
        registerPage = new RegisterPage();
    }
    @Test(groups={"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully()
    {
        registerPage.clickOnRegisterLink();
        String expectedMessage ="Register";
        String actualMessage= registerPage.verifyRegisterText();
        Assert.assertEquals("Texts does not match",expectedMessage,actualMessage);
    }
    @Test(groups={"smoke","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        registerPage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        String expectedMessage1 ="First name is required.";
        String actualMessage1= registerPage.verifyErrorMessageFirstName();
        Assert.assertEquals("messages does not match",expectedMessage1,actualMessage1);
        String expectedMessage2 ="Last name is required.";
        String actualMessage2= registerPage.verifyErrorMessageLastName();
        Assert.assertEquals("messages does not match",expectedMessage2,actualMessage2);
        String expectedMessage3 ="Email is required.";
        String actualMessage3= registerPage.verifyErrorMessageEmailField();
        Assert.assertEquals("messages does not match",expectedMessage3,actualMessage3);
        String expectedMessage4 ="Password is required.";
        String actualMessage4= registerPage.verifyErrorMessagePasswordFiled();
        Assert.assertEquals("messages does not match",expectedMessage4,actualMessage4);
        String expectedMessage5 ="Password is required.";
        String actualMessage5= registerPage.verifyErrorMessageConfirmPasswordField();
        Assert.assertEquals("messages does not match",expectedMessage5,actualMessage5);
    }
    @Test(groups={"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        registerPage.clickOnRegisterLink();
        registerPage.clickOnFemaleRadio();
        registerPage.enterFirstName("hihello");
        registerPage.enterLastName("happy");
        registerPage.selectDateOfBirthFromDD("8");
        registerPage.selectMonthOfBirthFromDD("8");
        registerPage.selectYearOfBirthFromDD("1998");
        registerPage.enterEmailField("prime123@gmail.com");
        registerPage.enterPasswordField("abcd123456");
        registerPage.enterConfirmPasswordField("abcd123456");
        registerPage.clickOnRegisterButtonInRegisterPage();
        String expectedRegisterMessage= "Your registration completed";
        String actualRegisterMessage= registerPage.verifyRegistrationCompletedMessage();
        Assert.assertEquals("Messages no Match",expectedRegisterMessage,actualRegisterMessage);

    }
}
