package com.basics.MouseActions;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class Contextclick {
    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        WebElement boxA = driver.findElement(By.xpath("//li[text()='A']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(boxA);
        builder.contextClick().build().perform();
    }
}
