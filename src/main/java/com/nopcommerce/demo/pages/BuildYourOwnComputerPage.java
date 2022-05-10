package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

   @FindBy(xpath= "//h1[normalize-space()='Build your own computer']")
    WebElement buildyourOwnComputerText;
@FindBy(linkText = "Build your own computer")
WebElement buildElement;
    @FindBy(xpath= "//select[@id='product_attribute_1']")
    WebElement processor;
    @FindBy(xpath= "//select[@id='product_attribute_2']")
    WebElement ramGB;
    @FindBy(xpath="//input[@id='product_attribute_3_7']")
    WebElement HDDRadio;
    @FindBy(xpath="//input[@id='product_attribute_4_9']")
    WebElement osRadio;
    @FindBy(xpath="//input[@id='product_attribute_5_12']")
    WebElement checkCheckBoxes;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @FindBy(xpath="//a[contains(text(),'shopping cart')]")
    WebElement verifyProductAdded;
    @FindBy(name="product_attribute_5")
    WebElement sw;

    public void clickOnBuildYourOwnComputer(){
        clickOnElement(buildElement);
    }
    public void selectProcessor(String process){
        selectByValueFromDropDown(processor,process);
    }
    public void selectRam(String ram){
        selectByVisibleTextFromDropDown(ramGB,ram);
    }
    public void selectHDD(String Hdd){
        selectByVisibleTextFromDropDown(HDDRadio,Hdd);
    }
    public void selectOS(String os){
        selectByVisibleTextFromDropDown(osRadio,os);
    }
    public void selectSoftware(String software){
        selectByVisibleTextFromDropDown(sw,software);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCartButton);
    }
    public String verifyTextProductAdded(){
        return getTextFromElement(verifyProductAdded);
    }

}
