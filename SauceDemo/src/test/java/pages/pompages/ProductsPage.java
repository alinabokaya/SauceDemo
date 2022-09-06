package pages.pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage extends BasePage {

    private By ADD_TO_CART_BUTTON = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    private By LINKEDIN_BUTTON = By.xpath("//a[contains(text(), 'LinkedIn')]");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public ProductsPage addToCartButton() {
        driver.findElement(ADD_TO_CART_BUTTON).click();
        return this;
    }

    public ProductsPage waitUntilPageOpened() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LINKEDIN_BUTTON));
        return this;
    }

    public ProductsPage openLinkedInNewTab() {
        driver.findElement(LINKEDIN_BUTTON).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
        return this;
    }


}
