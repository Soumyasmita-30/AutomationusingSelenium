package com.basics.SampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsInSelenium {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
         //String baseWindow = driver.getWindowHandle();//to save or go back to this url again
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        String baseWindow = driver.getWindowHandle();
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);//new tab will open in earlier one
        Thread.sleep(2000);
        driver.switchTo().window(baseWindow);

       // driver.close();//close only current one
        driver.quit();
    }
    }
