package com.basics.DropDowns;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class StoreDropdownIntoLists {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new Setup().chromeSetup();
        driver.get("https://trytestingthis.netlify.app/");
        WebElement dropDown = driver.findElement(By.id("option"));
        Select select = new Select(dropDown);

        List<WebElement> allOptions = select.getOptions();

        for(WebElement option : allOptions) {
            System.out.println(option.getText());
            if (option.getText().equalsIgnoreCase("option 2")) ;
            option.click();
        }
            System.out.println("Clicked successfully");
        driver.quit();
    }
}
