package com.browserstack.pages;

import com.browserstack.SeleniumTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends SeleniumTest {

    @FindBy(id = "login-btn")
    private WebElement loginButton;

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//h3[@class='api-error']")
    private WebElement errorMessage;

    @FindBy(xpath = "//a[@class='Navbar_logo__26S5Y']")
    private WebElement headerLogo;

    @FindBy(xpath = "//*[@id='Sign In' or text()='Sign In']")
    private WebElement signInButton; // Adjusted locator assuming correct XPath


    public void load(WebDriver driver) {
        this.driver= driver;
        this.driver.get("https://testathon.live/");

    }


    public boolean verifyHeader() {
        return headerLogo.isDisplayed();
    }

    public LoginPage clickSignInButton() {
        signInButton.click();
        return this;
    }

    public boolean verifySignButtonIsVisible() {
        return signInButton.isDisplayed();
    }

    public boolean verifyLoginButtonIsVisible() {
        return loginButton.isDisplayed();
    }

    public LoginPage clickOnLoginButton() {
        loginButton.click();
        return this;
    }

    public LoginPage clickOnUserNameOption() {
        usernameInput.click();
        return this;
    }

    public LoginPage enterUserName(String user) {
        usernameInput.sendKeys(user);
        return this;
    }

    public boolean verifyUsernameFieldIsVisible() {
        return usernameInput.isDisplayed();
    }

    public boolean verifyPasswordFieldIsVisible() {
        return passwordInput.isDisplayed();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
