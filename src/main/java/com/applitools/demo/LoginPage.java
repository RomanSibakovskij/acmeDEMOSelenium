package com.applitools.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class LoginPage extends BasePage{

    //login page header web element
    @FindBy(xpath = "//h4[@class='auth-header']")
    private WebElement loginPageHeader;
    //login page input field web elements
    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameInputField;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInputField;
    //sign-in button web element
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement signInButton;
    //remember me checkbox web element
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement rememberMeCheckbox;
    //social icon button list web elements
    @FindBy(xpath = "//a[@href='#']")
    private List<WebElement> socialIconsButtonElements;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //sign-in button click method
    public void clickSignInButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();
    }
    //'remember me' checkbox click method
    public void clickRememberMeCheckbox() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(rememberMeCheckbox));
        rememberMeCheckbox.click();
    }


    //login page web element assert methods
    public boolean isLoginPageHeaderDisplayed(){return loginPageHeader.isDisplayed();}
    public boolean isUsernameInputDisplayed(){return usernameInputField.isDisplayed();}
    public boolean isPasswordInputDisplayed(){return passwordInputField.isDisplayed();}
    public boolean isSignInButtonDisplayed(){return signInButton.isDisplayed();}
    public boolean isRememberMeCheckboxDisplayed(){return rememberMeCheckbox.isDisplayed();}
    public boolean isSocialIconsButtonDisplayed() {
        for (WebElement element : socialIconsButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    //login page header text getter
    public String getLoginPageHeaderText(){return loginPageHeader.getText();}
}
