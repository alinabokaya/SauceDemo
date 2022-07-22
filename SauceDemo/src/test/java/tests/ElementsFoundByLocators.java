package tests;

import org.openqa.selenium.By;

public class ElementsFoundByLocators {

    By loginBtn = By.className("submit-button");
    By loginForm1 = By.tagName("form");
    By aboutSidebarLink1 = By.linkText("About");
    By aboutSidebarLink2 = By.partialLinkText("out");

    By addToCardBtnFull = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"); //поиск по атрибуту
    By bikeLightTitleFull = By.xpath("//div[text()='Sauce Labs Bike Light']"); //поиск по тексту
    By addToCardBtnPartial = By.xpath("//button[contains(@name,'backpack')]"); //поиск по частичному совпадению атрибута
    By bikeLightTitlePartial = By.xpath("//div[contains(text(),'Bike')]"); //поиск по частичному совпадению текста
    By aboutSidebarLinkAncestor = By.xpath("//a[contains(text(), 'About')]//ancestor::div[2]");
    By aboutSidebarLinkParent = By.xpath("//a[contains(text(), 'About')]//parent::nav");
    By userNameInput = By.xpath("//input[@type='text' and @id='user-name']");

    By errorMessageContainer = By.cssSelector(".error-message-container");
    By loginButton = By.cssSelector("#login-button");
    By loginForm2 = By.cssSelector("<form>");
    By loginContainer1 = By.cssSelector("[id^=login_butt]");
    By loginContainer2 = By.cssSelector("[id$=container]");
    By allIdWithLoginText = By.cssSelector("[id*=login]");
    By headerContainer1 = By.cssSelector("#header_container > div:first-child");
    By headerContainer2 = By.cssSelector("#header_container > div:nth-child(1)");


}
