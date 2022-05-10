package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computersText;
    @FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersElement;
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsLink;
    @FindBy(linkText = "Desktops")
    WebElement desktopText;
    @FindBy(xpath = "//a[@title='Show products in category Notebooks'][normalize-space()='Notebooks']")
    WebElement notebooksLink;
    @FindBy(xpath = "//a[@title='Show products in category Software'][normalize-space()='Software']")
    WebElement softwareLink;
    //@FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")


    public void clickOnComputers() {
      clickOnElement(computersElement);
    }
    public void clickOnDesktopsLink() {
       mouseHoverToElementAndClick(desktopsLink);
    }
        public String verifyComputersText(){
         return getTextFromElement(computersText);
    }
    public String verifyDesktopText(){
        return getTextFromElement(desktopText);
    }

}
