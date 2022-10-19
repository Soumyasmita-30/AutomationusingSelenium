package com.basics.PageObjectModel.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//page factory
public class GSPageObjects {
    WebDriver driver = null;
    //This webdriver instance is null.When we call methods ,we use a different driver instance.
    //from different tests
    //So we need constructor

    public GSPageObjects(WebDriver driver){
        this.driver = driver;
    }
    By searchBox = By.name("q");
    By searchButton = By.name("btnK");

    public void setSearchBox(String text){
        driver.findElement(searchBox).sendKeys(text);

    }
    public void clickSearchButton(){
        driver.findElement(searchButton).sendKeys("btnK");

    }
}
