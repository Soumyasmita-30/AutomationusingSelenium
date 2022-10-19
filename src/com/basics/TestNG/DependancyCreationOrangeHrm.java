package com.basics.TestNG;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DependancyCreationOrangeHrm {
    private static WebDriver driver;
    @Test
    void openBrowser1() throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = "openBrowser1")
    void loginToApplication1() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = "loginToApplication1")
    void quit(){

        driver.quit();
    }

}
