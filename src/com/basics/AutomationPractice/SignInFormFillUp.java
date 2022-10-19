package com.basics.AutomationPractice;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class SignInFormFillUp {
    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        driver = new Setup().chromeSetup();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath(" //a[@class= 'login']")).click();
        driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("psr@gmail.com");
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pst@gmail.com");
        driver.findElement(By.xpath("//i[@class='icon-user left']")).click();
        driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("soumya");
        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Sahoo");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("12345");
        WebElement d1 = driver.findElement(By.name("days"));
        Select s1 = new Select(d1);
        s1.selectByValue("5");

        WebElement d2 = driver.findElement(By.id("months"));
        Select s2 = new Select(d2);
        s2.selectByValue("6");

        WebElement d3 = driver.findElement(By.id("years"));
        Select s3 = new Select(d3);
        s3.selectByValue("2017");

        //firstname  lastname company address1 city
        driver.findElement(By.id("firstname")).sendKeys("soumya");
        driver.findElement(By.id("lastname")).sendKeys("sahoo");
        driver.findElement(By.id("company")).sendKeys("ibm");
        driver.findElement(By.id("address1")).sendKeys("bhubaneswar");
        driver.findElement(By.id("city")).sendKeys("bhubaneswar");
//state
        WebElement d4 = driver.findElement(By.id("id_state"));
        Select s4 = new Select(d4);
        s4.selectByValue("5");

        driver.findElement(By.id("postcode")).sendKeys("12345");

        WebElement d5 = driver.findElement(By.id("id_country"));
        Select s5 = new Select(d5);
        s4.selectByValue("21");


        driver.findElement(By.id("phone_mobile")).sendKeys("1234567891");
        driver.findElement(By.id("alias")).sendKeys("");
        driver.findElement(By.id("submitAccount")).click();

    }
}
