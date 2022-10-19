package com.basics.DropDowns;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver= new Setup().chromeSetup();
        driver.get("https://trytestingthis.netlify.app/");
        WebElement dropDown = driver.findElement(By.id("option"));
        Select select = new Select(dropDown);
        Thread.sleep(1000);
        select.selectByIndex(1);
        Thread.sleep(1000);
        select.selectByValue("option 2");
        Thread.sleep(1000);
        select.selectByVisibleText("Option 3");

        //Deselecting Operation
        WebElement dropDown1 = driver.findElement(By.id("owc"));
        Select select1 = new Select(dropDown1);
        select1.selectByIndex(1);
        Thread.sleep(1000);
        select1.selectByValue("option 2");
        Thread.sleep(1000);
        select1.selectByVisibleText("Option 3");
        Thread.sleep(1000);
        select1.deselectByVisibleText("Option 3");
        Thread.sleep(1000);

        driver.quit();
        System.out.println("Task completed");

    }
}
