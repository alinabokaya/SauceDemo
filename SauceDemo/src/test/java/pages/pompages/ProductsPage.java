package pages.pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{

    private By ADD_TO_CART_BUTTON = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void addToCartButton() {
        driver.findElement(ADD_TO_CART_BUTTON).click();
    }


}
