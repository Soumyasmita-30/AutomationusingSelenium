package com.basics.TestNG;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestWithAnnotationOrangeHrm {
    static WebDriver driver;
@BeforeTest
    public void testSetUp1(){
        driver = new Setup().chromeSetup();

    }
    @Test
    public void loginTest1() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

        Thread.sleep(2000);

        String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
        String actual = driver.getCurrentUrl();

        Assert.assertEquals(expected,actual);

       /* if (actual.equalsIgnoreCase(expected)) {
            System.out.println("login successful");

        } else {
            System.out.println("unsuccessful");

        }*/
    }@AfterTest
        public void tearDown1(){
        driver.quit();
    }
    }

