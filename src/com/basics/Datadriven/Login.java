package com.basics.Datadriven;

import com.basics.Common.Setup;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.IOException;

public class Login {

    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        driver = new Setup().chromeSetup();
        int successfulLoginCount = 0;
        int unsuccessfulLoginCount = 0;
        //setting the path of workbook
        FileInputStream filePath = new FileInputStream("C:\\Users\\HP\\IdeaProjects\\AutomationUsingSelenium\\resources\\Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);
        XSSFSheet sheet = workbook.getSheet("Sheet3");//providing the sheet name
        int rowCount = sheet.getLastRowNum();//19
        System.out.println("no of records in the excel sheet :" + rowCount);

        for (int row = 1; row <= rowCount; row++) {
            XSSFRow current_row = sheet.getRow(row);//store current row
            String User_name = current_row.getCell(0).getStringCellValue();
            String Password = current_row.getCell(1).getStringCellValue();

            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys(User_name);
            driver.findElement(By.id("password")).sendKeys(Password);
            driver.findElement(By.id("login-button")).click();

            Thread.sleep(2000);

            String expectedUrl = "https://www.saucedemo.com/inventory.html";
            String actualUrl = driver.getCurrentUrl();

            System.out.println("Actual Url :" + row + " : " + actualUrl);
            System.out.println("Expected Url :" + row + " : " + expectedUrl);

            if (actualUrl.equalsIgnoreCase(expectedUrl)) {
                System.out.println("login successful for Record " + row);
                System.out.println();
                successfulLoginCount = successfulLoginCount + 1;

                driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
                Thread.sleep(2000);
                WebElement logOut = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));

                Actions action = new Actions(driver);
                action.moveToElement(logOut).click().build().perform();
                Thread.sleep(3000);
            }
            else {
                System.out.println("login Unsuccessful for record" + row);
                System.out.println();
                unsuccessfulLoginCount = unsuccessfulLoginCount + 1;
            }
        }

        System.out.println("data driven test completed");
        System.out.println("successful login count :" + successfulLoginCount);
        System.out.println("Unsuccessful login count :" + unsuccessfulLoginCount);

        driver.quit();
        workbook.close();
        filePath.close();
    }
}




