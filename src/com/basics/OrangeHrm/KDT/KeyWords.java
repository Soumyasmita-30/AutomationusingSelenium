package com.basics.OrangeHrm.KDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyWords {
    public static WebDriver driver;

    public static void openBrowser(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
    public static void navigateToUrl() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);
    }
    public static void Username() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(1000);
    }
    public  static void Password() throws InterruptedException {
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);
    }
    public static void Login() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        Thread.sleep(1000);
    }
    public static void Dropdown() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
Thread.sleep(1000);
    }
    public static void Logout() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        Thread.sleep(1000);
    }
    public static void closeBrowser(){
        driver.quit();
    }
}

