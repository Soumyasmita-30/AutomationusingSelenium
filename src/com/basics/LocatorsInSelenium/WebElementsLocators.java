package com.basics.LocatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElementsLocators {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().window().maximize();
        //normal
        driver.get("https://www.google.com");
        Thread.sleep(1000);
      //  driver.findElement(By.name("q")).sendKeys("Selenium");
       // driver.findElement(By.name("btnK")).click();

        //proper/standard
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium",Keys.ENTER);
        Thread.sleep(2000);

        //locate multiple elements
        driver.navigate().to("https://trytestingthis.netlify.app/");
        Thread.sleep(1000);
        List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
        for(WebElement option : options){
            System.out.println(option.getText());}

//css selector
        driver.findElement(By.cssSelector("#fname")).sendKeys("Soumya");

        Thread.sleep(1000);
        driver.quit();
    }
}

