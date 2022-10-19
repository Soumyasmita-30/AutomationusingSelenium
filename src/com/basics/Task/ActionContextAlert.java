package com.basics.Task;

import com.basics.Common.Setup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class ActionContextAlert {
    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(right);
        builder.contextClick().perform();
        driver.findElement(By.xpath("//span[text()='Quit']")).click();

        Alert a1 = driver.switchTo().alert();
        String s1 = a1.getText();
        Thread.sleep(1000);
        System.out.println("Alert text :" +s1);
        a1.accept();
        Thread.sleep(2000);
        driver.quit();
    }
}
