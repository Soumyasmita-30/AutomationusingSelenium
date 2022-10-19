package com.basics.Waits;

import com.basics.Common.Setup;
import org.openqa.selenium.WebDriver;

public class UsingThesetup {
    private static WebDriver driver;

    public static void main(String[] args) {
        driver= new Setup().chromeSetup();
        driver.get("https://www.google.com/");
    }

}
