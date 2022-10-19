package com.basics.xpath.Relative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ParaBankRegistration {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[text()='Register']")).click();
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Soumya");
        driver.findElement(By.xpath("//input[@name='customer.lastName']")).sendKeys("Sahoo");
        driver.findElement(By.xpath("//input[@name='customer.address.street']")).sendKeys("chanda.rr nagar");
        driver.findElement(By.xpath("//input[@name='customer.address.city']")).sendKeys("banglore");
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("karnataka");
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("560098");
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("9584456788");
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("080-2345678");
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("dry@gmail.com");
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("12345ghj");
        driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("12345ghj");
        driver.findElement(By.xpath("//input[@type='submit']")).click();



    }
}
