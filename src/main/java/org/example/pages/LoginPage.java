package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By userName = By.id("userName");
    By password = By.id("password");
    By login = By.id("login");
    public void enterUserName(String user) {
        driver.findElement(userName).sendKeys(user);
    }

}
