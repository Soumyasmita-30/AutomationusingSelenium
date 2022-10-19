package com.basics.KeyBoardActionsInSelenium;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.time.Duration;

public class Registration {

    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        driver = new Setup().chromeSetup();

        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register") ;
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Soumya");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("Sahoo")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("xyz@gmail.com")
                .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                .sendKeys("1234567891")
                        .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                                .sendKeys("12345")
                        .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                                .sendKeys("12345")
                        .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                        .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                        .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                        .sendKeys(Keys.SPACE)//to click on the square box
                        .sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
                        .sendKeys(Keys.ENTER).build().perform();
                Thread.sleep(2000);


    }
}

