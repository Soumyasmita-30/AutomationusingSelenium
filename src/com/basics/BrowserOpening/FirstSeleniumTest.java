package com.basics.BrowserOpening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
         driver = new ChromeDriver();
        //driver.get("https://www.google.com");
        driver.get("https://www.google.com/");
       // driver.get("https://www.youtube.com/");
        driver.close();
       // String url = driver.getCurrentUrl();
       // System.out.println("The current url is :" +url);
       // String title = driver.getTitle();
       // System.out.println("Title is :" +title);
    }
}
