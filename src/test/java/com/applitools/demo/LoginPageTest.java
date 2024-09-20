package com.applitools.demo;

import org.junit.jupiter.api.*;

public class LoginPageTest extends TestMethods{

    @Test
    @DisplayName("Valid Login Test")
    @Tag("Valid_User_Login")
    void validLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPageTest(loginPage);
    }

}
