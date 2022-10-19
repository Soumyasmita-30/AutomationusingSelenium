package com.basics.xpath.Cannonical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4 {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ultimateqa.com/automation/");
        Thread.sleep(1000);
       String fli = driver.findElement(By.xpath("//a[text()='Learn how to automate an application that evolves over time']//following::li[2]")).getText();
        System.out.println("Text :" +fli);
        Thread.sleep(1000);
        String pli = driver.findElement(By.xpath("//a[text()='Learn how to automate an application that evolves over time']//preceding::li[2]")).getText();
        System.out.println("Text :" +pli);
        driver.quit();
    }
}
