package tests;

import models.LoginPageModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.LinkedInPage;
import pages.pompages.LoginPage;
import pages.pompages.ProductsPage;
import testdata.PrepareRegistrationData;
import utils.RetryAnalyzer;

public class LinkedInTest extends BaseTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void checkLinkedInLogoTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();

        LoginPageModel loginPageModel = PrepareRegistrationData.getValidStandardLoginData();
        loginPage
                .inputUsername(loginPageModel.getUsername())
                .inputPassword(loginPageModel.getPassword())
                .clickLoginButton();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage
                .waitUntilPageOpened()
                .openLinkedInNewTab();

        LinkedInPage linkedInPage = new LinkedInPage(driver);
        linkedInPage
                .switchToLinkedInTab()
                .waitUntilPageOpened();

        //Add check
        Assert.assertTrue(linkedInPage.isLogoDisplayed(), "LinkedIn logo is not displayed!");


    }


}
