package com.basics.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsInSelenium {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Coders Arcade", Keys.ENTER);
//explicit wait

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
      //  driver.findElement(By.partialLinkText("Coders Arcade - Educational Institution in RR Nagar")).click();
        WebElement webLink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Coders Arcade - Educational Institution in RR Nagar")));
        webLink.click();
       // driver.quit();

        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);
         WebElement review = driver.findElement(By.linkText("Write a Review"));
         fluentWait.until(ExpectedConditions.visibilityOf(review));
         review.click();

        driver.quit();
    }
}