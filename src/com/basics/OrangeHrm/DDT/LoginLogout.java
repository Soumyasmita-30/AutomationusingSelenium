package com.basics.OrangeHrm.DDT;

import com.basics.Common.Setup;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginLogout {
    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        driver = new Setup().chromeSetup();
        int successfulLoginCount = 0;
        int unsuccessfulLoginCount = 0;

        FileInputStream filePath = new FileInputStream("C:\\Users\\HP\\IdeaProjects\\AutomationUsingSelenium\\resources\\Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);
        XSSFSheet sheet = workbook.getSheet("Sheet4");
        int rowCount = sheet.getLastRowNum();
        System.out.println("No of records in excel sheet :" + rowCount);

        for (int row = 1; row <= rowCount; row++) {
            XSSFRow current_row = sheet.getRow(row);
            String Username = current_row.getCell(0).getStringCellValue();
            String Password = current_row.getCell(1).getStringCellValue();

            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.findElement(By.name("username")).sendKeys(Username);
            driver.findElement(By.name("password")).sendKeys(Password);
            driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

            Thread.sleep(2000);

            String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
            String actualUrl = driver.getCurrentUrl();

            System.out.println("Actual Url :" + row + " : " + actualUrl);
            System.out.println("Expected Url :" + row + " : " + expectedUrl);

            if (actualUrl.equalsIgnoreCase(expectedUrl)) {
                System.out.println(" login successful for record :" + row);
                System.out.println();
                successfulLoginCount = successfulLoginCount + 1;

                driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
                Thread.sleep(2000);
                WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));

                Actions action = new Actions(driver);
                action.moveToElement(logout).click().build().perform();
                Thread.sleep(3000);
            } else {
                System.out.println("login unsuccessful for record :" + row);
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