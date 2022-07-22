package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.time.format.SignStyle;

public class AddItemToShoppingCardTest extends BaseTest {

    private final String USERNAME = "standard_user";
    private final String PASSWORD = "secret_sauce";

    @Test
    public void addingItemToShoppingCardTest() {

        driver.get(Urls.LOGIN_PAGE_URL);
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys(USERNAME);
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(PASSWORD);
        driver.findElement(By.cssSelector("#login-button")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.className("shopping_cart_link")).click();

        //Add check
        String actualPrice = driver.findElement(By.className("inventory_item_price")).getText();
        boolean isActualPriceMatched = actualPrice.contains("29.99");
        String actualItemName = driver.findElement(By.className("inventory_item_name")).getText();
        boolean isActualItemNameMatched = actualItemName.contains("Sauce Labs Backpack");
        Assert.assertTrue(isActualPriceMatched, "Price doesn't match!");
        Assert.assertTrue(isActualItemNameMatched, "Item name doesn't match!");


    }

}
