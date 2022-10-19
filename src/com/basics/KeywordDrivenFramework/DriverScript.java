package com.basics.KeywordDrivenFramework;

import java.io.IOException;

public class DriverScript {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        String filePath = "./resources/Keywords.xlsx";
        UtilityExcelFile.setExcelFile(filePath, "Sheet1");

        for (int i = 1; i < 7; i++) {
            String actionKeyword = UtilityExcelFile.getCellData(i, 0);
            if (actionKeyword.equalsIgnoreCase("openBrowser")) {
                ActionKeywords.openBrowser();
            } else if (actionKeyword.equalsIgnoreCase("navigateToUrl")) {
                ActionKeywords.navigateToUrl();
            } else if (actionKeyword.equalsIgnoreCase("inputUsername")) {
                ActionKeywords.inputUsername();
            } else if (actionKeyword.equalsIgnoreCase("inputPassword")) {
                ActionKeywords.inputPassword();
            } else if (actionKeyword.equalsIgnoreCase("clickLogin")) {
                ActionKeywords.clickLogin();
            } else if (actionKeyword.equalsIgnoreCase("closeBrowser")) {
                ActionKeywords.closeBrowser();
            }
        }
        System.out.println("task completed");
    }
}


