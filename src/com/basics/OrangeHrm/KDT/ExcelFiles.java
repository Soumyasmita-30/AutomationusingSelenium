package com.basics.OrangeHrm.KDT;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFiles {
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public static void setExcel(String path,String sheetName) throws IOException {
        FileInputStream fiss = new FileInputStream(path);
        workbook = new XSSFWorkbook(fiss);
        sheet = workbook.getSheet(sheetName);
    }
    public static String getCell(int row,int column){
        Cell c1 = sheet.getRow(row).getCell(column);
        String c2 = c1.getStringCellValue();
        return c2;
    }


    }

