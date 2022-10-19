package com.basics.FramesInSelenium;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Frames {
    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        driver = new Setup().chromeSetup();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

        driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("Action")).click();
        Thread.sleep(5000);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.linkText("org.openqa.selenium")).click();

    }
}
