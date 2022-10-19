package com.basics.TestNG.AssertionsInTestNG;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
    private static WebDriver driver;
    @Test
    public void openApplication(){
        driver = new Setup().chromeSetup();
        driver.get("https://www.saucedemo.com/");
String title = driver.getTitle();
        Assert.assertEquals(title,"Swag Labs","Title Mismatch");

    }@Test(dependsOnMethods ="openApplication" )
    public void loginTest() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
    }@Test(dependsOnMethods = "loginTest")
    public void closeApplication(){
        driver.quit();
    }
}
