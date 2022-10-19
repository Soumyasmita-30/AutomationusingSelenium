package com.basics.PageObjectModel.Tests;

import com.basics.Common.Setup;
import com.basics.PageObjectModel.Pages.GSPageObjects;
import org.openqa.selenium.WebDriver;

public class GSPageObjectsTests {
    static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        googleSearchTest();

    }
    public static void googleSearchTest() throws InterruptedException {
        driver = new Setup().chromeSetup();
        GSPageObjects obj = new GSPageObjects(driver);
        driver.get("https://www.google.com");
        obj.setSearchBox("Selenium");
        Thread.sleep(2000);
        obj.clickSearchButton();
        driver.quit();

    }

}
