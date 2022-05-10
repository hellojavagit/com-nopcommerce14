package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(linkText = "Desktops")
    WebElement desktopText;
    @FindBy(xpath = "//h2[@class='product-title']")
    WebElement sortBy;
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement products;
    @FindBy(xpath = "//span[normalize-space()='Display']")
    WebElement display;

}


