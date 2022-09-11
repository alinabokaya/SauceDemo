package pages.services;

import constants.Credentials;
import org.openqa.selenium.WebDriver;
import pages.pompages.LoginPage;

public class LoginService {

    private WebDriver driver;

    public LoginService(WebDriver driver) {
        this.driver = driver;
    }

    public void setLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.inputUsername(Credentials.USERNAME);
        loginPage.inputPassword(Credentials.PASSWORD);
        loginPage.clickLoginButton();
    }

}
