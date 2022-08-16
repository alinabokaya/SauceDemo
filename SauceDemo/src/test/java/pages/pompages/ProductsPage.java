package pages.pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProductsPage extends BasePage {

    private By ADD_TO_CART_BUTTON = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    private By LINKEDIN_BUTTON = By.xpath("//a[contains(text(), 'LinkedIn')]");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void addToCartButton() {
        driver.findElement(ADD_TO_CART_BUTTON).click();
    }

    public void removeImplicitlyWait() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public void openLinkedInNewTab() {
        driver.findElement(LINKEDIN_BUTTON).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
    }


}
