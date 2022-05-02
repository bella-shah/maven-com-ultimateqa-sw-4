package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnSignInLink();
        String expectedMessage = "Welcome Back!";
        String actualMessage = homePage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Cannot verify Message");
    }

    @Test
    public void verifyTheErrorMessage() {
        homePage.clickOnSignInLink();
        loginPage.enterEmailId("prime123@gmail.com");
        loginPage.enterPassword("prime123");
        loginPage.clickOnLoginBtn();
        String expectedMessage = "Invalid email or password";
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Cannot verify Login Details");


    }
}
