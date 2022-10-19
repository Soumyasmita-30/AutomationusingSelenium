package com.basics.OrangeHrm.KDT;

import java.io.IOException;

public class Scripts {
    public static void main(String[] args) throws IOException, InterruptedException {
       // System.setProperty("webdriver.chrome.driver ", "./Drivers/chromedriver.exe");
      //  String filePath = "./resources/Keywords.xlsx";
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        String filePath = "./resources/Keywords.xlsx";
        ExcelFiles.setExcel(filePath, "Sheet2");

        for (int i = 1; i < 9; i++) {
            String keyWord = ExcelFiles.getCell(i, 0);
            if (keyWord.equalsIgnoreCase("openBrowser")) {
                KeyWords.openBrowser();
            } else if (keyWord.equalsIgnoreCase("navigateToUrl")) {
                KeyWords.navigateToUrl();
            } else if (keyWord.equalsIgnoreCase("Username")) {
                KeyWords.Username();
            } else if (keyWord.equalsIgnoreCase("Password")) {
                KeyWords.Password();
            } else if (keyWord.equalsIgnoreCase("Login")) {
                KeyWords.Login();
            } else if (keyWord.equalsIgnoreCase("Dropdown")) {
                KeyWords.Dropdown();
            } else if (keyWord.equalsIgnoreCase("Logout")) {
                KeyWords.Logout();

            } else if (keyWord.equalsIgnoreCase("closeBrowser")) {
                KeyWords.closeBrowser();
            }
        }
        System.out.println("task completed");
    }
}