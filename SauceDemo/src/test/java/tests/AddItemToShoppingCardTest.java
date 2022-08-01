package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.ProductsPage;
import pages.pompages.ShoppingCardPage;
import pages.services.LoginService;


public class AddItemToShoppingCardTest extends BaseTest {


    @Test
    public void addingItemToShoppingCardTest() {

        LoginService loginService = new LoginService(driver);
        loginService.setLogin();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addToCartButton();

        ShoppingCardPage shoppingCardPage = new ShoppingCardPage(driver);
        shoppingCardPage.openShoppingCart();


        //Add check
        Assert.assertTrue(shoppingCardPage.getItemPrice(), "Price doesn't match!");
        Assert.assertTrue(shoppingCardPage.getItemName(), "Item name doesn't match!");


    }

}
