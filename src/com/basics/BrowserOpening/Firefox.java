package com.basics.BrowserOpening;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
        driver = new FirefoxDriver();

        driver.get("https://www.google.com/");
        // driver.get("https://www.youtube.com/");
        // driver.close();
    }
}
