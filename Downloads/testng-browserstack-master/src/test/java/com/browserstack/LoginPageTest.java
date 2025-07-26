package com.browserstack;

import com.browserstack.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends SeleniumTest {
    @Test
    public void LoginIntoApplication() throws Exception {
        // navigate to bstackdemo
        LoginPage loginPage = new LoginPage();
        loginPage.load();
        System.out.println("[[BSTACK_SET_CUSTOM_TAG||ID=TC-972811]]");

        // verify header
        Assert.assertTrue(loginPage.verifyHeader());
        Assert.assertTrue(loginPage.verifySignButtonIsVisible());

        //click on singin
        loginPage.clickSignInButton();

        //verify sign in page
//        Assert.assertTrue(loginPage.verifyselectUserNameOptionIsVisible());
//        Assert.assertTrue(loginPage.verifyselectPasswordOptionIsVisible());

        //enter sigin details
        loginPage.enterUserName("demouser");
        //click login button
        loginPage.clickOnLoginButton();


//        // Save the text of the product for later verify
//        String productOnScreenText = driver.findElement(By.xpath("//*[@id=\"1\"]/p")).getText();
//        // Click on add to cart button
//        driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
//
//        // See if the cart is opened or not
//        Assert.assertTrue(driver.findElement(By.cssSelector(".float\\-cart__content")).isDisplayed());
//
//        // Check the product inside the cart is same as of the main page
//        String productOnCartText = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/div[3]/p[1]")).getText();
//        Assert.assertEquals(productOnScreenText, productOnCartText);
    }
}
