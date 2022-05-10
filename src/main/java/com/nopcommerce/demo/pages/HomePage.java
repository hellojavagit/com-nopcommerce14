package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Computers ")
    WebElement computers;

    @FindBy(linkText = "Electronics ")
    WebElement electronics;

    @FindBy(linkText = "Apparel ")
    WebElement apparel;

    @FindBy(linkText = "Digital downloads ")
    WebElement digitalDownloads;

    @FindBy(linkText = "Books ")
    WebElement books;

    @FindBy(linkText = "Jewelry ")
    WebElement jewelry;

    @FindBy(linkText = "Gift Cards ")
    WebElement giftCards;

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLinkHomePage;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement register;

    @FindBy(xpath = "//img[@alt='nopCommerce demo store'")
    WebElement nopcommerceLogo;

    @FindBy(xpath = "//body//div//div//div//div//div//ul//li//a[normalize-space()='My account']")
    WebElement myAccount;

    @FindBy(linkText ="Log out")
    WebElement logOut;


    public void clickLogOutButton(){
        clickOnElement(logOut);
    }

    public void clickOnLoginLink(){
        clickOnElement(loginLinkHomePage);
    }


}
