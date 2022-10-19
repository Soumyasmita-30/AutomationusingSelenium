package com.basics.SampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ElementIsSelectedEnabled {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type ='checkbox'])[1]"));
        System.out.println(checkBox1.isEnabled());
        System.out.println(checkBox1.isSelected());
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type ='checkbox'])[2]"));
        System.out.println(checkBox2.isEnabled());
        System.out.println(checkBox2.isSelected());
        Thread.sleep(1000);
        driver.quit();

    }
}
