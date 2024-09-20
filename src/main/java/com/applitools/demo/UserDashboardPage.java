package com.applitools.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class UserDashboardPage extends BasePage {

    //acme page header logo web element
    @FindBy(xpath = "//div[@class='logo-label']")
    private WebElement acmePageLogoLabel;

    public UserDashboardPage(WebDriver driver) {
        super(driver);
    }

    //user dashboard page web element assert method
    public boolean isAcmePageLogoLabelDisplayed() {return acmePageLogoLabel.isDisplayed();}

    //user dashboard logo label getter
    public String getAcmePageLogoLabelText() {return acmePageLogoLabel.getText();}
}
