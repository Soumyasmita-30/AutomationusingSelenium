package com.basics.PageObjectModel.Tests;

import com.basics.Common.Setup;
import com.basics.PageObjectModel.Pages.GoogleSearchWebPage;
import com.basics.PageObjectModel.Pages.Swaglab;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SwagLabTests {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver= new Setup().chromeSetup();
        driver.get("https://www.saucedemo.com/");
        Swaglab.user(driver).sendKeys("standard_user");
        Swaglab.pass(driver).sendKeys("secret_sauce");
        Swaglab.login(driver).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
