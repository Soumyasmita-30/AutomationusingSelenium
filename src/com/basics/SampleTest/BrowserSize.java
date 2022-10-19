package com.basics.SampleTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSize {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //method1 using variable
        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();
        System.out.println("Height is : " +height);
        System.out.println("width is : " +width);

        //method2 using dimension class
        Dimension size = driver.manage().window().getSize();
        System.out.println("height is : " +size.getHeight());
        System.out.println("Width is : " +size.getWidth());

        driver.manage().window().setSize(new Dimension(800,600));
        Thread.sleep(1000);


        int x = driver.manage().window().getPosition().getX();
        int y = driver.manage().window().getPosition().getY();
        System.out.println("x position: " +x+ " y position:" +y);

        //Position of window : taking point class
        Point position = driver.manage().window().getPosition();
        System.out.println("x position :"+ position.getX() + "y position :" +position.getY());
         driver.manage().window().setPosition(new Point(500,100));
         Thread.sleep(1000);
         driver.close();


    }
}
