package com.basics.FramesInSelenium;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Frame2 {

    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://demoqa.com/frames");


        driver.switchTo().frame(driver.findElement(By.id("frame1")));
      String text1 = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("text of frame1 is :" +text1);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.id("frame2")));
        String text2 = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("text of frame2 is :"+text2);


    }
}
