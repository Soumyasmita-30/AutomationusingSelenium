package com.basics.AlertsInSelenium;

import com.basics.Common.Setup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandlingElerts {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver= new Setup().chromeSetup();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert1 = driver.switchTo().alert();
        String t1=alert1.getText();
        Thread.sleep(1000);
        System.out.println("Alert text :" +t1);
        alert1.accept();
        Thread.sleep(1000);
        if(driver.getPageSource().contains("You successfully clicked an alert"));
        System.out.println("Clicked Ok Successfully");
        System.out.println("-------------------------------");

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(1000);
        String t2= alert2.getText();
        System.out.println("Alert text:" +t2);
        alert2.dismiss();
        Thread.sleep(1000);
        if(driver.getPageSource().contains("You clicked: Cancel"))
            System.out.println("Clicked cancel Successfully");
        System.out.println("-------------------------------");


        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(1000);
        String t3= alert2.getText();
        System.out.println("Alert text:" +t3);
        alert3.sendKeys("Selenium With Java");
        Thread.sleep(1000);
        alert3.accept();
        if(driver.getPageSource().contains("You entered : Selenium With Java"))
            System.out.println("Entered text to prompt successfully");
        System.out.println("-----------------------");
        Thread.sleep(1000);
        driver.quit();

    }
}
