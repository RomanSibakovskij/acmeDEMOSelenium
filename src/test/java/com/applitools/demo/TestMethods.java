package com.applitools.demo;

import static org.junit.jupiter.api.Assertions.*;

public class TestMethods extends BaseTest{

    //valid login page test method
    protected void loginPageTest(LoginPage loginPage){
        //web element assert
        isLoginPageWebElementDisplayed(loginPage);
        //assert the login header has the expected text
        assertEquals("Login Form", loginPage.getLoginPageHeaderText(), "The login page header text doesn't match expectations");
        //input user data getter
        loginPage.inputUserData();
        //input username
        loginPage.inputUsername();
        //input password
        loginPage.inputPassword();
        //click 'remember me' checkbox
        loginPage.clickRememberMeCheckbox();
        //click sign-in button
        loginPage.clickSignInButton();
    }

    //login page web element assert
    protected void isLoginPageWebElementDisplayed(LoginPage loginPage){
        //assert the login page header is displayed
        assertTrue(loginPage.isLoginPageHeaderDisplayed(), "The login page header isn't displayed");
        //assert username input field is displayed
        assertTrue(loginPage.isUsernameInputDisplayed(), "The username input field isn't displayed");
        //assert password input field is displayed
        assertTrue(loginPage.isPasswordInputDisplayed(), "The password input field isn't displayed");
        //assert sign-in button is displayed
        assertTrue(loginPage.isSignInButtonDisplayed(), "The sign in button isn't displayed");
        //assert 'remember me' checkbox is displayed
        assertTrue(loginPage.isRememberMeCheckboxDisplayed(), "The 'remember me' checkbox isn't displayed");
        //assert social page icon buttons are displayed (as a single block)
        assertTrue(loginPage.isSocialIconsButtonDisplayed(), "The social icon button isn't displayed");
    }
}
