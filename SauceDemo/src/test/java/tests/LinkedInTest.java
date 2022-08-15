package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.LinkedInPage;
import pages.pompages.ProductsPage;
import pages.services.LoginService;

public class LinkedInTest extends BaseTest {

    @Test
    public void checkLinkedInLogoTest() {

        LoginService loginService = new LoginService(driver);
        loginService.setLogin();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.removeImplicitlyWait();
        productsPage.openLinkedInNewTab();

        LinkedInPage linkedInPage = new LinkedInPage(driver);
        linkedInPage.switchToLinkedInTab();
        linkedInPage.waitUntilPageOpened();

        //Add check
        Assert.assertTrue(linkedInPage.isLogoDisplayed(), "LinkedIn logo is not displayed!");


    }


}
