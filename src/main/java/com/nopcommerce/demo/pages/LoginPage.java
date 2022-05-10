package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(id = "Password")
    WebElement passwordField;
    @FindBy(linkText = "Log in")
    WebElement logInButtonLoginPage;
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public void clickOnLoginButton() {
        clickOnElement(logInButtonLoginPage);
    }

    public String verifyWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterEmail(String key) {
        sendTextToElement(emailField, key);
    }

    public void enterPassword(String key) {
        sendTextToElement(passwordField, key);
    }
    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }
}





