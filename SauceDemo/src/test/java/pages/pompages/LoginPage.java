package pages.pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By USERNAME_INPUT = By.id("user-name");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.cssSelector("#login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openLoginPage() {
        driver.get(Urls.LOGIN_PAGE_URL);
    }

    public void inputUsername(String username) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);

    }

    public void inputPassword(String password) {
        driver.findElement(PASSWORD_INPUT).sendKeys(password);

    }

    public void clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }

}
