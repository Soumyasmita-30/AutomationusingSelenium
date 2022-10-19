package com.basics.MouseActions;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class ScrollingActions {
    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://www.tutorialspoint.com/index.htm");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        WebElement sDE=driver.findElement(By.xpath("(//span[@class='text-green'])[1]"));
        String sDT = sDE.getText();
        System.out.println("scroll down element :"+sDT);

        WebElement sUE = driver.findElement(By.xpath("(//a[@href='https://www.tutorialspoint.com/codingground.htm\'])[1]"));
        String sUT = sUE.getText();
        System.out.println("Scroll Up Element text :"+sUT);
        Thread.sleep(2000);
       // driver.quit();

    }
}
