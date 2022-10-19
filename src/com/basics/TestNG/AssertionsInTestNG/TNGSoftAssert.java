package com.basics.TestNG.AssertionsInTestNG;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TNGSoftAssert {

    SoftAssert softAssert = new SoftAssert();//creating the object of softassert
    private static WebDriver driver;

    @Test
    public void sampleLoginTest() throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        softAssert.assertEquals(title, "Swag Lab", "mismatch");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        softAssert.assertEquals(false,true);
    Thread.sleep(1000);
        driver.quit();
        //here
        softAssert.assertAll();
    }
}
