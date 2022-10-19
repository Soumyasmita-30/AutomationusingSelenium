package com.basics.OrangeHrm;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

public class normal {

    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
        driver = new Setup().chromeSetup();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        driver.findElement(By.xpath("//p[text()='Paul Collings']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Logout']")).click();

        driver.quit();
    }
}
