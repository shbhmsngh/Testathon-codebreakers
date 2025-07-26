package com.browserstack;

import com.browserstack.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends SeleniumTest {

    @Test
    public void LoginIntoApplication() throws Exception {
        // navigate to bstackdemo
        LoginPage loginPage = new LoginPage();
        loginPage.load(driver);
//        driver.get("https://testathon.live/");
        System.out.println("[[BSTACK_SET_CUSTOM_TAG||ID=TC-104]]");

//        // verify header
        Assert.assertTrue(loginPage.verifyHeader());
        Assert.assertTrue(loginPage.verifySignButtonIsVisible());
//
//        //click on singin
        loginPage.clickSignInButton();

        //verify sign in page

        //enter sigin details
        loginPage.enterUserName("demouser");
//        //click login button
        loginPage.clickOnLoginButton();

    }


    @Test
    public void LoginIntoApplicationWithEmptyCredentials() throws Exception {
        // navigate to bstackdemo
        LoginPage loginPage = new LoginPage();
        loginPage.load(driver);
        System.out.println("[[BSTACK_SET_CUSTOM_TAG||ID=TC-103]]");
//        // verify header
        Assert.assertTrue(loginPage.verifyHeader());
        Assert.assertTrue(loginPage.verifySignButtonIsVisible());
//        //click on singin
        loginPage.clickSignInButton();
//        //click login button
        loginPage.clickOnLoginButton();
        Assert.assertTrue(loginPage.getErrorMessage().equals("Invalid Username"));
    }

    @Test
    public void LoginIntoApplicationWithInvalidCredentials() throws Exception {
        // navigate to bstackdemo
        LoginPage loginPage = new LoginPage();
        loginPage.load(driver);
        System.out.println("[[BSTACK_SET_CUSTOM_TAG||ID=TC-101]]");
//        // verify header
        Assert.assertTrue(loginPage.verifyHeader());
        Assert.assertTrue(loginPage.verifySignButtonIsVisible());
//        //click on singin
        loginPage.clickSignInButton();
//        //click login button
        loginPage.clickOnUserNameOption();
        loginPage.enterUserName("locked_user");

        loginPage.clickOnLoginButton();
        Assert.assertTrue(loginPage.getErrorMessage().equals("Invalid Username"));
    }




}
