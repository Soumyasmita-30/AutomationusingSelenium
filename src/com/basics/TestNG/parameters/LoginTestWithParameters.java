package com.basics.TestNG.parameters;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestWithParameters {
    private static WebDriver driver;
@Test
@Parameters({"url","username","password"})
    public void LoginWithParameter(String url,String username,String password){
        driver= new Setup().chromeSetup();
        driver.get(url);
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        driver.quit();
    }
}
