package com.basics.KeyBoardActionsInSelenium;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EnterKey {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
        driver.quit();
    }
}
