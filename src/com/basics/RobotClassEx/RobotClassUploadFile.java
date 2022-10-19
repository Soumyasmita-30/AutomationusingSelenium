package com.basics.RobotClassEx;

import com.basics.Common.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotClassUploadFile {
    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
        driver = new Setup().chromeSetup();
        driver.manage().window().maximize();
        driver.get("https://resume.naukri.com/resume-quality-score ");
        driver.findElement(By.xpath("//span[@class='browse']")).click();
        //Create a object of Robot Class
        //Absract Window Toolkiy
        Robot robot = new Robot();
        //store the path of the file to be uploaded
        //By using the StringSelection Class
        StringSelection filepath= new StringSelection("C:\\Users\\HP\\Desktop\\NEW\\application form.pdf");
        //Copying the path of the document into the Clipboard using Toolkit Class

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
        //Press the Control Button & V Button for pasting the path into the address box

        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);
//release the keays
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
//press and relese the enter keys
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(5000);

        System.out.println("task completed successfully");
       // driver.quit();

    }
}
