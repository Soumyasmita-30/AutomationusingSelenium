package com.basics.BrowserOpening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Edge {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
        driver =  new EdgeDriver();

        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.facebook.com");
        // driver.get("https://www.youtube.com/");
        // driver.close();
    }
}

