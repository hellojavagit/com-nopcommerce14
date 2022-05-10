package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    RegisterPage registerPage;
    ComputerPage computerPage;
    BuildYourOwnComputerPage buildYourOwn;

    @BeforeMethod
    public void inIt(){
        loginPage = new LoginPage();
        homePage= new HomePage();
        registerPage = new RegisterPage();
        computerPage=new ComputerPage();
        buildYourOwn= new BuildYourOwnComputerPage();
    }
    @Test(groups={"sanity","smoke","regression"})
    public void  verifyUserShouldNavigateToComputerPageSuccessfully(){
        computerPage.clickOnComputers();
        String expectedMessage= "Computers";
        String actualMessage = computerPage.verifyComputersText();
        Assert.assertEquals("messages does not match",expectedMessage,actualMessage);
    }
    @Test(groups={"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        computerPage.clickOnComputers();
        computerPage.clickOnDesktopsLink();
        String expectedMessage= "Desktops";
        String actualMessage = computerPage.verifyDesktopText();
        Assert.assertEquals("Messages does not match",expectedMessage,actualMessage);

    }
    @Test(groups={"regression"},dataProvider = "Computers", dataProviderClass = TestData.class )
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {
        computerPage.clickOnComputers();
        computerPage.clickOnDesktopsLink();
        buildYourOwn.clickOnBuildYourOwnComputer();
        buildYourOwn.selectProcessor(processor);
        buildYourOwn.selectRam(ram);
        buildYourOwn.selectHDD(hdd);
        buildYourOwn.selectOS(os);
        buildYourOwn.selectSoftware(software);
        buildYourOwn.clickOnAddToCart();
        String expectedMessage = "The product has been added to your shopping cart2  q`";
        String actualMessage = buildYourOwn.verifyTextProductAdded();
        Assert.assertEquals("Messages does not match", expectedMessage, actualMessage);

    }
}
