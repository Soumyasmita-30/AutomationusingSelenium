package com.basics.PageObjectModel.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Swaglab {
    static WebElement element = null;

    public static WebElement user(WebDriver driver) {
        element = driver.findElement(By.id("user-name"));
        return element;
    }

    public static WebElement pass(WebDriver driver) {
        element = driver.findElement(By.id("password"));
        return element;
    }
    public static WebElement login(WebDriver driver) {
        element = driver.findElement(By.id("login-button"));
        return element;
    }
}
