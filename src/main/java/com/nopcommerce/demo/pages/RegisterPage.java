package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;

    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;

    @FindBy(xpath = "//label[contains(text(),'Gender:')]")
    WebElement gender;

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement maleRadio;

    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleRadio;

    @FindBy(name = "FirstName")
    WebElement firstName;

    @FindBy(name = "LastName")
    WebElement lastName;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement dateOfBirthday;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement monthOfBirthday;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement yearOfBirth;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordField;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;


    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement errorMessageFirstName;
    @FindBy(id = "LastName-error")
    WebElement errorMessageLastName;
    @FindBy(id = "Email-error")
    WebElement errorMessageEmailField;
    @FindBy(id = "Password-error")
    WebElement errorMessagePasswordField;
    @FindBy(id = "ConfirmPassword-error")
    WebElement errorMessageConfirmPasswordField;


    public void enterFirstName(String fname) {
        sendTextToElement(emailField, fname);
    }

    public void enterLastName(String lname) {
        sendTextToElement(passwordField, lname);
    }

    public void selectDateOfBirthFromDD(String keys) {
        selectByValueFromDropDown(dateOfBirthday, keys);
    }

    public void selectMonthOfBirthFromDD(String keys) {
        selectByValueFromDropDown(monthOfBirthday, keys);
    }

    public void selectYearOfBirthFromDD(String keys) {
        selectByValueFromDropDown(yearOfBirth, keys);
    }


    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public void clickOnFemaleRadio() {
        clickOnElement(femaleRadio);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }
    public void clickOnRegisterButtonInRegisterPage() {
        clickOnElement(registerButton);
    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
    WebElement registrationCompleted;
    public String verifyRegistrationCompletedMessage(){
        return getTextFromElement(registrationCompleted);
    }

    public String verifyRegisterText() {
        return getTextFromElement(registerText);
    }

    public String verifyErrorMessageFirstName() {
        return getTextFromElement(errorMessageFirstName);
    }

    public String verifyErrorMessageLastName() {
        return getTextFromElement(errorMessageLastName);
    }

    public String verifyErrorMessageEmailField() {
        return getTextFromElement(errorMessageEmailField);
    }

    public String verifyErrorMessagePasswordFiled() {
        return getTextFromElement(errorMessagePasswordField);
    }

    public String verifyErrorMessageConfirmPasswordField() {
        return getTextFromElement(errorMessageConfirmPasswordField);
    }

    public void enterEmailField(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPasswordField(String confirmpassword) {
        sendTextToElement(confirmPasswordField, confirmpassword);
    }


}
