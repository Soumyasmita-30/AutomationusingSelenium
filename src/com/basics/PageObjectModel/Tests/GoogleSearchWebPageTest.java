package com.basics.PageObjectModel.Tests;

import com.basics.Common.Setup;
import com.basics.PageObjectModel.Pages.GoogleSearchWebPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchWebPageTest {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver= new Setup().chromeSetup();
        driver.get("https://www.google.com");
        GoogleSearchWebPage.searchBox(driver).sendKeys("Selenium");
        GoogleSearchWebPage.searchButton(driver).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.quit();

    }

}
