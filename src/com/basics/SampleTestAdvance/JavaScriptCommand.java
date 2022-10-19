package com.basics.SampleTestAdvance;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptCommand {
    private static WebDriver driver;

    public static void main(String[] args) {
        driver= new Setup().chromeSetup();
        driver.get("https://www.google.com");

        JavascriptExecutor js = (JavascriptExecutor)  driver;
        WebElement searchBox = driver.findElement(By.name("q"));
        js.executeScript("arguments[0].value='Selenium';",searchBox);
        WebElement button = driver.findElement(By.cssSelector(".RNmpXc"));//inspect I am feeling lucky
        js.executeScript("arguments[0].click();",button);
        js.executeScript("console.log('Hello World..!!')");//click on inspect and click on console and check
    }
}
