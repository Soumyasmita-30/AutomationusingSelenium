package com.basics.SampleTestAdvance;

import com.basics.Common.Setup;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenshotsInSelenium {
    private static WebDriver driver;

    public static void main(String[] args) throws IOException {
        driver = new Setup().chromeSetup();

        //screenshot of webpage
        driver.get("https://www.google.com/");
        File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot1,new File("./screenshot1.png"));

        //screenshot of webelement/image
        WebElement google = driver.findElement(By.cssSelector(".lnXdpd"));
        File screenshot2 = google.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot2,new File("./screenshot2.png"));

        driver.quit();

    }
}
