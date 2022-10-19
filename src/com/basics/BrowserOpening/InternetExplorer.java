package com.basics.BrowserOpening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class InternetExplorer  {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
        driver =  new InternetExplorerDriver();

        driver.get("https://www.google.com/");
        // driver.get("https://www.youtube.com/");
        // driver.close();
    }
}
