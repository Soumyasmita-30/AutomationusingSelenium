package com.basics.TestNG;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DependancyCreation {
    private static WebDriver driver;
    @Test
    void openBrowser() throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
    }@Test(dependsOnMethods = "openBrowser")
    void loginToApplication() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
    }@Test(dependsOnMethods = "loginToApplication")
    void quit(){

        driver.quit();
    }

}
