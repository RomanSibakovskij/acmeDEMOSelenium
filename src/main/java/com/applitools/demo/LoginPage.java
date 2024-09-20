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

    //login data variables
    private String username;
    private String password;

    //invalid login data variables
    private String noUsername;
    private String noPassword;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //login data input getter
    public void inputUserData(){
        username = TestDataGenerator.generateRandomUsername(6);
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated data for login: " + "\n");
        logger.info("Username: " + username);
        logger.info("Password: " + password);
    }

    //input username method
    public void inputUsername() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(usernameInputField));
        usernameInputField.sendKeys(username);
    }
    //input password method
    public void inputPassword() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(password);
    }

    //invalid login data input getter (no username)
    public void inputUserDataWithNoUsername(){
        noUsername = "";
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Generated data for login: " + "\n");
        logger.info("No username: " + noUsername);
        logger.info("Password: " + password);
    }

    //input username method
    public void inputNoUsername() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(usernameInputField));
        usernameInputField.sendKeys(noUsername);
    }

    //invalid login data input getter (no username)
    public void inputUserDataWithNoPassword(){
        username = TestDataGenerator.generateRandomUsername(6);
        noPassword = "";

        System.out.println("Generated data for login: " + "\n");
        logger.info("Username: " + username);
        logger.info("No password: " + noPassword);
    }

    //input password method
    public void inputNoPassword() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(usernameInputField));
        usernameInputField.sendKeys(noPassword);
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

    //login data getters
    public String getUserName(){return username;}
    public String getPassword(){return password;}
}
