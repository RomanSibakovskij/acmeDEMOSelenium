package com.applitools.demo;

import org.junit.jupiter.api.*;

public class LoginPageTest extends TestMethods{

    //Test 001 - valid user login test (even though the page doesn't require prior registration)
    @Test
    @DisplayName("Valid Login Test")
    @Tag("Valid_User_Login")
    void validLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPageTest(loginPage);
    }

    //Test 001a - invalid user login test (no username)
    @Test
    @DisplayName("Invalid Login Test - No Username")
    @Tag("Invalid_User_Login")
    void invalidLoginNoUsernameTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPageNoUsernameTest(loginPage);
    }

}
