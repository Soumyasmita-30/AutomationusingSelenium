package com.basics.KeyBoardActionsInSelenium;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeys {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);

        Actions builder = new Actions(driver);
        Action keyDown = builder.keyDown(Keys.CONTROL).sendKeys("A").build();//building command
        keyDown.perform();//perform action
        Thread.sleep(1000);
        driver.quit();

    }
}
