package pages.pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class LinkedInPage extends BasePage {

    private By LOGO = By.xpath("//icon[@data-test-id='nav-logo']");

    public LinkedInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogo() {
        return driver.findElement(LOGO);
    }

    public boolean isLogoDisplayed() {
        return getLogo().isDisplayed();
    }

    public LinkedInPage switchToLinkedInTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        return this;
    }

    public LinkedInPage waitUntilPageOpened() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGO));
        return this;
    }


}
