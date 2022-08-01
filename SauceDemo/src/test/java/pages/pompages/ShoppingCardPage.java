package pages.pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCardPage extends BasePage {

    private By SHOPPING_CART = By.className("shopping_cart_link");
    private By ITEM_PRICE = By.className("inventory_item_price");
    private By ITEM_NAME = By.className("inventory_item_name");

    public ShoppingCardPage(WebDriver driver) {
        super(driver);
    }

    public void openShoppingCart() {
        driver.findElement(SHOPPING_CART).click();
    }

    public boolean getItemPrice() {
        return driver.findElement(ITEM_PRICE).getText().contains("29.99");
    }

    public boolean getItemName() {
        return driver.findElement(ITEM_NAME).getText().contains("Sauce Labs Backpack");
    }

}
