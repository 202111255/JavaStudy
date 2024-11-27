package com.exam;

import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class ExcelEx01 {
    public static void main(String[] args) {
        Workbook workbook = null;

        try {
            workbook = Workbook.getWorkbook(new File("./jxlrwtest.xls"));
            System.out.println(workbook.getVersion());
            System.out.println(workbook.getNumberOfSheets());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (BiffException e) {
            throw new RuntimeException(e);
        } finally {
            if (workbook != null) {
                workbook.close();
            }
        }
    }
}
