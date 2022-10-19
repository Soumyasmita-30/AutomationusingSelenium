package com.basics.KeyBoardActionsInSelenium;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ReleasingTheKeys {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://www.google.com");

        Actions actions = new Actions(driver);
        WebElement searchBox = driver.findElement(By.name("q"));
        actions.keyDown(Keys.SHIFT).sendKeys(searchBox,"selenium")
                .keyUp(Keys.SHIFT).sendKeys(searchBox,"selenium").perform();
        Thread.sleep(1000);
        searchBox.clear();

    }
}
