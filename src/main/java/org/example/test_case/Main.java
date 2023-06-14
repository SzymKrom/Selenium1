package org.example.test_case;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\szymo\\OneDrive\\Pulpit\\Repozytoria\\Selenium\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.loginClick();
        loginPage.enterUserName("gunjankaushik");
        loginPage.enterPassword("Password@123");
        loginPage.clickLogin();




    }
}

//*[@id="accept-choices"]