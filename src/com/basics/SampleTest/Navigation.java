package com.basics.SampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();

        //driver.get("https://www.google.com");
        driver.get("https://www.google.com/");
       // driver.get("https://www.youtube.com/");
       // driver.close();
       // String url = driver.getCurrentUrl();
       // System.out.println("The current url is :" +url);
       // String title = driver.getTitle();
       // System.out.println("Title is :" +title);
        Thread.sleep(1000);

        driver.navigate().to("https:www.selenium.dev");
        Thread.sleep(1000);
       // driver.navigate().to("https:www.flipkart.com");
       // Thread.sleep(1000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("xyz@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
       // driver.navigate().refresh();
        Thread.sleep(1000);
        //driver.close();

    }
}
